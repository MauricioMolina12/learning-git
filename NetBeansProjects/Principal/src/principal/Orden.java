
package principal;

public class Orden {
    
    String hora;
    String mesero;
    cliente cantidad;
    Pago pago;
    Bebida bebidas;
    Platillo platillos;

    public Orden(String hora, String mesero, cliente cantidad, Pago pago, Bebida bebidas, Platillo platillos) {
        this.hora = hora;
        this.mesero = mesero;
        this.cantidad = cantidad;
        this.pago = pago;
        this.bebidas = bebidas;
        this.platillos = platillos;
    }
   

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public cliente getCantidad() {
        return cantidad;
    }

    public void setCantidad(cliente cantidad) {
        this.cantidad = cantidad;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Bebida getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida bebidas) {
        this.bebidas = bebidas;
    }

    public Platillo getPlatillos() {
        return platillos;
    }

    public void setPlatillos(Platillo platillos) {
        this.platillos = platillos;
    }
    
    public void factura (){
        System.out.println("el numero de comensales es: "+cantidad.comensales);
        System.out.println("");
        System.out.println("Hora orden: "+this.hora);
        System.out.println("");
        System.out.println("Nombre mesero: "+this.mesero);
        System.out.println("");
        System.out.println("Número de mesa: " + cantidad.mesa);
        System.out.println("");
        System.out.println("Tipo bebida: "+bebidas.tipobebida);
        System.out.println("");
        System.out.println("Cantidad bebida: "+bebidas.cantidadbebida);
        System.out.println("");
        System.out.println("Tipo platillo: "+platillos.tipoplatillo);
        System.out.println("");
        System.out.println("Cantidad platillo: "+platillos.cantidadplatillo);
        System.out.println("");
        System.out.println("Sub total: "+pago.subtotal);
        System.out.println("");
        System.out.println("Impuestos: "+pago.impuestos);
        System.out.println("");
        System.out.println("Propina: "+pago.propina);
        
    }

}