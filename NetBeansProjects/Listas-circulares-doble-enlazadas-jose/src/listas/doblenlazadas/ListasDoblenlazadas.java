package listas.doblenlazadas;

import java.util.*;

public class ListasDoblenlazadas {

    static public class nodo {

        int dato;
        nodo sig;
        nodo ant;

        public nodo(int dato) {
            this.dato = dato;
            this.sig = null;
            this.ant = null;
        }
    }

    static public nodo cab, cab2, cab3;

    static public class Listas_doble_enlazadas {

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
            } else {
                nodo q = new nodo(info);
                nodo p = new nodo(info);
                q.sig = cab;
                cab.ant = q;
                cab.sig = q;
                q.ant = cab;
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
                System.out.println("->");
            }
        }

        public nodo Cambiarprimeroyultimo(nodo cab) {
            nodo n;
            if (cab.sig == null || cab == null) {
                System.out.println("Está vacia o hay un elemento");
            } else {
                n = cab;
                while (n.sig != null) {
                    n = n.sig;

                }

                if (n != cab) {

                    n.ant.sig = cab;
                    cab.ant = n.ant;
                    cab.sig.ant = n;
                    n.sig = cab.sig;
                } else {
                    n.sig = cab;
                }
                cab.sig = null;
                cab = n;

            }
            MostrarLista(cab);
            return cab;
        }

        public nodo Insertar_Final(nodo cab, int num) {
            if (cab == null) {
                cab = new nodo(num);
                cab.sig = cab;
                cab.ant = cab;
            } else {
                nodo p;
                nodo q = new nodo(num);
                p = cab;
                while (p.sig != cab) {
                    p = p.sig;
                }
                p.sig = q;
                q.ant = p;
                q.sig = cab;
                cab.ant = q;
            }
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

        public nodo borrar_primero(nodo cab) {
            nodo p;
            if (cab.sig == null || cab == null) {
                System.out.println("Está vacía o hay un elemento");

            } else {
                p = cab;
                while (p.sig != null) {
                    p = p.sig;

                }
                cab = cab.sig;
                cab.ant.sig = null;
                cab.ant = null;

                MostrarLista(cab);

            }
            return cab;
        }

        public nodo borrar_ultimo(nodo cab) {
            nodo p;
            if (cab.sig == null || cab == null) {
                System.out.println("Está vacía o hay un elemento");
            } else {
                p = cab;
                while (p.sig != null) {
                    p = p.sig;

                }
                p.ant.sig = null;
                p.ant = null;

            }
            MostrarLista(cab);
            return cab;
        }

        public nodo invertir(nodo cab) {
            nodo p;
            if (cab.sig == null || cab == null) {
                System.out.println("Está vacía o hay un solo elemento");
            } else {
                p = cab;
                nodo q = null;
                while (p != cab) {
                    p.ant = p.sig;
                    p.sig = q;
                    q = p;
                    p = p.ant;
                }
                cab = q;
            }
            MostrarLista(cab);
            return cab;

        }

        public nodo Insertar_Antesde(nodo cab, int num, int dato) {
            nodo p, q = null, r = null;
            p = Buscar(cab, dato);
            if (p == cab) {
                cab = InsertarInicio(cab, num);
            } else {
                p = cab;
                while (p != null && p.dato != dato) {
                    p = p.sig;
                }
                if (p == null) {
                    System.out.println("El elemento no está en la lista");
                } else {
                    r = new nodo(num);
                    p.ant.sig = r;
                    r.ant = p.ant;
                    r.sig = p;
                    p.ant = r;
                }
            }
            MostrarLista(cab);
            return cab;
        }

        public nodo intercambiar_con_el_interior(nodo cab, int dato) {
            nodo p;
            if (cab == null || cab.sig == null) {
                System.out.println("No se puede");
            } else {
                p = cab;
                while (p != null && p.dato != dato) {
                    p = p.sig;
                }
                if (p.sig == null && p.dato != dato) {
                    System.out.println("el dato no se ha encontrado");
                } else if (p == cab) {
                    System.out.println("no se puede intercambiar con el anterior por que no hay nodos atras");
                } else if (p.sig == null) {

                    p.ant.ant.sig = p;
                    p.sig = p.ant;
                    p.sig.ant = p;
                    p.ant = p.ant.ant;
                    p.sig.sig = null;
                } else if (p.sig != null && p.ant == cab) {

                    p.ant.sig = p.sig;
                    p.sig.ant = p.ant;
                    p.sig = p.ant;
                    p.ant = null;
                    cab = p;

                } else {

                    p.ant.sig = p.sig;
                    p.sig.ant = p.ant;
                    p.ant.ant.sig = p;
                    p.sig = p.ant;
                    p.ant = p.ant.ant;
                    p.sig.ant = p;
                }
            }
            return cab;
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
            MostrarLista(cab);
            return cab;
        }

        public nodo programa(nodo cab) {
            nodo p, q = null;
            int azar;
            if (cab == null || cab.sig == cab && cab.ant == cab) {
                System.out.println("No se puede realizar");
            } else {
                while (cab.sig != cab) {
                    int con = 1;
                    p = cab;
                    Random rnd = new Random();
                    azar = rnd.nextInt(5) + 1;
                    System.out.println("Numero del dado = " + azar);
                    while (con < azar) {
                        p = p.sig;
                        con++;
                    }
                    System.out.println("Soldado " + p.dato + " eliminado");
                    p.ant.sig = p.sig;
                    p.sig.ant = p.ant;
                    cab = p.ant;
                    MostrarLista(cab);
                }
                System.out.println("\n");
                System.out.println("--------------------------------------------");
                System.out.println("El soldado "+cab.dato+ " es el que irá");
                
            }
            return cab;
        }

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Programa problema de José- listas circularers Doble-enlazadas");
        Listas_doble_enlazadas lista = new Listas_doble_enlazadas();
        cab = lista.CrearLista(cab);
        int opcion; 
        int numero;
        int dato;
        nodo p;
        do {
            System.out.println("\nMENÚ" );
            System.out.println("1. Agregar soldados");
            System.out.println("2. Mostrar grupo de soldados");
            System.out.println("3. Comenzar escogencia del soldado que irá");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Ingresar soldados
                    numero = rnd.nextInt(900)+100;
                    cab = lista.Insertar_Final(cab, numero);
                    break;

                case 2: //Mostrar soldados
                    lista.MostrarLista(cab);
                    break;

                case 3://Escogencia
                    cab = lista.programa(cab);
                    break;
                case 4://Salir
                    System.exit(0);
                    break;

                default:
                    System.out.println("Salir u opción errada");

            }
        } while (opcion != 4);
    }

}
