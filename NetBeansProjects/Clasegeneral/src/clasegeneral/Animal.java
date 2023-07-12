
package clasegeneral;

public class Animal {
    
    String nombrean;
    String tipo;
    String raza;

    public Animal(String nombrean, String tipo, String raza) {
        this.nombrean = nombrean;
        this.tipo = tipo;
        this.raza = raza;
    }

    public String getNombrean() {
        return nombrean;
    }

    public void setNombrean(String nombrean) {
        this.nombrean = nombrean;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public void imprimir() {
        System.out.println("Datos");
        System.out.println("Nombre animal: " + this.nombrean);
        System.out.println("Tipo animal: " + this.tipo);
        System.out.println("Raza: " + this.raza);
    }
    
    
}
