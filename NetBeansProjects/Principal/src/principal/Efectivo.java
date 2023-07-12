package principal;

public class Efectivo extends Pago {

    double cantidad;

    public Efectivo(double cantidad, double subtotal, double propina, double impuestos) {
        super(subtotal, propina, impuestos);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void pagarefectivo(double subtotal, double propina, double impuestos, double efectivo) {

        efectivo = subtotal + propina + impuestos;
        System.out.println("Efectivo a pagar: " + efectivo);

    }

}
