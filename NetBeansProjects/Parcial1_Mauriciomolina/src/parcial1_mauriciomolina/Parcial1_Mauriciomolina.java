package parcial1_mauriciomolina;

import java.util.*;

public class Parcial1_Mauriciomolina {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int opc;
    String nombre;
    String sexo;
    int edad;
    String lenguaje;
        do {
            System.out.println("Menú");
            System.out.println("1.Perro");
            System.out.println("2.Gato");
            System.out.println("3.Salir");
            System.out.println("Digite opción");
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Digite nombre del animal");
                    nombre = leer.next();
                    System.out.println("Digite el sexo del animal");
                    sexo = leer.next();
                    System.out.println("Digite la edad");
                    edad = leer.nextInt();
                    System.out.println("Digite el lenguaje");
                    lenguaje = leer.next();
                    Perro p1 = new Perro (lenguaje, sexo, nombre, edad);
                    p1.imprimirdatos();
                    break;
                case 2:
                    System.out.println("Digite nombre del animal");
                    nombre = leer.next();
                    System.out.println("Digite el sexo del animal");
                    sexo = leer.next();
                    System.out.println("Digite la edad");
                    edad = leer.nextInt();
                    System.out.println("Digite el lenguaje");
                    lenguaje = leer.next();
                    Gato g1 = new Gato (lenguaje, sexo, nombre, edad);
                    g1.imprimir();
                    break;
                default:
                    System.out.println("Error");
            }
        } while (opc !=3);
        
    
    
    
    }

}
