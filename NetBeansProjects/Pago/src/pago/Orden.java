
package pago;

public class Orden {
    
    private int cantidadb;
    private String tipob;
    private int cantidadp;
    private String tipop;
    private int mesa;
    private int comensales;
    private String mesero;
    private int hora;

    public Orden(int cantidadb, String tipob, int cantidadp, String tipop, int mesa, int comensales, String mesero, int hora) {
        this.cantidadb = cantidadb;
        this.tipob = tipob;
        this.cantidadp = cantidadp;
        this.tipop = tipop;
        this.mesa = mesa;
        this.comensales = comensales;
        this.mesero = mesero;
        this.hora = hora;
    }

    

    

    public int getCantidadb() {
        return cantidadb;
    }

    public void setCantidadb(int cantidadb) {
        this.cantidadb = cantidadb;
    }

    public String getTipob() {
        return tipob;
    }

    public void setTipob(String tipob) {
        this.tipob = tipob;
    }

    public int getCantidadp() {
        return cantidadp;
    }

    public void setCantidadp(int cantidadp) {
        this.cantidadp = cantidadp;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
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

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void pedido (){
        System.out.println("Mesero: " + this.mesero);
        System.out.println("Hora: " + this.hora);
        System.out.println("# mesa: " + this.mesa);
        System.out.println("# comensales: " + this.comensales);
        System.out.println("Tipo de platillo: " + this.tipop);
        System.out.println("Cantidad de platillos: " + this.cantidadp);
        System.out.println("Tipo de bebida: " + this.tipob);
        System.out.println("Cantidad de bebidas: " + this.cantidadb);
        
    }
    
}
