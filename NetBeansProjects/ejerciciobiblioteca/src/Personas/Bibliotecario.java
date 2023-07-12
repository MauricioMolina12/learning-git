/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bibliotecario {

    private int id;

    public Bibliotecario(int id) {
        this.id = id;
    }

    public Bibliotecario() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void registrar_m(Scanner read) {
        System.out.println("1.Libro");
        System.out.println("2.Revista");
        int rm = read.nextInt();
        if (rm!=1 && rm!=2) {
            System.out.println("Opción incorrecta. Vuelva a insertar.");
            System.exit(0);
        }
        if (rm == 1) {

            System.out.println("Digite el codigo de material");
            int codM = read.nextInt();
            System.out.println("Digite el titulo");
            String titulo = read.next();
            System.out.println("Digite el tipo");
            String tipo = read.next();
            System.out.println("Digite el autor o autores");
            String autor = read.next();
            System.out.println("Digite la editorial");
            String editorial = read.next();
            System.out.println("Digite cantidad de libros");
            int can = read.nextInt();
            System.out.println("Registro exitoso!");
        } else if (rm == 2) {
            
            System.out.println("Digite el codigo de material");
            int codM = read.nextInt();
            System.out.println("Digite el titulo");
            String titulo = read.next();
            System.out.println("Digite el tipo");
            String tipo =read.next();
            System.out.println("Digite el autor o autores");
            String autor = read.next();
            System.out.println("Digite la edición");
            String editorial = read.next();
            System.out.println("Digite cantidad de revistas");
            int can = read.nextInt();

        }
    }

}
