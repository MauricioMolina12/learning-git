/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ASUS
 */
public class principal {
 
    
    public static void main(String[] args) {
        
        rectangulo r = new rectangulo();
        circulo c = new circulo();
        
        r.setNombre("Rectangulo");
        r.ImprimirNombre();
        
        c.setNombre("Circulo");
        c.ImprimirNombre();
        
    }
}
