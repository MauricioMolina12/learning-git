/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package figuras;

public abstract class figuras {
    
   String nombre;
   
   public abstract void CalcularArea();
   
   public void ImprimirNombre(){
       
       System.out.println(this.nombre);
   }
}
