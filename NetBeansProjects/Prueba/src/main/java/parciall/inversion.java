/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;

/**
 *
 * @author FAMILIA ESCORCIA
 */
import java.time.LocalDate;
public class inversion {
    
    
    private double cantidad;
    private LocalDate fecha;
    private String descripcion;
    private int idinversion;

    public inversion(double cantidad, LocalDate fecha, String descripcion, int idinversion) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idinversion = idinversion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdinversion() {
        return idinversion;
    }

    public void setIdinversion(int idinversion) {
        this.idinversion = idinversion;
    }

    
    
}
