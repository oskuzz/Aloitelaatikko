/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietovarastopakkaus;

/**
 *
 * @author s1601396
 */
public class Aloite {

    private int aloiteID;
    private String aloitenimi;
    private String aloitekuvaus;
    private String pvm;
    private String kayttajaID;

    public Aloite(int aloiteID, String aloitenimi, String aloitekuvaus, String pvm, String kayttajaID) {
        this.aloiteID = aloiteID;
        this.aloitenimi = aloitenimi;
        this.aloitekuvaus = aloitekuvaus;
        this.pvm = pvm;
        this.kayttajaID = kayttajaID;
    }

    public int getAloiteID() {
        return aloiteID;
    }

    public String getAloitenimi() {
        return aloitenimi;
    }

    public String getAloitekuvaus() {
        return aloitekuvaus;
    }

    public String getKayttajaID() {
        return kayttajaID;
    }

    public String getPvm() {
        return pvm;
    }

}
