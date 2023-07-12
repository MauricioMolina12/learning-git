package pilaestatica1;

import java.util.*;

public class Pilaestatica1 {
    static public int Pila[];
    static public int Pilaux[];
    static public int tope = 0;
    static public int topeaux=0;
    static public int tamaño;
    static public int dato;

    static public int Pop() {
        return Pila[tope];
    }

    static public void Push(int dato) {
        Pila[tope] = dato;
        tope++;
    }
    static public void io(int dato){
        
        if (dato>Pila[tope-1]) {
            Pila[tope]=dato;
            tope=tope+1;
            
        } else {
            while(Pila[tope-1] > dato && tope > 0){
                tope=tope-1;
                Pilaux[topeaux]=Pila[tope];
                topeaux=topeaux+1;
            }
            Pila[tope]=dato;
            tope=tope+1;
            while(topeaux>0){
                topeaux=topeaux-1;
                Pila[tope]=Pilaux[topeaux];
                tope=tope+1;
            }
        }
    }

    static public boolean Llena() {
        if (tope == tamaño) {
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
        Random rnd= new Random ();
        System.out.println("DIGITE EL TAMAÑO DE LA PILA");
        tamaño = leer.nextInt();
        Pila = new int[tamaño];
        Pilaux = new int[tamaño];
        int opcion;
        int aux = 0;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Inserte en la pila");
            System.out.println("2. Insertar ordenado en una pila");
            System.out.println("3. Saque un elemento de la pila");
            System.out.println("4. Muestre la pila");
            System.out.println("5. Invertir pila");
            System.out.println("6. Buscar dato en la pila");
            System.out.println("7. Salir");
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
                case  2:
                    if (!Llena()) {
                        dato=rnd.nextInt(10);
                        io(dato);
                    } else {
                        System.out.println("La pila está llena, no se puede insertar");
                    }
                    
                    break;
                            
                case 3:
                    if (!Vacia()) {
                        tope = tope - 1;
                        System.out.println("El elemento en la cima de la pila era: " + Pop());
                    } else {
                        System.out.println("La pila está vacía, no se puede sacar");
                    }
                    break;
                case 4:
                    for (int i = 0; i < tope; i++) {
                        System.out.print(Pila[i] + " ");
                    }
                    break;
                case 5:
                    for (int i = 0; i < tope; i++) {
                        Pilaux[i] = Pila[tope - 1 - i];
                    }

                    for (int i = 0; i < tope; i++) {
                        System.out.print(Pilaux[i] + " ");
                    }
                    break;
                case 6:
                    System.out.println("Digite el dato que busca: ");
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
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción errada");

            }
        } while (opcion != 6);
    }
}
