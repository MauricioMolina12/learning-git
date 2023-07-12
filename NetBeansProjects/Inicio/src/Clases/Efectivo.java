
package Clases;

public class Efectivo extends Pago {
    
    private int cantidad_efectivo;

    public Efectivo(int cantidad_efectivo, double subtotal, double propina, double impuestos) {
        super(subtotal, propina, impuestos);
        this.cantidad_efectivo = cantidad_efectivo;
    }

    public int getCantidad_efectivo() {
        return cantidad_efectivo;
    }

    public void setCantidad_efectivo(int cantidad_efectivo) {
        this.cantidad_efectivo = cantidad_efectivo;
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
    
    public void pagar(double subtotal, double propina, double impuestos, double calculo){
        
        
        CalculoTotal(subtotal, propina,impuestos);
        System.out.println("Éxito en el pago. Cuenta saldada de " + calculo);
        
        
    }
    
    
    
}
