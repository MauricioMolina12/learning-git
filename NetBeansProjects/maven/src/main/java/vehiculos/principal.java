/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ASUS
 */
public class principal {

    public static void main(String[] args) {

        try {
            carro r = new carro();
            r.acelerar();
            r.detenerse();

            moto m = new moto();
            m.acelerar();
            m.detenerse();
            
        }catch (Exception E){
            System.out.println("Error");
        }

    }
}
