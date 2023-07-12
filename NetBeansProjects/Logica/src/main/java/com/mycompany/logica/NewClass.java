/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewClass {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        
        for (int i = 1; i < 100; i++) {
            
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuss" + "" + i);
            }else if (i%3==0) {
                System.out.println("Fizz" + i);
            }else if (i%5==0) {
                System.out.println("Buss" + i);
            }
        }

    }
}
