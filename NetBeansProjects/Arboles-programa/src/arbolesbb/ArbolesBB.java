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

        public void Buscar(nodo raiz, int busqueda) {

            nodo aux = raiz;
            int i = 1;

            if (ArbolVacio(raiz)) {
                System.out.println("El Árbol está vacio");
            } else if (busqueda == aux.dato) {
                System.out.println("El nodo se encuentra en la raiz con altura de: " + i);
            } else {

                while (busqueda != aux.dato || i == 0) {

                    if (busqueda < aux.dato) {
                        i++;
                        aux = aux.izq;
                    }

                    if (busqueda > aux.dato) {
                        i++;
                        aux = aux.der;
                    }

                    if (aux == null) {
                        i = 0;
                    }

                }

                if (i == 0) {
                    System.out.println("Este número no se encuentra en el árbol");
                } else {
                    System.out.println("La altura del nodo " + busqueda + " es: " + i);
                }

            }
        }

        public nodo Borrar(nodo raiz, int num) {
            nodo p = raiz;
            nodo p1;
            nodo p2;
            int s = 1;

            if (ArbolVacio(raiz)) {
                System.out.println("El Árbol está vacio");

            } else if (num == p.dato) {//Cuando se elimina la raiz

                if (raiz.izq == null && raiz.der == null) {//Cuando esta sola la raiz
                    raiz = null;

                } else if (raiz.izq == null) {//Cuando no hay nada en la izq

                    p = raiz.der;
                    p1 = raiz;

                    while (p.izq != null) {
                        p1 = p;
                        p = p.izq;
                    }
                    if (p1.izq != null) {//en caso de que si haya a hijos a la izquierda del primer nodo a la derecha de la raiz
                        p2 = p.der;
                        p1.izq = p2;
                        p.der = null;
                        p.der = raiz.der;
                        p.izq = raiz.izq;
                        raiz = p;
                    } else {
                        raiz = raiz.der;
                    }

                } else {//cuando no hay en la derecha o hay en ambos arboles

                    p = raiz.izq;
                    p1 = raiz;

                    while (p.der != null) {
                        s = 0;
                        p1 = p;
                        p = p.der;
                    }

                    if (s == 0) { //
                        p2 = p.izq;
                        p1.der = p2;
                        p.izq = null;
                        p.der = raiz.der;
                        p.izq = raiz.izq;
                        raiz = p;
                    } else { // Cuando no hay nada a la derecha en el sub-arbol izquierdo 
                        raiz.izq = null;
                        p.der = raiz.der;
                        raiz = p;
                    }
                }

            } else {
                p1 = null;
                p2 = null;
                while (num != p.dato) {
                    
                    if (num < p.dato) {
                        p1 = p;
                        p = p.izq;
                    }

                    if (num > p.dato) {
                        p1 = p;
                        p = p.der;
                    }

                    if (p == null) {
                        s = 0;
                        break;
                    }

                }
                if (s == 0) {
                    System.out.println("Este número no se encuentra en el árbol");
                } else {
                    if (p1.izq == p) { //Cuando está a la izquierda del padre
                        if (p.izq != null && p.der != null) {//Tiene dos hijos
                            p2 = p.izq;
                            p1.izq = null;
                            p1.izq = p2;
                            while (p2.der != null) {
                                p2 = p2.der;
                            }
                            p2.der = p.der;
                        } else if (p.izq == null) {//tiene un hijo a la derecha
                            p2 = p.der;
                            p1.izq = null;
                            p1.izq = p2;

                        } else if (p.der == null) {//tiene un hijo a la izquierda
                            p2 = p.izq;
                            p1.izq = null;
                            p1.izq = p2;
                        } else {//Cuando no tiene hijos 
                            p1.izq = null;

                        }
                    }

                    if (p1.der == p) { // Cuando está a la derecha del padre
                        if (p.izq != null && p.der != null) {//Tiene dos hijos
                            p2 = p.izq;
                            p1.der = null;
                            p.izq = null;
                            p1.der = p2;
                            while (p2.der != null) {
                                p2 = p2.der;
                            }
                            p2.der = p.der;
                        } else if (p.izq == null) {//tiene un hijo a la derecha
                            p2 = p.der;
                            p1.der = null;
                            p1.der = p2;
                                    
                        } else if (p.der == null) {//tiene un hijo a la izquierda
                            p2 = p.izq;
                            p1.der = null;
                            p1.der = p2;
                        } else {//No tiene hijos
                            p1.der = null;
                        }
                    }

                }

            }
            return raiz;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ejemplo de Arbol Binario de Busqueda");
        Arboles_BB Arbol = new Arboles_BB();
        raiz = Arbol.CrearArbol(raiz);
        int opcion, numero, numero1, dato;
        nodo p;
        do {
            System.out.println("\nMENÚ LISTAS ENLAZADAS");
            System.out.println("1. Insertar");
            System.out.println("2. Recorrido Preorden ");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Buscar un dato");
            System.out.println("6. Borrar un dato");
            System.out.println("10. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Insertar
                    System.out.println("Digite el valor a insertar");
                    numero = leer.nextInt();
                    ;
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
                case 5: // Busqueda
                    System.out.println("Digite el valor a Buscar");
                    numero1 = leer.nextInt();
                    Arbol.Buscar(raiz, numero1);
                    break;

                case 6: // Borrar
                    System.out.println("Digite el valor a eliminar");
                    int num = leer.nextInt();
                    raiz = Arbol.Borrar(raiz, num);
                    break;

                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 10);
    }
}
