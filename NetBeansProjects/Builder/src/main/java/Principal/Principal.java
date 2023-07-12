/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author ASUS
 */

import Builder.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Factory f = new Factory ();
  
        f.setCarBuilder(new NissanCarBuilder());    
        f.BuilderCar();
        JOptionPane.showMessageDialog(null, f.getCar());
        
        
        f.setCarBuilder(new BmwCarBuilder());
        f.BuilderCar();
        JOptionPane.showMessageDialog(null, f.getCar());
        
        
        
        
        
    }
    
}
