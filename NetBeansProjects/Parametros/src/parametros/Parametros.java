package parametros;

import java.util.*;

public class Parametros {

    public static int potencia(int base, int exp) {
        int pot = 1;
        for (int i = 1; i <= exp; i++) {   
            pot = pot * base;
        }
        return pot;

    }

    public static int factorial(int num) {
        int i, fac = 1;
        if (num == 0) {
            return 1;
        } else {
            for (i = 1; i <= num; i++) {
                fac = fac * i;

            }
            return fac;
        }
    }

    public static double area(double rad) {
        double r = (3.1416) * (rad * rad);
        return r;

    }

    public static int mulsum(int n1, int n2) {
        int sum = 0;
        for (int i = 1; i <= n1; i++) {
            sum = sum + n2;

        }
        return sum;

    }

    public static void fibonacci(int ran, int ini) {
        int a, b = 0;
        for (int i = 0; i < ran; i++) {
            a = b + ini;
            b = ini;
            ini = a;
            System.out.print("" + a + "-");

        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int op;

        do {
            System.out.println("");
            System.out.println("1.Potencia");
            System.out.println("2.Factorial");
            System.out.println("3.Área de un circulo");
            System.out.println("4.Multiplicación con sumas excesivas");
            System.out.println("5.Fibonacci");
            System.out.println("6.Salir");
            System.out.println("");
            System.out.println("DIGITE UNA OPCIÓN");
            op = leer.nextInt();

            switch (op) {
                case 1:{
                    System.out.println("Digite la base");
                    int b = leer.nextInt();
                    System.out.println("Digite el exponente");
                    int ex = leer.nextInt();
                    System.out.println("La potencia es: " + potencia(b, ex));
                    break;
                }
                case 2: {
                    int num,
                     f;
                    System.out.println("Digite un número para hallar el factorial");
                    num = leer.nextInt();
                    f = factorial(num);
                    System.out.println("El factorial de " + num + " es: " + f);
                    break;
                }
                case 3: {
                    System.out.println("Área de un circulo");
                    System.out.println("Ingresa el radio del circulo");
                    double r = leer.nextDouble();
                    System.out.println("El área de un circulo " + r + " es= " + area(r));
                    break;
                }
                case 4:{
                    System.out.println("Multiplicación con sumas excesivas");
                    System.out.println("Digite el primer número");
                    int n1 = leer.nextInt();
                    System.out.println("Digite el segundo número");
                    int n2 = leer.nextInt();
                    System.out.println("Al multiplicar " + n1 + "x" + n2 + " por sumas sucesivas da como resultado= " + mulsum(n1, n2));
                    break;
                }
                case 5: {
                    System.out.println("Fibonacci");
                    System.out.println("Digite el rango");
                    int ran = leer.nextInt();
                    System.out.println("Ingrese el número donde quiere que inicie");
                    int ini = leer.nextInt();
                    System.out.println("Serie: ");
                    fibonacci(ran, ini);
                    break;
 
            }
                
        }
 
        
    }
    while (op!= 6);
    System.out.println ("Fin del programa");

    }

}
