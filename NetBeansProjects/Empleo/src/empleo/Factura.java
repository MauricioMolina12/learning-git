
package empleo;

public class Factura {
    
    String nombre;
    int numcuenta;
    String servicio;
    int precio;

    public Factura(String nombre, int numcuenta, String servicio, int precio) {
        this.nombre = nombre;
        this.numcuenta = numcuenta;
        this.servicio = servicio;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public void imprimir (String nombre, int numcuenta, String servicio, int precio) {
        System.out.println("Nombre cliente: " + this.nombre);
        System.out.println("Numero de cuenta: " + this.numcuenta);
        System.out.println("Tipo de servicio: " + this.servicio);
        System.out.println("Precio: " + this.precio);
        
        
    }
    
    
}
