/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztaly;

/**
 *
 * @author Marci
 */
public class Kontakt {
    
    private String nev,telszam,varos,szuletesnap;
    private int irSzam;

    public Kontakt(String nev, String varos, String szuletesnap, int irSzam, String telszam) {
        this.nev = nev;
        this.varos = varos;
        this.szuletesnap = szuletesnap;
        this.irSzam = irSzam;
        this.telszam = telszam;
    }

    public String getNev() {
        return nev;
    }

    public String getVaros() {
        return varos;
    }

    public String getSzuletesnap() {
        return szuletesnap;
    }

    public int getIrSzam() {
        return irSzam;
    }

    public String getTelszam() {
        return telszam;
    }
    
    
}
