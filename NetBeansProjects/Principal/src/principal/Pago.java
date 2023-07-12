
package principal;

public class Pago {
    
    double subtotal;
    double propina;
    double impuestos;

    public Pago(double subtotal, double propina, double impuestos) {
        this.subtotal = subtotal;
        this.propina = propina;
        this.impuestos = impuestos;
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
    
    public double CalculoTotal(double subtotal,double propina,double impuestos) {
        double calculo=subtotal+propina+impuestos;
        return calculo;
    }
}
