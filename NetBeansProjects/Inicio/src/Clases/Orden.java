
package Clases;

import java.util.ArrayList;

public class Orden extends Cliente {
    
    protected String hora;
    protected String mesero;
    protected ArrayList<Bebida> bebidas;
    protected ArrayList<Platillo> platillos;

    public Orden(String hora, String mesero, ArrayList<Bebida> bebidas, ArrayList<Platillo> platillos, int mesa, int comensales) {
        super(mesa, comensales);
        this.hora = hora;
        this.mesero = mesero;
        this.bebidas = bebidas;
        this.platillos = platillos;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }
    
    

    
    
}
