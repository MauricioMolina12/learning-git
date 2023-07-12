package supermercadometodo;

public class Cliente {

    String nombre;
    String apellido;
    String producto;
    double precio;
    int cantidad;
    double compra;
    double descuento;
    double tp;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String producto, double precio, int cantidad, double compra, double descuento, double tp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.compra = compra;
        this.descuento = descuento;
        this.tp = tp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;

    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public void imprimir(String nombre, String apellido, String producto, double precio, int cantidad, double compra, double descuento, double tp) {
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("Producto: " + this.producto);
        System.out.println("Precio del producto: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Compra: " + compra);
        System.out.println("El total a pagar: " + this.tp);

    }

}

