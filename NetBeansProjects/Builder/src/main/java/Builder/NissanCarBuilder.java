/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS
 */
public class NissanCarBuilder extends CarBuilder{

    @Override
    public void buildmodelo() {
        car.setModelo("NISSAN");
    }

    @Override
    public void buildtipo() {
        car.setTipo("EJECUTIVO");
    }

    @Override
    public void buildcolor() {
        car.setColor("BLANCO");
    }

   
    
}
