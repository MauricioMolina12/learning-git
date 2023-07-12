/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int [] numeros = new int[10];
        
        int mayor = 0;
        int pos = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite un número");
            numeros[i] = read.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor = numeros[i];
                pos = i;
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Posición: " + pos);
    }
}
