
package Clases;

public class Cliente {
    
    protected int mesa;
    protected int comensales;

    public Cliente(int mesa, int comensales) {
        this.mesa = mesa;
        this.comensales = comensales;
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
