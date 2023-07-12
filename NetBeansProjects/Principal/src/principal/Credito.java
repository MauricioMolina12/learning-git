
package principal;

public class Credito extends Pago {

int numeroTdeCredito;
String tipo;
String fechaDeExp;
String nombre;


    public Credito(int numeroTdeCredito, String tipo, String fechaDeExp, String nombre, double subtotal, double propina, double impuestos) {
        super(subtotal, propina, impuestos);
        this.numeroTdeCredito = numeroTdeCredito;
        this.tipo = tipo;
        this.fechaDeExp = fechaDeExp;
        this.nombre = nombre;
    }
       
    public int getNumeroTdeCredito() {
        return numeroTdeCredito;
    }

    public void setNumeroTdeCredito(int numeroTdeCredito) {
        this.numeroTdeCredito = numeroTdeCredito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaDeExp() {
        return fechaDeExp;
    }

    public void setFechaDeExp(String fechaDeExp) {
        this.fechaDeExp = fechaDeExp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void HacerCargo(double subtotal, double propina, double impuestos){
        double c;
        c = subtotal + propina + impuestos;
        System.out.println("REGISTRO A LA TARJETA EXITOSO!");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número de tarjeta: " + this.numeroTdeCredito);
        System.out.println("Fecha de expedición: " + this.fechaDeExp);
        System.out.println("Tipo de crédito: " + this.tipo);
        System.out.println("Cargo a tarjeta: " + c);
        
        
    }


    
}
