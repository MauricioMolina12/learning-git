/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author ASUS
 */
public class Venta {
    
    private String NombreObra;
    private int NumeroBoletos;

    public Venta(String NombreObra, int NumeroBoletos) {
        this.NombreObra = NombreObra;
        this.NumeroBoletos = NumeroBoletos;
    }

    public String getNombreObra() {
        return NombreObra;
    }

    public void setNombreObra(String NombreObra) {
        this.NombreObra = NombreObra;
    }

    public int getNumeroBoletos() {
        return NumeroBoletos;
    }

    public void setNumeroBoletos(int NumeroBoletos) {
        this.NumeroBoletos = NumeroBoletos;
    }
    
    @Override
    public String toString() {
        return "\nNombreObra: " + NombreObra + "\nNumeroBoletos=" + NumeroBoletos + "\n______________________________________" ;
    }
    
    
    
    
}
