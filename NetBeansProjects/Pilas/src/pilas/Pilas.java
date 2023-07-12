package pilas;

import java.util.*;

public class Pilas {

    static public int Pila[];
    static public int Pila2[];
    static public int tope = 0;
    static public int tope2=0;
    static public boolean ro= false;
    static public int tamano;
    static public int dato;

    static public int Pop () {
        return Pila[tope];
    }

    static public void Push (int n) {
        Pila[tope] = n;
        tope++;
    }

    static public boolean llena() {
        if (tope == tamano) {
            return true;

        } else {
            return false;
        }

    }

    static public boolean vacia() {
        if (tope == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite tamaño de pila");
        tamano = leer.nextInt();

        Pila = new int[tamano];
        Pila2 = new int[tamano];
        int opc;

        do {
            System.out.println("\nMenú");
            System.out.println("1.Llenar la pila");
            System.out.println("2.Borrar el tope");
            System.out.println("3.Mostrar la pila");
            System.out.println("4.Eliminar un dato en especifico");
            System.out.println("5.Eliminar un dato cuantas veces aparezca");
            System.out.println("6.Contar cuantas veces aparezca");
            System.out.println("7.Salir");
            System.out.println("Escoga una opción");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite un número");
                    dato = leer.nextInt();
                    if (!llena()) {
                        Push(dato);

                    } else {
                        System.out.println("No puede meter números, la pila está llena");
                    }
                    break;
                case 2:
                    if (!vacia()) {
                        tope = tope - 1;
                        System.out.println("El número eliminado era: " + Pop());

                    } else {
                        System.out.println("La pila está vacía");
                    }
                    break;
                case 3:
                    for (int i = 0; i < tope; i++) {
                        System.out.print(Pila[i] + " ");
                        
                    }
                    break;
                case 4:
                    boolean ro = false;
                    int cero = 0;
                    tope2 = 0;
                    int t = tope;
                    

                    System.out.println("Ingrese el dato a eliminar:");
                    int num = leer.nextInt();
                    System.out.println("");
                    System.out.println("");

                    while (cero < t) {
                        tope2++;
                        Pila2[tope2 - 1] = Pila[tope - 1];
                        tope--;

                        if (ro !=true && Pila2[tope2 - 1] == num) {
                            tope2--;
                            ro = true;
                        }

                        cero++;
                    }

                    for (int i = 0; i < tope2; i++) {
                        System.out.println(Pila2[i]);
                    }

                    if (ro == false) {
                        System.out.println("El dato no está");
                    }
                    break;
                    
                case 5 : 
                    ro = false;
                    cero = 0;
                    tope2 = 0;
                    t = tope;
                    

                    System.out.println("Ingrese el dato a eliminar:");
                    num = leer.nextInt();
                    System.out.println("");
                    System.out.println("");

                    while (cero < t) {
                        tope2++;
                        Pila2[tope2 - 1] = Pila[tope - 1];
                        tope--;

                        if (Pila2[tope2 - 1] == num) {
                            tope2--;
                            ro = true;
                        }

                        cero++;
                    }

                    for (int i = 0; i < tope2; i++) {
                        System.out.println(Pila2[i]);
                    }

                    if (ro == false) {
                        System.out.println("El dato no está");
                    }
                    break;
                case 6:
                    cero = 0;
                    tope2 = 0;
                    int c = 0;
                    t = tope;
                    
                    System.out.println("Ingrese el dato a contar: ");
                    dato = leer.nextInt();

                    while (cero < t) {
                        tope2++;
                        Pila2[tope2 - 1] = Pila[tope - 1];
                        if (Pila2[tope2 - 1] == dato) {
                            c++;
                        }
                        tope--;
                        cero++;
                    }
                    System.out.println("El numero ingresado se ha repetido " + c + " veces.");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ésta opción no está dentro de las propuestas2");
            }
        } while (opc != 4);

    }

}
