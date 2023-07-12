package el.problema.de.josephus;

import java.util.*;

public class ElProblemaDeJosephus {

    static public class nodo {

        int dato;
        nodo sig;

        public nodo(int dato) {
            this.dato = dato;
            this.sig = null;

        }
    }

    static public nodo cab, cab2, cab3;

    static public class problema_de_Josephus {

        public nodo CrearLista(nodo ptr) {
            ptr = null;
            return ptr;
        }

        public boolean ListaVacia(nodo cab) {
            if (cab == null) {
                return true;
            } else {
                return false;
            }
        }

        public nodo InsertarInicio(nodo cab, int info) {
            if (ListaVacia(cab)) {
                cab = new nodo(info);
                cab.sig = cab;
            } else {
                nodo p = cab;
                while (p.sig != cab) {
                    p = p.sig;
                }
                nodo q = new nodo(info);
                q.sig = cab;
                p.sig = q;
                cab = q;
            }
            return cab;
        }

        public void MostrarLista(nodo cab) {
            if (ListaVacia(cab)) {
                System.out.println("La lista está vacía");
            } else {
                nodo p = cab;
                while (p.sig != cab) {
                    System.out.print(p.dato + " -> ");
                    p = p.sig;
                }
                System.out.print(p.dato + " -> -> ->");
            }
        }

        public nodo Buscar(nodo cab, int num) {
            if (cab == null) {
                return null;
            } else {
                nodo p = cab;
                while (p != null && p.dato != num) {
                    p = p.sig;
                }
                if (p == null) {
                    return null;
                } else {
                    return p;
                }
            }
        }

        public nodo intercambiar_el_siguiente(nodo cab, int numero) {
            nodo p, q = null, r = null;

            if (cab == null || cab.sig == cab) {
                System.out.println("No se puede");
            } else {
                p = cab;
                q = null;
                r = null;
                while (p != null && p.dato != numero) {
                    q = p;
                    p = p.sig;
                }
                if (p != null && p.sig != null) {

                    if (p.dato != numero) {
                        System.out.println("No hay dato");

                    } else {
                        if (q == null) {
                            q = cab;
                            while (q.sig != cab) {
                                q = q.sig;

                            }

                        }

                        q.sig = p.sig;
                        r = p.sig;
                        p.sig = r.sig;
                        r.sig = p;

                        if (cab == p) {
                            cab = r;

                        } else if (cab == r) {
                            cab = p;

                        }

                    }

                }

            }

            MostrarLista(cab);
            return cab;
        }

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            Random rnd = new Random();
            System.out.println("El problema de José");
            problema_de_Josephus lista = new problema_de_Josephus();
            cab = lista.CrearLista(cab);
            int opcion, numero, dato;
            nodo p;
            do {
                System.out.println("\nMenú");
                System.out.println("1. Insertar soldados");
                System.out.println("2. Mostrar lista con soldados");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("6. ");
                System.out.println("7. ");
                System.out.println("8. Salir");
                System.out.println("Digite la opción");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: //Insertar soldados
                        numero = rnd.nextInt(100);
                        cab = lista.InsertarInicio(cab, numero);
                        break;

                    case 2://Mostrar lista con soldados
                        lista.MostrarLista(cab);
                        break;

                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                        break;

                    case 7: 
                        break;

                    default:
                        System.out.println("Salió u Opción errada");

                }
            } while (opcion != 8);
        }

    }
}
