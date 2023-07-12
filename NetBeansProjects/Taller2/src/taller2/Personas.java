/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author salacomputocentro.ba
 */
public class Personas extends Transporte {

    private int CantidadPersonas;
    private double sueldo;

    public Personas(int CantidadPersonas, int HorasConducidas, int idC) {
        super(HorasConducidas, "Personas", idC);
        this.CantidadPersonas = CantidadPersonas;
    }
    

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public void CalcularTP() {

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void CalcularSP() {
        double ExtrH;
        int c1 = 0;
        c1++;
        double tem = 15000 * super.getHorasConducidas();
        if (this.CantidadPersonas > 9) {
            ExtrH = 3500 * super.getHorasConducidas();
        } else {
            ExtrH = 2500 * super.getHorasConducidas();
        }
        this.sueldo =  tem + ExtrH;
    }

}
