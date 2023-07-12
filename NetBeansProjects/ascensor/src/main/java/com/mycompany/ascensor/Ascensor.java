/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ascensor;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ascensor {

    public static boolean check(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            //0 = 0 + 4;
            temp /= 10;
        }
        return sum == num;
    }

    public static void decompose(int num) {
        boolean found = false;
        for (int i = 1; i <= num; i++) {
            if (check(i) && check(num - i)) {
                System.out.println(i + " + " + (num - i) + " = " + num);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontró ninguna descomposición de suma de dígitos para " + num);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int suma = 0;

        System.out.println("Digite piso inicial");
        int n1 = read.nextInt();

        System.out.println("Digite piso final");
        int n2 = read.nextInt();

        //Sube
        if (n1 < n2) {
            System.out.println("Recorrido");
            for (int i = n1 + 1; i <= n2; i++) {
                System.out.println("Piso " + i);

                suma++;

            }
            System.out.println("Pisos: " + suma);

            for (int i = 0; i < suma; i++) {
                    
            }

            //Baja
        } else if (n1 > n2) {
            System.out.println("Recorrido");
            for (int i = n2; i < n1; i++) {
                System.out.println("Piso " + i);

            }

        }

    }
}
