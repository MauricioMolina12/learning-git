package listas_circulares;

import java.util.*;

public class Listas_circulares {

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
                System.out.print(p.dato + " -> ");
                System.out.println("->->");
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

        public nodo insertar_orden1(nodo cab, int info) {
            if (cab == null) {
                cab = new nodo(info);
                cab.sig = cab;

            } else {
                nodo p = cab;
                while (p.sig != cab) {
                    p = p.sig;
                }
                if (cab.dato > info) {

                    nodo n = new nodo(info);
                    n.sig = cab;
                    p.sig = n;
                    cab = n;
                } else {
                    nodo n = cab;
                    while (n.sig != cab && n.sig.dato < info) {

                        n = n.sig;
                    }
                    nodo r = new nodo(info);
                    r.sig = n.sig;
                    n.sig = r;
                }
            }
            return cab;

        }

        public nodo insertar_orden2(nodo cab, int info) {
            if (cab == null) {
                cab = new nodo(info);
                cab.sig = cab;

            } else {
                nodo p = cab;
                while (p.sig != cab) {
                    p = p.sig;
                }
                if (cab.dato > info) {

                    nodo n = new nodo(info);
                    n.sig = cab;
                    p.sig = n;
                    cab = n;
                } else {
                    nodo n = cab;
                    while (n.sig != cab && n.sig.dato < info) {

                        n = n.sig;
                    }
                    nodo r = new nodo(info);
                    r.sig = n.sig;
                    n.sig = r;
                }
            }
            return cab;

        }

        public nodo borrar_inicio(nodo cab) {
            nodo p;

            if (cab == null || cab.sig == cab) {
                System.out.println("No se puede hacer nada porque está vacía o hay un solo nodo");
            } else {
                p = cab;
                while (p.sig != cab) {
                    p = p.sig;

                }
                p.sig = cab.sig;
                cab = p.sig;

            }
            return cab;
        }

        public nodo borrar_final(nodo cab) {
            nodo p, q;
            if (cab == null || cab.sig == cab) {
                System.out.println("No se puede hacer nada porque está vacía o hay un solo nodo");
            } else {
                p = cab;
                q = null;
                while (p.sig != cab) {
                    q = p;
                    p = p.sig;
                }
                q.sig = cab;
            }

            return cab;
        }

        public nodo insertar_orden(int info, nodo cab) {
            if (cab == null) {
                cab = new nodo(info);
                cab.sig = cab;

            } else {
                nodo p = cab;
                while (p.sig != cab) {
                    p = p.sig;
                }
                if (cab.dato > info) {

                    nodo n = new nodo(info);
                    n.sig = cab;
                    p.sig = n;
                    cab = n;
                } else {
                    nodo n = cab;
                    while (n.sig != cab && n.sig.dato < info) {

                        n = n.sig;
                    }
                    nodo r = new nodo(info);
                    r.sig = n.sig;
                    n.sig = r;
                }
            }
            MostrarLista(cab);
            return cab;

        }

        public nodo Primer_Ultimo(nodo cab) {
            nodo p, q;
            if (cab == null || cab.sig == cab) {
                System.out.println("No hay nodos para inverir");
            } else {
                p = cab;
                q = null;
                while (p.sig != cab) {
                    q = p;
                    p = p.sig;

                }

                if (q != cab) {
                    p.sig = cab.sig;
                    q.sig = cab;

                } else {
                    p.sig = cab;
                }
                cab.sig = p;
                cab = p;

            }
            MostrarLista(cab);
            return cab;
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
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ejemplo de Listas enlazadas simples");
        Listas_Enlazadas lista = new Listas_Enlazadas();
        Listas_Enlazadas lista2 = new Listas_Enlazadas();
        Listas_Enlazadas lista3 = new Listas_Enlazadas();
        cab = lista.CrearLista(cab);
        cab2 = lista2.CrearLista(cab2);
        cab3 = lista3.CrearLista(cab3);
        int opcion, numero, dato;
        nodo p;
        do {
            System.out.println("\nMENÚ LISTAS CIRCULARES");
            System.out.println("1. Insertar inicio");
            System.out.println("2. Insertar final ");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Intermabia primero con último");
            System.out.println("5. Insertar ordenadamente");
            System.out.println("6. Borrar primer nodo");
            System.out.println("7. Borrar ultimo nodo");
            System.out.println("8. Intercambiar un número con el siguiente");
            System.out.println("10. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Insertar en lista 1
                    dato = rnd.nextInt(100);
                    cab = lista.InsertarInicio(cab, dato);
                    break;

                case 2: //Insertar en lista 2
                    dato = rnd.nextInt(100);
                    cab = lista.Insertar_Final(cab, dato);
                    break;

                case 3:
                    lista.MostrarLista(cab);
                    break;
                case 4: //Intercambia primero y ultimo
                    cab = lista.Primer_Ultimo(cab);
                    break;
                case 5: //Insertar ordenadamente

                    dato = rnd.nextInt(100);

                    cab3 = lista.insertar_orden(dato, cab3);

                    break;

                case 6:// Borrar primer nodo

                    cab = lista.borrar_inicio(cab);

                    break;
                case 7:// Borrar ultimo nodo

                    cab = lista.borrar_final(cab);
                    break;

                case 8:

                    System.out.println("ingrese un número referencia");
                    int num = leer.nextInt();
                    cab = lista.intercambiar_el_siguiente(cab, num);

                    break;
                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 10);
    }

}
