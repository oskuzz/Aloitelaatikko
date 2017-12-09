/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietovarastopakkaus;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author haaar
 */
public class Tietovarasto {

    /**
     * Yhteysmuuttujat
     */
    private String ajuri;
    private String url;
    private String kayttajatunnus;
    private String salasana;
    private static Kayttaja kayttaja;
    private String vaihe;

    /**
     *
     * @param ajuri ajurin osoite
     * @param url tietokannan osoite
     * @param kayttajatunnus tietokannan käyttäjätunnus
     * @param salasana tietokannan salasana
     */
    public Tietovarasto(String ajuri, String url, String kayttajatunnus, String salasana) {
        this.ajuri = ajuri;
        this.url = url;
        this.kayttajatunnus = kayttajatunnus;
        this.salasana = salasana;
    }

    public Tietovarasto() {
        this("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/aloitelaatikko", "root", "");
    }

    /**
     * hakee kirjautuneen käyttäjän ID:n
     *
     * @return palauttaa käyttäjäID:n
     */
    public static int getKayttajaID() {
        return kayttaja.getKayttajaID();
    }

    public String getVaihe() {
        return vaihe;
    }

    /**
     * hakee ryhmän johon kirjautunut käyttäjä kuuluu
     *
     * @return palauttaa käyttäjän ryhmän
     */
    public static String haeRyhma() {
        return kayttaja.getRyhma();
    }

