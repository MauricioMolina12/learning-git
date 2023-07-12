/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ASUS
 */
public class prestamos {
    
    String nombre;
    int id;
    String libro;
    int can;

    public prestamos(String nombre, int id, String libro, int can) {
        this.nombre = nombre;
        this.id = id;
        this.libro = libro;
        this.can = can;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nId: " + id + "\nLibro: " + libro + "\nCantidad: " + can;
    }

    
    
    
    
    
    
}
