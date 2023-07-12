/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author ASUS
 */
public class Sala {

    private int IDS;
    private int NME;
    private String utilidad;

    public Sala(int IDS, int NME) {
        this.IDS = IDS;
        this.NME = NME;
        this.utilidad = "Disponible";
    }

    public int getIDS() {
        return IDS;
    }

    public void setIDS(int IDS) {
        this.IDS = IDS;
    }

    public int getNME() {
        return NME;
    }

    public void setNME(int NME) {
        this.NME = NME;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad() {
        this.utilidad = "Ocupado";
    }

    public String disponibilidad() {

        return utilidad;
    }

}
