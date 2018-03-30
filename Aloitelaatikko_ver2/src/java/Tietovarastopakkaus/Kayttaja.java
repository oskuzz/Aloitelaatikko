package Tietovarastopakkaus;

public class Kayttaja {

    private int kayttajaID;
    private String etunimi;
    private String sukunimi;
    private String email;
    private String kayttajatunnus;
    private String salasana;
    private String puhelin;
    private String luontipaivays;
    private String ryhma;

    public Kayttaja(int kayttajaID, String etunimi, String sukunimi, String email, String kayttajatunnus, String salasana, String puhelin, String luontipaivays, String ryhma) {
        this.kayttajaID = kayttajaID;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
        this.kayttajatunnus = kayttajatunnus;
        this.salasana = salasana;
        this.puhelin = puhelin;
        this.luontipaivays = luontipaivays;
        this.ryhma = ryhma;
    }

    public int getKayttajaID() {
        return kayttajaID;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public String getEmail() {
        return email;
    }

    public String getKayttajatunnus() {
        return kayttajatunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public String getPuhelin() {
        return puhelin;
    }

    public String getLuontipaivays() {
        return luontipaivays;
    }
    
    public String getRyhma() {
        return ryhma;
    }
    
    

}
