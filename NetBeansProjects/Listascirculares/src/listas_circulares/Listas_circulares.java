
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

        public nodo jose(nodo cab, int numero) {
            nodo p, q = null;
            int c = 1;
            if (cab == null || cab.sig == cab) {
                System.out.println("No se puede");
            } else {
                p = cab;
                q = null;

                while (c < numero) {
                    q = p;
                    p = p.sig;
                    c++;
                }
                System.out.println("Soldado " + p.dato + " eliminado");

                if (p == cab) {
                    p = p.sig;
                    while (p != cab) {
                        q = p;
                        p = p.sig;
                    }
                    q.sig = p.sig;
                    cab = p.sig;

                } else {
                    q.sig = p.sig;
                    cab = p.sig;
                    p = q;
                }

                MostrarLista(cab);
            }
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
        System.out.println("Problema de José-uni-enlazadas");
        Listas_Enlazadas lista = new Listas_Enlazadas();
        cab = lista.CrearLista(cab);
        int opc;
        int numero;
        int dato;
        int azar;
        nodo p;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Agregar soldados");
            System.out.println("2. Mostrar grupo de soldados");
            System.out.println("3. Comenzar escogencia del soldado que irá");
            System.out.println("4. Salir");
            System.out.println("DIGITE LA OPCIÓN");
            opc = leer.nextInt();
            switch (opc) {
                case 1: //Ingresar soldados
                    dato = rnd.nextInt(900) + 100;
                    cab = lista.InsertarInicio(cab, dato);
                    break;

                case 2: //Mostrar lista
                    lista.MostrarLista(cab);
                    break;

                case 3: //Escogencia
                    while (cab.sig != cab) {
                        azar = rnd.nextInt(5) + 1;
                        System.out.println("Numero a contar : " + azar);
                        cab = lista.jose(cab, azar);
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("El soldado "+cab.dato+ " es el que irá");
                    break;
                case 4: //Salir
                    System.exit(0);
                    break;

                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opc != 4);
    }

}
