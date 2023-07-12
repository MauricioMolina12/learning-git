/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrayprueba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayPrueba {

    public static ArrayList<Discos> d = new ArrayList<>();

    public static void adicionar(int id, String nombre, String interprete, String año) {

        d.add(new Discos(id, nombre, interprete, año));
        System.out.println("Ingresado");
    }

    public static void mostrar() {

        for (int i = 0; i < d.size(); i++) {
            System.out.println("\nId " + d.get(i).getId()
                    + "\nNombre " + d.get(i).getNombre()
                    + "\nInterprete " + d.get(i).getInterprete()
                    + "\nAño " + d.get(i).getAño());
        }

    }

    public static void eliminar(int id) {
        boolean c = false;
        Discos delete = null;

        for (Discos discos : d) {
            if (discos.getId() == id) {
                delete = discos;
                c = true;

            }
        }
        if (delete != null) {
            d.remove(delete);
            System.out.println("Eliminado");
            mostrar();
        } else {
            System.out.println("No eliminado");
        }
    }

    public static void adicionarPosicion(int id, String nombre, String interprete, String año, int pos) {
        boolean c = false;

        Discos dis = new Discos(id, nombre, interprete, año);
        d.add(pos, dis);
        System.out.println("Agregado");

    }
    
    public static void obtenerObjeto(int pos){
        
        for (int i = 0; i < d.size(); i++) {
            System.out.println("\n" + d.get(pos).getId() 
                    + "\n" + d.get(pos).getNombre() 
                    + "\n" +d.get(pos).getInterprete() 
                    + "\n" +d.get(pos).getAño());
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opc = 0;
        int id = 0;
        String nombre = "";
        String interprete = "";
        String año = "";
        int pos = 0;

        do {
            System.out.println("\nMenú "
                    + "\n1.Adiccionar discos "
                    + "\n2.Mostrar colección "
                    + "\n3.Eliminar discos "
                    + "\n4.Adicionar en una posición especifica "
                    + "\n5.Devolver el tamaño de la colección "
                    + "\n6.Obtener el objeto que ocupa una posición dada "
                    + "\n7.Salir");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite el id del disco");
                    id = read.nextInt();

                    System.out.println("Ingrese el nombre");
                    nombre = read.next();

                    System.out.println("Ingrese el interprete");
                    interprete = read.next();

                    System.out.println("Ingrese el año");
                    año = read.next();

                    adicionar(id, nombre, interprete, año);
                    break;

                case 2:
                    mostrar();
                    break;

                case 3:

                    System.out.println("Digite el id del disco a eliminar");
                    id = read.nextInt();
                    eliminar(id);
                    break;

                case 4:
                    System.out.println("Digite el id del disco");
                    id = read.nextInt();

                    System.out.println("Ingrese el nombre");
                    nombre = read.next();

                    System.out.println("Ingrese el interprete");
                    interprete = read.next();

                    System.out.println("Ingrese el año");
                    año = read.next();

                    System.out.println("Digite posición en donde agregará");
                    pos = read.nextInt();

                    adicionarPosicion(id, nombre, interprete, año, pos);
                    mostrar();

                    break;

                case 5:
                    System.out.println(d.size());
                    break;
                    
                case 6:
                    System.out.println("Digite posición");
                    int i = read.nextInt();
                    
                    obtenerObjeto(i);

            }
        } while (opc != 7);

    }
}
