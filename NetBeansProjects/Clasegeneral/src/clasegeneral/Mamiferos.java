
package clasegeneral;

public class Mamiferos extends Animal {
    
    private String pelaje;
    private String procedencia;
    private String color;

    public Mamiferos(String pelaje, String procedencia, String color, String nombrean, String tipo, String raza) {
        super(nombrean, tipo, raza);
        this.pelaje = pelaje;
        this.procedencia = procedencia;
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        System.out.println("Su pelaje es: " + this.pelaje);
        System.out.println("Tipo mamifero: " + this.tipo);
        System.out.println("Raza: " + this.raza);
        
    }
    
    
        
}
