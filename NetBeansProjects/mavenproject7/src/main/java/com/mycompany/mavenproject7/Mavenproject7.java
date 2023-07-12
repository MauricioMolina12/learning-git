/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mavenproject7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double precioT = 0;
        double descuento = 0;
        double precio1 = 1000;
        double precio2 = 2000;
        double precio3 = 3000;

        System.out.println("Ingrese nombre del producto");
        String producto = read.next();

        System.out.println("Digite cantidad");
        int can = read.nextInt();

        if (producto.equalsIgnoreCase("Computador")) {
            precioT = precio1 * can;
            if (can > 5) {
                descuento = precioT * 0.25;
                precioT -= descuento;

            } else {
                precioT = precio1 * can;
            }
        } else if (producto.equalsIgnoreCase("Bicicleta")) {
            precioT = precio2 * can;
            if (can > 5) {
                descuento = precioT * 0.30;
                precioT -= descuento;

            } else {
                precioT = precio2 * can;
            }
        } else if (producto.equalsIgnoreCase("Televisor")) {
            precioT = precio3 * can;
            if (can > 5) {
                descuento = precioT * 0.35;
                precioT -= descuento;

            } else {
                precioT = precio3 * can;
            }
        }
        System.out.println("Precio: " + precioT);

    }
}
