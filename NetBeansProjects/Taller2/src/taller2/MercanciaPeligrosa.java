/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author salacomputocentro.ba
 */
public class MercanciaPeligrosa extends Mercancia {
    
    double sueldo;
    
    public MercanciaPeligrosa(double toneladas, int HorasConducidas, int idC) {
        super(toneladas, HorasConducidas, idC);
        setTipoTransporte("Mercancía Peligrosa");
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void CalcularSMP() {
        double tem = 15000 * super.getHorasConducidas();
        double ExtrH = 7000 * super.getToneladas();
        double FijoExtra = 150000;
        this.sueldo = tem + ExtrH + FijoExtra;
    }
    
}
