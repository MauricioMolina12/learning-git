
package objetosyclasesveterinaria;

public class Perros {
    
    String nombre;
    String raza;
    String genero;
    int edad;
    String color;
    String procedencia;
    String nombred;
    String apellidod;

    public Perros(String nombre, String raza, String genero, int edad, String color, String procedencia, String nombred, String apellidod) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.color = color;
        this.procedencia = procedencia;
        this.nombred = nombred;
        this.apellidod = apellidod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getNombred() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public String getApellidod() {
        return apellidod;
    }

    public void setApellidod(String apellidod) {
        this.apellidod = apellidod;
    }

   
    public void imprimir (String nombre, String raza, String genero, int edad, String color, String procedencia, String nombred, String apellidod) {
        System.out.println("Nombre de la mascota: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Genero: " + this.genero);
        System.out.println("Edad: " + this.edad + " año(s)");
        System.out.println("Color: " + this.color);
        System.out.println("Procedencia: " + this.procedencia);
        System.out.println("Nombre del dueño: " + this.nombred + " " + this.apellidod);
    }
       
    
    
    
    
}
