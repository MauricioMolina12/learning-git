
package Clases;

public class Docentes extends Lectores{
    
    int cod_D;
    
    public Docentes(int cod_D, String nombre, String direccion,int telefono) {
        super(nombre, direccion, telefono);
        this.cod_D = cod_D;
    }

    public Docentes(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    
    public int getCod_D() {
        return cod_D;
    }

    public void setCod_D(int cod_D) {
        this.cod_D = cod_D;
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
