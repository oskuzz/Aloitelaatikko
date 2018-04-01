package Tietovarastopakkaus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tietovarasto {

    // Yhteysmuuttujat
    private String ajuri;
    private String url;
    private String kayttajatunnus;
    private String salasana;
    private static Kayttaja kayttaja;
    public static String vaihe;
    public static boolean login = true;
    public String ryhma;

    public Tietovarasto(String ajuri, String url, String kayttajatunnus, String salasana) {
        this.ajuri = ajuri;
        this.url = url;
        this.kayttajatunnus = kayttajatunnus;
        this.salasana = salasana;
    }

    public Tietovarasto() {
        this("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/aloitelaatikko", "root", "");
    }

    public String getRyhma() {
        return kayttaja.getRyhma();
    }

    public static int getKayttajaID() {
        return kayttaja.getKayttajaID();
    }

    public static String getVaihe() {
        return vaihe;
    }

    public static boolean getLogin() {
        return login;
    }

    public static void setLogin(boolean login) {
        Tietovarasto.login = login;

    }

    public boolean lisaaKayttaja(Kayttaja kayttaja) {

        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {
            // Otetaan yhteys tietokantaan
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            // Jos yhteyttä ei saada niin palautetaan false
            if (yhteys == null) {
                return false;
            }

            // Määritellään SQL-lauseet lisäystä varten
            String lisaaKayttajaSQL = "insert into kayttajat values(?,?,?,?,?,?,?,?,?)";

            // Valmistellaan SQL-lause tietokantapalvelinta varten
            lisayslause = yhteys.prepareStatement(lisaaKayttajaSQL);

            lisayslause.setInt(1, kayttaja.getKayttajaID());
            lisayslause.setString(2, kayttaja.getEtunimi());
            lisayslause.setString(3, kayttaja.getSukunimi());
            lisayslause.setString(4, kayttaja.getEmail());
            lisayslause.setString(5, kayttaja.getKayttajatunnus());
            lisayslause.setString(6, kayttaja.getSalasana());
            lisayslause.setString(7, kayttaja.getPuhelin());
            lisayslause.setString(8, kayttaja.getLuontipaivays());
            lisayslause.setString(9, kayttaja.getRyhma());

            // Suoritetaan palvelimella SQL-lause
            return lisayslause.executeUpdate() > 0;

        } catch (Exception ex) {
            // Jos tuli virhe niin hypätään tänne
            ex.getMessage();
            return false;

        } finally {
            // Suljetaan yhteys tietokantaan
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public boolean lisaaAloite(Aloite aloite) {

        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {
            // Otetaan yhteys tietokantaan
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            // Jos yhteyttä ei saada niin palautetaan false
            if (yhteys == null) {
                return false;
            }

            // Määritellään SQL-lauseet lisäystä varten
            String lisaaAloiteSQL = "insert into aloite values(?,?,?,?,?)";

            // Valmistellaan SQL-lause tietokantapalvelinta varten
            lisayslause = yhteys.prepareStatement(lisaaAloiteSQL);

            lisayslause.setInt(1, aloite.getAloiteID());
            lisayslause.setString(2, aloite.getAloitenimi());
            lisayslause.setString(3, aloite.getAloitekuvaus());
            lisayslause.setString(4, aloite.getPvm());
            lisayslause.setInt(5, aloite.getKayttajaID());

            // Suoritetaan palvelimella SQL-lause
            return lisayslause.executeUpdate() > 0;

        } catch (Exception ex) {
            // Jos tuli virhe niin hypätään tänne
            ex.getMessage();
            return false;

        } finally {
            // Suljetaan yhteys tietokantaan
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    public boolean lisaaToimenpide(Toimenpide toimenpide) {

        Connection yhteys = null;
        PreparedStatement lisayslause = null;

        try {
            // Otetaan yhteys tietokantaan
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            // Jos yhteyttä ei saada niin palautetaan false
            if (yhteys == null) {
                return false;
            }

            // Määritellään SQL-lauseet lisäystä varten
            String lisaaToimenpideSQL = "insert into toimenpiteet values(?,?,?,?,?,?)";

            // Valmistellaan SQL-lause tietokantapalvelinta varten
            lisayslause = yhteys.prepareStatement(lisaaToimenpideSQL);

            lisayslause.setInt(1, toimenpide.getToimenpideID());
            lisayslause.setString(2, toimenpide.getKuvaus());
            lisayslause.setString(3, toimenpide.getPvm());
            lisayslause.setInt(4, toimenpide.getKayttajaID());
            lisayslause.setInt(5, toimenpide.getAloiteID());
            lisayslause.setString(6, toimenpide.getVaihe());

            // Suoritetaan palvelimella SQL-lause
            return lisayslause.executeUpdate() > 0;

        } catch (Exception ex) {
            // Jos tuli virhe niin hypätään tänne
            ex.getMessage();
            return false;

        } finally {
            // Suljetaan yhteys tietokantaan
            YhteydenHallinta.suljeLause(lisayslause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }

    }

    public boolean haeKayttaja(String kayttajatunnus, String salasana) {

        Connection yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, this.salasana);
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;
        if (yhteys == null) {
            return false;
        }

        try {
            String hakuSQL = "select * from kayttajat where kayttajatunnus=?";
            hakulause = yhteys.prepareStatement(hakuSQL);
            hakulause.setString(1, kayttajatunnus);
            tulosjoukko = hakulause.executeQuery();

            if (tulosjoukko.next()) {
                kayttaja = new Kayttaja(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getString(5), tulosjoukko.getString(6), tulosjoukko.getString(7), tulosjoukko.getString(8), tulosjoukko.getString(9));
            }

            if (kayttaja.getKayttajatunnus().equals(kayttajatunnus) && kayttaja.getSalasana().equals(salasana)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            // Jos tuli virhe niin hypätään tänne
            ex.printStackTrace();
            return false;

        } finally {
            // Suljetaan yhteys tietokantaan
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public static String haeRyhma() {
        return kayttaja.getRyhma();
    }

    public List<Aloite> haeKaikkiAloitteet() {
        List<Aloite> aloitteet = new ArrayList<Aloite>();

        Connection yhteys = null;
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, salasana);
            if (yhteys != null) {
                String haeKaikkiSQL = "select * from aloite";

                hakulause = yhteys.prepareStatement(haeKaikkiSQL);
                tulosjoukko = hakulause.executeQuery();

                while (tulosjoukko.next()) {
                    Aloite aloite = new Aloite(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getInt(5));
                    aloitteet.add(aloite);
                }
            }
        } catch (Exception ex) {

        } finally {

            YhteydenHallinta.suljeTulosjoukko(tulosjoukko);
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);

        }
        return aloitteet;
    }

    public List<Kayttaja> haeKaikkiKayttajat() {
        List<Kayttaja> kayttajat = new ArrayList<Kayttaja>();

        Connection yhteys = null;
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, salasana);
            if (yhteys != null) {
                String haeKaikkiSQL = "select * from kayttajat";

                hakulause = yhteys.prepareStatement(haeKaikkiSQL);
                tulosjoukko = hakulause.executeQuery();

                while (tulosjoukko.next()) {
                    Kayttaja kayttaja = new Kayttaja(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getString(5), tulosjoukko.getString(6), tulosjoukko.getString(7), tulosjoukko.getString(8), tulosjoukko.getString(9));
                    kayttajat.add(kayttaja);
                }
            }
        } catch (Exception ex) {

        } finally {

            YhteydenHallinta.suljeTulosjoukko(tulosjoukko);
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);

        }
        return kayttajat;
    }

    public boolean poistaToimenpide(int aloiteID) {
        Connection yhteys = null;
        PreparedStatement hakulause = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String poistaToimenpideSQL = "delete from toimenpiteet where aloiteID=?";
            hakulause = yhteys.prepareStatement(poistaToimenpideSQL);

            hakulause.setInt(1, aloiteID);
            return hakulause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public boolean toimenpideTehty(int aloiteID) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        ResultSet tulosjoukko = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "select vaihe from toimenpiteet where aloiteID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setInt(1, aloiteID);
            tulosjoukko = lisayslause.executeQuery();

            if (tulosjoukko.next()) {
                vaihe = tulosjoukko.getString(1);
                return true;
            } else {
                return false;
            }

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

    public boolean aloitteenMuokkaaminen(int aloiteID, String aloiteNimi, String aloiteKuvaus) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "update aloite set aloitenimi=?, aloitekuvaus=? where aloiteID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setString(1, aloiteNimi);
            lisayslause.setString(2, aloiteKuvaus);
            lisayslause.setInt(3, aloiteID);
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

    public boolean muokkaaKayttaja(int kayttajaID, String etunimi, String sukunimi, String email, String kayttajatunnus, String salasana, String puhelin, String luontipaivays, String ryhma) {
        Connection yhteys = null;
        PreparedStatement lisayslause = null;
        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, this.kayttajatunnus, this.salasana);
            if (yhteys == null) {
                return false;
            }

            String SQL = "update kayttajat set etunimi=?, sukunimi=?, email=?, kayttajatunnus=?, salasana=?, puhelin=?, luontipaivays=?, ryhma=? where kayttajaID=?";
            lisayslause = yhteys.prepareStatement(SQL);
            lisayslause.setString(1, etunimi);
            lisayslause.setString(2, sukunimi);
            lisayslause.setString(3, email);
            lisayslause.setString(4, kayttajatunnus);
            lisayslause.setString(5, salasana);
            lisayslause.setString(6, puhelin);
            lisayslause.setString(7, luontipaivays);
            lisayslause.setString(8, ryhma);
            lisayslause.setInt(9, kayttajaID);

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

    public boolean poistaAloite(int aloiteID) {
        poistaToimenpide(aloiteID);
        Connection yhteys = null;
        PreparedStatement hakulause = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String poistaAloiteSQL = "delete from aloite where aloiteID=?";
            hakulause = yhteys.prepareStatement(poistaAloiteSQL);

            hakulause.setInt(1, aloiteID);
            return hakulause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public boolean poistaKayttaja(int kayttajaID) {
        Connection yhteys = null;
        PreparedStatement hakulause = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return false;
            }

            String poistaKayttajaSQL = "delete from kayttajat where kayttajaID=?";
            hakulause = yhteys.prepareStatement(poistaKayttajaSQL);

            hakulause.setInt(1, kayttajaID);
            return hakulause.executeUpdate() > 0;

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return false;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
    }

    public Aloite haeAloite(int aloiteID) {
        Connection yhteys = null;
        PreparedStatement hakulause = null;
        ResultSet tulosjoukko = null;

        Aloite aloite = null;

        try {
            yhteys = YhteydenHallinta.avaaYhteys(ajuri, url, kayttajatunnus, salasana);
            if (yhteys == null) {
                return null;
            }

            String haeKaikkiSQL = "select * from aloite where aloiteID=?";

            hakulause = yhteys.prepareStatement(haeKaikkiSQL);
            hakulause.setInt(1, aloiteID);
            tulosjoukko = hakulause.executeQuery();

            while (tulosjoukko.next()) {
                aloite = new Aloite(tulosjoukko.getInt(1), tulosjoukko.getString(2), tulosjoukko.getString(3), tulosjoukko.getString(4), tulosjoukko.getInt(5));
            }

        } catch (SQLException ex) {
            // Jos tuli virhe, niin hypätään tänne
            ex.printStackTrace();
            return null;
        } finally {
            // Suljetaan yhteysx tietokantaa
            YhteydenHallinta.suljeLause(hakulause);
            YhteydenHallinta.suljeYhteys(yhteys);
        }
        return aloite;
    }
}
