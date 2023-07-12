/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus;

/**
 *
 * @author ASUS
 */
public class Josephus {

   public static void main(String[] args) {
        Josephus main = new Josephus();
        int[] circulo = main.Joseph(20, 45);
        for (int i = 0; i < circulo.length; i++) {
            System.out.print(i + 1 + "\t");
            System.out.println(circulo[i]);
        }
    }
 
    public int[] Joseph(int personas, int k) {
        //inicializar el circulo con todas las personas
        //vivas representadas con un 1 en su posición
        int[] circulo = new int[personas];
        for (int i = 0; i < personas; i++) {
            circulo[i] = 1;
        }
 
        //comienza el juego.
        int indice = 0;
        while (personas > 1) {
            //se recorre el arreglo hasta la posicion k
            for (int i = 0; i < k; i++) {
                //como es circular, si llego al final del arreglo,
                //vuelvo al principio.
                if (indice > circulo.length - 1) {
                    indice = 0;
                }
                //salteo los soldados muertos.
                while (circulo[indice] == 0) {
                    indice++;
                    if (indice > circulo.length - 1) {
                        indice = 0;
                    }
                }
                indice++;
            }
            circulo[indice - 1] = 0;
            personas = personas - 1;
        }
        return circulo;
    }
}