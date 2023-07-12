
package Clases;

public class Credito extends Pago {
    
    private String nombre;
    private int númerotarjeta;
    private String tipoc;
    private String fechaExp;

    public Credito(String nombre, int númerotarjeta, String tipoc, String fechaExp, double subtotal, double propina, double impuestos) {
        super(subtotal, propina, impuestos);
        this.nombre = nombre;
        this.númerotarjeta = númerotarjeta;
        this.tipoc = tipoc;
        this.fechaExp = fechaExp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNúmerotarjeta() {
        return númerotarjeta;
    }

    public void setNúmerotarjeta(int númerotarjeta) {
        this.númerotarjeta = númerotarjeta;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    
    public void hacercargo (double subtotal, double propina, double impuestos, double calculo){
        
        
        CalculoTotal(subtotal, propina,impuestos);
        System.out.println("Cargo exitoso! Se han cargado " + calculo + " a su tarjeta");
        
        
    }
}
