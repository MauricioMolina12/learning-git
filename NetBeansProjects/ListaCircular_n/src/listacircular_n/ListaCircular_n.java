package com.mycompany.listacircular;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class ListaCircular_n {

    /**
     * @param args the command line arguments
     */
    static public class nodo {

        int dato;
        nodo sig;

        public nodo(int dato) {
            this.dato = dato;
            this.sig = null;

        }
    }

    static public nodo cab, cab2, cab3;

    static public class Listas_Enlazadas {

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
                System.out.print(p.dato + " ->>>");
            }
        }

        public nodo Insertar_Final(nodo cab, int info) {
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
            }
            return cab;
        }

        public void Buscar2(nodo cab, int num) {
            if (cab == null) {
                System.out.println("La lista esta vacia");
            } else {
                nodo p = cab;
                while (p != null && p.dato != num) {
                    p = p.sig;
                }
                if (p == null) {
                    System.out.println("No está en la lista");
                } else {
                    System.out.println("El dato si esta en la lista");
                };
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

        public nodo Insertar_Antesde(nodo cab, int num, int dato) {
            nodo p, q = null, r = null;
            p = Buscar(cab, dato);
            if (p == cab) {
                cab = InsertarInicio(cab, num);
            } else {
                p = cab;
                while (p != null && p.dato != dato) {
                    q = p;
                    p = p.sig;
                }
                if (p == null) {
                    System.out.println("El elemento no está en la lista");
                } else {
                    r = new nodo(num);
                    q.sig = r;
                    r.sig = p;
                }
            }
            return cab;
        }

        public int Contar_Lista(nodo cab) {
            return 0;
        }

        public nodo Eliminar_Lista(nodo cab, int num) {
            nodo p, q;
            if (ListaVacia(cab)) {
                System.out.println("La lista está vacía");
            } else {
                p = cab;
                q = null;
                while (p != null && p.dato != num) {
                    q = p;
                    p = p.sig;
                }
                if (p == null) {
                    System.out.println("El elemento no está en la lista");
                } else if (p == cab) {
                    cab = p.sig;
                    System.out.println("Elemento en cabeza eliminado");
                } else {
                    q.sig = p.sig;
                    System.out.println("El elemento ha sido eliminado");
                }
            }
            return cab;
        }

        public nodo Primer_Ultimo(nodo cab) {
            nodo p, q;
            if (cab.sig == null || cab == null) {
                System.out.println("No hay nodos para inverir");
            } else {
                p = cab;
                q = null;
                while (p.sig != null) {
                    q = p;
                    p = p.sig;

                }

                if (q != cab) {
                    System.out.println("cab " + cab.dato + "!= Q " + q.dato);
                    p.sig = cab.sig;
                    q.sig = cab;

                } else {
                    p.sig = cab;
                }
                cab.sig = null;
                cab = p;

            }
            //MostrarLista(cab);
            return cab;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ejemplo de Listas enlazadas simples");
        Listas_Enlazadas lista = new Listas_Enlazadas();
        cab = lista.CrearLista(cab);
        int opcion, numero, dato;
        nodo p;
        do {
            System.out.println("\nMENÚ LISTAS CIRCULARES");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Muestre la Lista");
            System.out.println("4. Crear Lista con numeros impares de primera lista");
            System.out.println("5. Muestre nueva Lista");
            System.out.println("6. Intermabia primero con último");
            System.out.println("7. Buscar un dato");
            System.out.println("8. intercambiar con el siguiente");
            System.out.println("10. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Insertar al inicio
                    numero = rnd.nextInt(100);
                    cab = lista.InsertarInicio(cab, numero);
                    break;

                case 2: //Insertar al final
                    numero = rnd.nextInt(100);
                    cab = lista.Insertar_Final(cab, numero);
                    break;

                case 3:
                    lista.MostrarLista(cab);
                    break;
                case 4:
                    cab2 = lista.CrearLista(cab2);
                    cab3 = lista.CrearLista(cab3);
                    if (lista.ListaVacia(cab)) {
                        System.out.println("La primera lista está vacia");
                    } else {
                        p = cab;
                        while (p != null) {
                            if ((p.dato % 2) != 0) {
                                cab2 = lista.Insertar_Final(cab2, p.dato);
                            } else {
                                cab3 = lista.Insertar_Final(cab3, p.dato);
                            }
                            p = p.sig;
                        }
                    }

                    break;
                case 5:
                    lista.MostrarLista(cab2);
                    lista.MostrarLista(cab3);
                    break;
                case 6: //Intercambia primero y ultimo
                    cab = lista.Primer_Ultimo(cab);
                    break;

                case 7: // Buscar un dato
                    System.out.println("Digite el dato a buscar");
                    dato = leer.nextInt();
                    cab = lista.Buscar(cab, dato);

                    break;//Insertar_Despuesde

                case 8:
                    System.out.println("ingrese un numero ");
                    int num = leer.nextInt();
                    cab = lista.intercambiar_el_siguiente(cab, num);
                    ;

                    break;
                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 10);
    }

}
