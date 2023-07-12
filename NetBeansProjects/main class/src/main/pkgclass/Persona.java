
package main.pkgclass;

abstract public class Persona {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private int codigoe;

    public Persona(String nombre, String apellido, int cedula, int codigoe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.codigoe = codigoe;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigoe() {
        return codigoe;
    }

    public void setCodigoe(int codigoe) {
        this.codigoe = codigoe;
    }
    
}
