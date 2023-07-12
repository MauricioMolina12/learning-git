/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ASUS
 */
public class carro extends Vehiculo{

    @Override
    public void acelerar() {
        System.out.println("El coche acelera");
    }

    @Override
    public void detenerse() {
        super.detenerse();
    }
    
    
    
    
}
