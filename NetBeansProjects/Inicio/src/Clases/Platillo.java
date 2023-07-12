
package Clases;

public class Platillo {
    
    protected String tipop;
    protected int cantidadp;

    public Platillo(String tipop, int cantidadp) {
        this.tipop = tipop;
        this.cantidadp = cantidadp;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }

    public int getCantidadp() {
        return cantidadp;
    }

    public void setCantidadp(int cantidadp) {
        this.cantidadp = cantidadp;
    }
    
    
    
}
