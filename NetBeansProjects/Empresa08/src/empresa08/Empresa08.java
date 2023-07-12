package empresa08;

import java.util.*;

public class Empresa08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double MC = 0;
        boolean ME = true;

        System.out.println("Digite su nombre");
        String nombre = leer.nextLine();

        System.out.println("Digite su edad");
        int edad = leer.nextInt();

        System.out.println("Digite su número de DNI");
        int id = leer.nextInt();

        System.out.println("Digite su sexo");
        char sexo = leer.next().charAt(0);

        System.out.println("Digite su peso (kg)");
        double peso = leer.nextDouble();

        System.out.println("Digite su altura (m)");
        double altura = leer.nextDouble();

        MC = peso / Math.pow(altura, 2);

        if (MC < 20) {
            System.out.println("-1");

        } else if (MC > 20 && MC < 25) {
            System.out.println("Está por debajo de su peso ideal: 0");

        } else if (MC > 25) {
            System.out.println("Está en sobrepeso: 1");
        }
        
        if (edad > 18) {
            ME = true;
            
        }else{ 
            ME = false;
        }
        
        Persona persona1 = new Persona(nombre, edad,id,sexo,peso,altura);
        persona1.imprimir(nombre, edad, id, sexo, peso, altura);
        
        

    }
}
