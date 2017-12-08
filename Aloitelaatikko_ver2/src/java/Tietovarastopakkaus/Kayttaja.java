package Tietovarastopakkaus;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haaar
 */
public class Kayttaja {
    
    private int kayttajaID;
    private String etunimi;
    private String sukunimi;
    private String email;
    private String kayttajaTunnus;
    private String salasana;
    private String puhelin; 
    private String luontipaivays;
    private String ryhma;

    public Kayttaja(int kayttajaID, String etunimi, String sukunimi, String email, 
            String kayttajaTunnus, String salasana, String puhelin, String luontipaivays, String ryhma) {
        this.kayttajaID = kayttajaID;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
        this.kayttajaTunnus = kayttajaTunnus;
        this.salasana = salasana;
        this.puhelin = puhelin;
        this.luontipaivays = luontipaivays;
        this.ryhma = ryhma;
    }

    public String getRyhma() {
        return ryhma;
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

    public String getKayttajaTunnus() {
        return kayttajaTunnus;
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
    

    
}