    public ArrayList<Aloite> kayttajanAloitteet(int kayttajaID) {
        ArrayList<Aloite> aloitteet = new ArrayList<>();
        Connection yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, salasana);
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        if (yhteys == null) {
            return null;
        }
        try {
            String SQL = "select * from aloite where kayttajaID=?";
            hakulause = yhteys.prepareStatement(SQL);
            hakulause.setInt(1, kayttajaID);
            tulosjoukko = hakulause.executeQuery();
            while (tulosjoukko.next()) {
                Aloite aloite = new Aloite(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getString(5));
                aloitteet.add(aloite);
            }
            return aloitteet;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public boolean olemassaolevaToimenpide(int aloiteID) {
        Connection yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, salasana);
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        if (yhteys == null) {
            return false;
        }
        try {
            String SQL = "select vaihe from toimenpiteet where aloiteID=?";
            hakulause = yhteys.prepareStatement(SQL);
            hakulause.setInt(1, aloiteID);
            tulosjoukko = hakulause.executeQuery();

            if (tulosjoukko.next()) {
                vaihe = tulosjoukko.getString(1);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public boolean aloitteenMuokkaaminen(int aloiteID, String aloiteNimi, String aloiteKuvaus, String pvm) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "update aloite set aloitenimi=?, aloitekuvaus=?, pvm=?  where aloiteID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setString(1, aloiteNimi);
            lisayslause.setString(2, aloiteKuvaus);
            lisayslause.setString(3, pvm);
            lisayslause.setInt(4, aloiteID);
            return lisayslause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    /**
     * toimenpiteen poistaminen aloiteID avulla
     *
     * @param aloiteID aloitteen id
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean toimenpiteenPoistaminen(int aloiteID) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "delete from toimenpiteet where aloiteID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setInt(1, aloiteID);
            return lisayslause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    /**
     * aloitteen poistaminen aloiteID avulla
     *
     * @param aloiteID aloitteen id
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean aloitteenPoistaminen(int aloiteID) {
        toimenpiteenPoistaminen(aloiteID);
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "delete from aloite where aloiteID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setInt(1, aloiteID);
            return lisayslause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    /**
     * hakee aloitteet listaan aloite olioina
     *
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public ArrayList<Aloite> haeKaikkiAloitteet() {
        ArrayList<Aloite> aloitteet = new ArrayList<>();
        Connection yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, salasana);
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        if (yhteys == null) {
            return null;
        }
        try {
            String SQL = "select * from aloite";
            hakulause = yhteys.prepareStatement(SQL);
            tulosjoukko = hakulause.executeQuery();
            while (tulosjoukko.next()) {
                Aloite aloite = new Aloite(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getString(5));
                aloitteet.add(aloite);
            }
            return aloitteet;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    /**
     * hakee käyttäjän käyttäjätunnuksen avulla ja testaa jos annettu
     * käyttäjätunnus ja salasana täsmäävät
     *
     * @param kayttajatunnus no kirjautumista yrittävän käyttäjän käyttäjänimi
     * @param salasana on kirjautumista yrittävän käyttäjän salasana
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean haeKayttaja(String kayttajatunnus, String salasana) {
        Connection yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, this.salasana);
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        if (yhteys == null) {
            return false;
        }
        try {

            String SQL = "select * from kayttajat where kayttajatunnus=?";
            hakulause = yhteys.prepareStatement(SQL);
            hakulause.setString(1, kayttajatunnus);
            tulosjoukko = hakulause.executeQuery();
            if (tulosjoukko.next()) {
                kayttaja = new Kayttaja(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getString(5), tulosjoukko.getString(6), tulosjoukko.getString(7), tulosjoukko.getString(8), tulosjoukko.getString(9));
            }

            if (kayttaja.getKayttajaTunnus().equals(kayttajatunnus) && kayttaja.getSalasana().equals(salasana)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    /**
     * lisää toimenpiteen tietokantaan
     *
     * @param toimenpide toimenpide olio
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean lisaaToimenpide(Toimenpide toimenpide) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {

            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "insert into toimenpiteet values(?,?,?,?,?,?)";

            lisayslause = yhteys.prepareStatement(SQL);

            lisayslause.setInt(1, toimenpide.getToimenpideID());
            lisayslause.setString(2, toimenpide.getKuvaus());
            lisayslause.setString(3, toimenpide.getPvm());
            lisayslause.setInt(4, toimenpide.getKayttajaID());
            lisayslause.setInt(5, toimenpide.getAloiteID());
            lisayslause.setString(6, toimenpide.getVaihe());

            return lisayslause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    /**
     * lisää aloitteen tietokantaan
     *
     * @param aloite aloite olio
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean lisaaAloite(Aloite aloite) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {

            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "insert into aloite values(?,?,?,?,?)";

            lisayslause = yhteys.prepareStatement(SQL);

            lisayslause.setInt(1, aloite.getAloiteID());
            lisayslause.setString(2, aloite.getAloitenimi());
            lisayslause.setString(3, aloite.getAloitekuvaus());
            lisayslause.setString(4, aloite.getPvm());
            lisayslause.setString(5, aloite.getKayttajaID());

            return lisayslause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    /**
     * lisää käyttäjän tietokantaan
     *
     * @param kayttaja käyttäjä olio
     * @return boolean arvo onnistuneesta toiminnasta
     */
    public boolean lisaaKayttaja(Kayttaja kayttaja) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {
            // Otetaan yhteys tietokantaan
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            //jos yhteyttä ei saada, niin palautetaan false
            if (yhteys == null) {
                return false;
            }

            // Määritellään lisäystä varten SQL-lauseet
            String SQL = "insert into kayttajat values(?,?,?,?,?,?,?,?,?)";

            // Valmistellaan SQL-lause tietokantapalvelinta varten
            lisayslause = yhteys.prepareStatement(SQL);

            lisayslause.setInt(1, kayttaja.getKayttajaID());
            lisayslause.setString(2, kayttaja.getEtunimi());
            lisayslause.setString(3, kayttaja.getSukunimi());
            lisayslause.setString(4, kayttaja.getEmail());
            lisayslause.setString(5, kayttaja.getKayttajaTunnus());
            lisayslause.setString(6, kayttaja.getSalasana());
            lisayslause.setString(7, kayttaja.getPuhelin());
            lisayslause.setString(8, kayttaja.getLuontipaivays());
            lisayslause.setString(9, kayttaja.getRyhma());
            // Suoritetaan palvelimella SQL-lause
            return lisayslause.executeUpdate() > 0;
        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }
}
