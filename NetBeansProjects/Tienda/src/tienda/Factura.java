package tienda;

public class Factura extends Producto {

    double preciof, descuento = 0;
    int dia;
    int mes;
    int año;

    public Factura(double preciof, int dia, int mes, int año, String nombrep, long codigo, int cantidad, double precio) {
        super(nombrep, codigo, cantidad, precio);
        this.preciof = preciof;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public double preciof(double preciof) {

        preciof = cantidad * precio;
        return preciof;
    }

    public void imprimird() {
        System.out.println("Nombre producto: " + getNombrep());
        System.out.println("Codigo producto:" + getCodigo());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Precio total: " + preciof);
        System.out.println("Fecha de compra: " + dia + "/" + mes + "/" + año);
        System.out.println("Descuento: No aplica");
        System.out.println("____________________________________________________");
        System.out.println("Feliz dia! Vuelva pronto.");

    }

}
