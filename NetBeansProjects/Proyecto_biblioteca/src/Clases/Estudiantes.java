
package Clases;

public class Estudiantes extends Lectores {
    int cod_E;

    public Estudiantes(int cod_E, String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
        this.cod_E = cod_E;
    }

    public Estudiantes(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }
    

    public int getCod_E() {
        return cod_E;
    }

    public void setCod_E(int cod_E) {
        this.cod_E = cod_E;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
}
