
package Clases;

public class Bebida {
    
    private String tipob;
    private int cantidadb;

    public Bebida(String tipob, int cantidadb) {
        this.tipob = tipob;
        this.cantidadb = cantidadb;
    }

    public String getTipob() {
        return tipob;
    }

    public void setTipob(String tipob) {
        this.tipob = tipob;
    }

    public int getCantidadb() {
        return cantidadb;
    }

    public void setCantidadb(int cantidadb) {
        this.cantidadb = cantidadb;
    }

}