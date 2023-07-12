package pila_estatica;

import java.util.*;

public class Pila_Estatica {

    static public int Pila[];
    static public int Pilaux[];
    static public int tope = 0;
    static public int tamano;
    static public int dato;

    static public int Pop() {
        return Pila[tope];
    }

    static public void Push(int dato) {
        Random rnd= new Random ();
        for (int i = 0; i < tope; i++) {
            Pila[i]= rnd.nextInt(10);
            System.out.println(Pila[i]);
        }
        Pila[tope] = dato;
        tope++;
    }

    static public boolean Llena() {
        if (tope == tamano) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean Vacia() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejemplo de Pila");
        System.out.println("Digite el tamaño de la Pila");
        tamano = leer.nextInt();
        Pila = new int[tamano];
        Pilaux = new int[tamano];
        int opcion;
        int aux = 0;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Inserte en la pila");
            System.out.println("2. Saque un elemento de la pila");
            System.out.println("3. Muestre la pila");
            System.out.println("4. Invertir pila");
            System.out.println("5. Buscar dato en la pila");
            System.out.println("6. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite un valor a insertar en la pila");
                    dato = leer.nextInt();
                    if (!Llena()) {
                        Push(dato);
                    } else {
                        System.out.println("La pila está llena, no se puede insertar");
                    }
                    break;
                case 2:
                    if (!Vacia()) {
                        tope = tope - 1;
                        System.out.println("El elemento en la cima de la pila era: " + Pop());
                    } else {
                        System.out.println("La pila está vacía, no se puede sacar");
                    }
                    break;
                case 3:
                    for (int i = 0; i < tope; i++) {
                        System.out.print(Pila[i] + "  ");
                    }
                    break;
                case 4:
                    for (int i = 0; i < tope; i++) {
                        Pilaux[i] = Pila[tope - 1 - i];
                    }

                    for (int i = 0; i < tope; i++) {
                        System.out.print(Pilaux[i] + "  ");
                    }
                    break;
                case 5:
                    System.out.println("Digite el dato que busca");
                    int dat = leer.nextInt();
                    for (int i = 0; i < tope; i++) {
                        if (Pila[i] == dat) {
                            aux = i;

                        }

                    }
                    if (Pila[aux] == dat) {
                        System.out.println("El dato se encuentra en la posición " + aux);

                    } else {
                        System.out.println("el dato no se encuentra");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción errada");

            }

        } while (opcion != 6);
    }
}
