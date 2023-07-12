/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TriEjercicio;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ExerciseOne {

    public static void Circunmference(int r) {

        double pi = 3.1416;
        int result = (int) (2 * pi * r);

        System.out.println(result);
    }

    public static void Circle(int r2) {

        double pi = 3.1416;
        int result = (int) (pi * r2);

        System.out.println(result);
    }

    public static void Sphere(int r3) {

        double pi = 3.1416;
        int result = (int) (4 * pi * r3 / 3);

        System.out.println(result);
    }

    public static void Discounted(double price, int Discounted) {

        
        double aux = (price) * Discounted / 100;
        
        double result = price - aux;
        
        System.out.println(result);
        
    }
    
        public static void currency(double euro) {

            double dolar = 1.33250;
            
            double change = euro * dolar;
            
            System.out.println(change);
        
    
        
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opc = 0;
        int opc2 = 0;
        int r = 0;
        int r2 = 0;
        int r3 = 0;

        do {
            System.out.println("\nMenú "
                    + "\n1.Discounted price calculation "
                    + "\n2.Calculation of area and perimeter "
                    + "\n3.currency exchange "
                    + "\n4.Exit "
                    + "\nChoose your option");
            opc = read.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Enter the price");
                    double p = read.nextDouble();
                    
                    System.out.println("Enter the discounted");
                    int d = read.nextInt();
                    
                    Discounted(p, d);
                    break;

                case 2:
                    do {
                        System.out.println("\nMenú "
                                + "\n1.Calculation of circumference perimeter "
                                + "\n2.Circle area "
                                + "\n3.Volume of the sphere "
                                + "\n4.Exit "
                                + "\n.Choose your option");
                        opc = read.nextInt();

                        switch (opc) {

                            case 1:
                                System.out.println("Enter the radius");
                                r = read.nextInt();
                                Circunmference(r);
                                break;
                            case 2:
                                System.out.println("Enter the radius");
                                r2 = read.nextInt();
                                Circle(r2);
                                break;
                            case 3:
                                System.out.println("Enter the radius");
                                r3 = read.nextInt();
                                Sphere(r3);
                                break;
                            case 4:
                                
                                break;
                            default:
                                System.out.println("Wrong choice");
                        }
                    } while (opc != 4);
                    break;
                    
                case 3:
                    System.out.println("Enter euros");
                    double e = read.nextDouble();
                    
                    currency(e);
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Wrong option");
                    
            }
        } while (opc != 4);

    }
}
