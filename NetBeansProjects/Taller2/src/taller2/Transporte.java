/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

import java.util.ArrayList;

/**
 *
 * @author salacomputocentro.ba
 */
public abstract class Transporte {
    
    private int HorasConducidas;
    private String TipoTransporte;
    int idC;

    public Transporte(int HorasConducidas, String TipoTransporte, int idC) {
        this.HorasConducidas = HorasConducidas;
        this.TipoTransporte = TipoTransporte;
        this.idC = idC;
    }

    public Transporte() {
    }

    public int getHorasConducidas() {
        return HorasConducidas;
    }

    public void setHorasConducidas(int HorasConducidas) {
        this.HorasConducidas = HorasConducidas;
    }

    public String getTipoTransporte() {
        return TipoTransporte;
    }

    public void setTipoTransporte(String TipoTransporte) {
        this.TipoTransporte = TipoTransporte;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    
    
}
