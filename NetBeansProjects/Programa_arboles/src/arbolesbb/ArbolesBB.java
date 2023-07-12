package arbolesbb;

import java.util.*;

public class ArbolesBB {

    static public class nodo {

        int dato;
        nodo izq;
        nodo der;

        public nodo(int dato) {
            this.dato = dato;
            this.izq = null;
            this.der = null;
        }
    }

    static public nodo raiz, cab2, cab3;

    static public class Arboles_BB {

        public nodo CrearArbol(nodo ptr) {
            ptr = null;
            return ptr;
        }

        public boolean ArbolVacio(nodo raiz) {
            if (raiz == null) {
                return true;
            } else {
                return false;
            }
        }

        public nodo InsertarNodo(nodo raiz, int info) {
            nodo q, w;
            nodo p = new nodo(info);
            if (ArbolVacio(raiz)) {
                raiz = p;
            } else {
                w = null;
                q = raiz;
                while (q != null) {
                    w = q;
                    if (info > q.dato) {
                        q = q.der;
                        if (q == null) {
                            w.der = p;
                        }
                    } else {
                        q = q.izq;
                        if (q == null) {
                            w.izq = p;
                        }
                    }

                }

            }
            return raiz;
        }

        public void Preorden(nodo raiz) {
            if (raiz != null) {
                System.out.print(raiz.dato + " - ");
                Preorden(raiz.izq);
                Preorden(raiz.der);
            }

        }

        public void Inorden(nodo raiz) {
            if (raiz != null) {
                Inorden(raiz.izq);
                System.out.print(raiz.dato + " - ");
                Inorden(raiz.der);
            }

        }

        public void Postorden(nodo raiz) {
            if (raiz != null) {
                Postorden(raiz.izq);
                Postorden(raiz.der);
                System.out.print(raiz.dato + " - ");
            }

        }

        public void busqueda(nodo raiz, int dato) {
            nodo p = raiz;
            int altura = 1;
            if (raiz == null) {
                System.out.println("El arbol está vacío");
            }
            while (p.dato != dato || p == null) {
                if (dato > p.dato) {
                    p = p.der;
                    altura++;

                } else if (dato < p.dato) {
                    p = p.izq;
                    altura++;
                }

            }

            System.out.println("Altura del nodo: " + altura);
        }

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Arbol binario");
        Arboles_BB Arbol = new Arboles_BB();
        raiz = Arbol.CrearArbol(raiz);
        int opcion, numero, dato;
        nodo p;
        do {
            System.out.println("\nMENÚ ARBOLES BINARIOS DE BUSQUEDA");
            System.out.println("1. Insertar");
            System.out.println("2. Recorrido Preorden ");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Buscar un dato");
            System.out.println("10. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Insertar
                    System.out.println("Digite el valor a insertar");
                    numero = leer.nextInt();
                    System.out.print("Insertando : " + numero);
                    raiz = Arbol.InsertarNodo(raiz, numero);

                    break;

                case 2: //Recorrido Preorden
                    System.out.println("RECORRIDO PREORDEN");
                    Arbol.Preorden(raiz);
                    break;

                case 3: //Recorrido Inorden
                    System.out.println("RECORRIDO INORDEN");
                    Arbol.Inorden(raiz);
                    break;
                case 4: //Recorrido Postorden
                    System.out.println("RECORRIDO POSTORDEN");
                    Arbol.Postorden(raiz);
                    break;
                case 5:
                    System.out.println("Digite el valor a Buscar");
                    dato = leer.nextInt();
                    Arbol.busqueda(raiz, dato);
                    break;

                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 10);
    }

}
