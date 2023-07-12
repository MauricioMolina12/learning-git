package pilas1;

import java.util.*;

public class Pilas1 {

    static public int pila[];
    static public int pila2[];
    static public int tope1 = 0;
    static public int tope2 = 0;
    static public int t;
    static public int dato;

    static public void push(int dato) {
        pila[tope1] = dato;
        tope1++;
    }

    static public int Pop() {
        return pila[tope1];
    }

    static public void azar() {
        System.out.println("Pila generada al azar");
        Random rnd = new Random();
        for (int i = 0; i < t; i++) {
            pila[i] = rnd.nextInt(100) + 1;
            tope1++;
            System.out.println(pila[i]);
        }
    }

    static public boolean Llena() {
        if (tope1 == t) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean Vacia() {
        if (tope1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Digite tamaño de la pila");
        t = read.nextInt();
        pila = new int[t];
        pila2 = new int[t];
        int o;
        int opc;
        do {
            System.out.println("\nOpciones");
            System.out.println("1.Llenar pila");
            System.out.println("2.Sacar un elemento (pop)");
            System.out.println("3.Mostrar pila");
            System.out.println("4.Invertir pila");
            System.out.println("10.Salir");
            System.out.println("Digite opción");
            o = read.nextInt();
            

            switch (o) {
                case 1:
                    System.out.println("\nOpciones para llenar la pila");
                    System.out.println("1.Al azar");
                    System.out.println("2.Manualmente");
                    System.out.println("Escoga una opción:");
                    opc = read.nextInt();
                    System.out.println("");

                    if (opc == 1) {
                        azar();
                    }
                    if (opc == 2) {
                        System.out.println("Digite un valor a insertar en la pila");
                        dato = read.nextInt();
                        if (!Llena()) {
                            push(dato);
                        } else {
                            System.out.println("La pila está llena, no se puede insertar");
                        }

                    }
                    break;

                case 2:
                    if (!Vacia()) {
                        tope1 = tope1 - 1;
                        System.out.println("El elemento en la cima de la pila era: " + Pop());
                    } else {
                        System.out.println("La pila está vacía, no se puede sacar");
                    }

                    break;
                case 3:
                    for (int i = 0; i < tope1; i++) {
                        System.out.println(pila[i]);

                    }

                    break;
                case 4:
                    for (int i = 0; i < tope1; i++) {
                        pila2[i]=pila[tope1-1-i];
                    }
                    for (int i = 0; i < tope1; i++) {
                        System.out.println(pila2[i]);
                        
                    }
                    
                    break;
                case 10:
                    System.exit(0);
            }
        } while (o != 10);
    }

}
