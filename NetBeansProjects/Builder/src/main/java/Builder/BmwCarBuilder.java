/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS
 */
public class BmwCarBuilder extends CarBuilder {

    @Override
    public void buildmodelo() {
       car.setModelo("BMW");
    }

    @Override
    public void buildtipo() {
        car.setTipo("DEPORTIVO");
    }

    @Override
    public void buildcolor() {
        car.setColor("ROJO");
    
    }
   
   
    
}
