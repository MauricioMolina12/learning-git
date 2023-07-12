/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ASUS
 */
public abstract class Vehiculo {
    
    public abstract void acelerar();
    
    public void detenerse(){
        System.out.println("El vehiculo se detiene");
    }
}
