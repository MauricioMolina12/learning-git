/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.*;

/**
 *
 * @author ASUS
 */
public abstract class Lector implements Interfaces.Interfaz2{
    
    private String nombre;
    private String direccion;
    private int telefono;
    static Scanner read = new Scanner (System.in);
    

    public Lector(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void reservar(String material){
        
        System.out.println("Digite el id de lector");
        int id = read.nextInt();
        
        System.out.println("Digite codigo material");
        int codigo = read.nextInt();
        
        System.out.println("Fecha reserva");
        String fr = read.next();
        
        System.out.println("Fecha límite: 30 días después de su reserva.");
        
    }
    @Override
    public void entregar(String material){
        
        System.out.println("Digite el código del material");
        int codigo = read.nextInt();
        
        System.out.println("Fecha entrega");
        String fe = read.next();
    }
    
    
}
