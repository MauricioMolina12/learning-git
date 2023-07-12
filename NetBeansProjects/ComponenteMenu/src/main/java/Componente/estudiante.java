/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componente;

/**
 *
 * @author SOPORTE
 */
public class estudiante {
    
    private String nombre,id,programa;

    public estudiante(String nombre, String id, String programa) {
        this.nombre = nombre;
        this.id = id;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "\nESTUDIANTES" + "\nNOMBRE: " + nombre + "\nID: " + id + ", \nPROGRAMA: " + programa;
    }

    
    
}
