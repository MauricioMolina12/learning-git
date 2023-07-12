package objetosyclasesveterinaria;

import java.util.*;

public class Objetosyclasesveterinaria {

    public static void agregarmascota(String nombre, String raza, String genero, int edad, String color, String procedencia, String nombred, String apellidod) {
        Perros mascota1 = new Perros(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
    }

    public static void imprimir(String nombre, String raza, String genero, int edad, String color, String procedencia, String nombred, String apellidod) {
        Perros mascota1 = new Perros(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
        mascota1.imprimir(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);

    }

    public static void modificar(String nombre, String raza, String genero, int edad, String color, String procedencia, String nombred, String apellidod) {
        Perros mascota1 = new Perros(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
        mascota1.setNombre(nombre);
        mascota1.setRaza(raza);
        mascota1.setGenero(genero);
        mascota1.setEdad(edad);
        mascota1.setColor(color);
        mascota1.setProcedencia(procedencia);
        mascota1.setNombred(nombred);
        mascota1.setApellidod(apellidod);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre de la mascota?");
        String nombre = l.next();

        System.out.println("¿Cuál es la raza?");
        String raza = l.next();

        System.out.println("¿Cuál es su genero?");
        String genero = l.next();

        System.out.println("¿Cuál es la edad?");
        int edad = l.nextInt();

        System.out.println("¿Cuál es el color?");
        String color = l.next();

        System.out.println("¿Cuál es la procedencia?");
        String procedencia = l.next();

        System.out.println("¿Cuál es el nombre del dueño?");
        String nombred = l.next();

        System.out.println("¿Cuál es el apellido del dueño?");
        String apellidod = l.next();

        System.out.println("¿Quiere agregar a otro? 1.si, 2.no");
        int opc = l.nextInt();

        if (opc == 1) {
            System.out.println("¿Cuál es el nombre de la mascota?");
            nombre = l.next();

            System.out.println("¿Cuál es la raza?");
            raza = l.next();

            System.out.println("¿Cuál es su genero?");
            genero = l.nextLine();

            System.out.println("¿Cuál es la edad?");
            edad = l.nextInt();

            System.out.println("¿Cuál es el color?");
            color = l.next();

            System.out.println("¿Cuál es la procedencia?");
            procedencia = l.next();

            System.out.println("¿Cuál es el nombre del dueño?");
            nombred = l.next();

            System.out.println("¿Cuál es el apellido del dueño?");
            apellidod = l.next();

        }

        agregarmascota(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
        imprimir(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
        modificar(nombre, raza, genero, edad, color, procedencia, nombred, apellidod);
        
       
    
    }

}
