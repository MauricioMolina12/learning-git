/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ASUS
 */
public class rectangulo extends figuras{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void CalcularArea(){
    }

    @Override
    public void ImprimirNombre() {
        System.out.println(this.nombre);
    }

    
    
    
}
