/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author salacomputocentro.ba
 */
public class Mercancia extends Transporte {

    private double toneladas;
    private double sueldo;

    public Mercancia(double toneladas, int HorasConducidas, int idC) {
        super(HorasConducidas, "Mercancía", idC);
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void CalcularSM() {
        double ExtrH;
        int c1 = 0;
        c1++;
        double tem = 15000 * super.getHorasConducidas();
        ExtrH = 7000 * this.toneladas;
        this.sueldo = tem + ExtrH;
    }

}
