package clasegeneral;

import java.util.*;

public class Clasegeneral {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        Mamiferos perro = new Mamiferos("Suave", "Colombia", "Blanco", "Perro", "Mamifero", "Criollo");
        System.out.println("Datos mamiferos");
        perro.imprimir();
        
        Oviparos cocodrilo = new Oviparos ("Externo","Mediano","Cocodrilo","Oviparo","americano");
        System.out.println("Datos oviparos");
        cocodrilo.imprimir();

    }

}
