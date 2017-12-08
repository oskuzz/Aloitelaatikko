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
public class Toimenpide {

    private int toimenpideID;
    private String kuvaus;
    private String pvm;
    private int kayttajaID;
    private int aloiteID;
    private String vaihe;

    public Toimenpide(int toimenpideID, String kuvaus, String pvm, int kayttajaID, int aloiteID, String vaihe) {
        this.toimenpideID = toimenpideID;
        this.kuvaus = kuvaus;
        this.pvm = pvm;
        this.kayttajaID = kayttajaID;
        this.aloiteID = aloiteID;
        this.vaihe = vaihe;
    }

    public String getVaihe() {
        return vaihe;
    }

    public int getToimenpideID() {
        return toimenpideID;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public String getPvm() {
        return pvm;
    }

    public int getKayttajaID() {
        return kayttajaID;
    }

    public int getAloiteID() {
        return aloiteID;
    }

}
