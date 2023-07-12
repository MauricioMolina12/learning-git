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
                System.out.println("está vacia o hay un elemento");
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

        public nodo borrar_primero(nodo cab) {
            nodo p;
            if (cab.sig == null || cab == null) {
                System.out.println("está vacia o hay un elemento");

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
                System.out.println("está vacia o hay un elemento");
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

        public nodo jose(nodo cab) {
            nodo p, q = null;
            int dado;
            if (cab == null || cab.sig == cab && cab.ant == cab) {
                System.out.println("No se puede realizar");
            } else {
                while (cab.sig != cab) {
                    int con = 1;
                    p = cab;
                    Random rnd = new Random();
                    dado = rnd.nextInt(5) + 1;
                    System.out.println("Numero del dado = " + dado);
                    while (con < dado) {
                        p = p.sig;
                        con++;
                    }
                    System.out.println("Codigo del soldado eliminado es " + p.dato);
                    p.ant.sig = p.sig;
                    p.sig.ant = p.ant;
                    cab = p.sig;
                    MostrarLista(cab);
                }
                System.out.println("************************************");
                System.out.println("Codigo del Soldado que va ir es " + cab.dato);
                System.out.println("************************************");
            }
            return cab;
        }

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        Listas_doble_enlazadas lista = new Listas_doble_enlazadas();
        cab = lista.CrearLista(cab);
        int opcion, numero, dato;
        nodo p;
        do {
            System.out.println("\nMENÚ LISTAS DOBLE-ENLAZADAS");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Muestre la Lista");
            System.out.println("4. Borrar primer nodo");
            System.out.println("5. Borrar ultimo nodo");
            System.out.println("6. Insertar antes de un número con información X");
            System.out.println("7. Intercambiar primero con ultimo");
            System.out.println("8. Intercambiar un nodo con el anterior a él");
            System.out.println("9. Invertir lista");
            System.out.println("10.Eliminar elemento encontrado");
            System.out.println("11. el problema de jose");
            System.out.println("15. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Insertar al inicio
                    numero = rnd.nextInt(10);
                    cab = lista.InsertarInicio(cab, numero);
                    break;

                case 2: //Insertar al final
                    numero = rnd.nextInt(10);
                    cab = lista.Insertar_Final(cab, numero);
                    break;

                case 3://Mostrar lista
                    lista.MostrarLista(cab);
                    break;
                case 4://Borrar primer nodo
                    cab = lista.borrar_primero(cab);
                    break;

                case 5://Borrar ultimo nodo
                    cab = lista.borrar_ultimo(cab);

                    break;

                case 6: //Insertar_Antesde

                    System.out.println("Digite número referencia");
                    dato = leer.nextInt();

                    numero = rnd.nextInt(30);

                    cab = lista.Insertar_Antesde(cab, numero, dato);

                    break;

                case 7: //Intercambiar primer y ultimo nodo

                    cab = lista.Cambiarprimeroyultimo(cab);

                    break;

                case 8: // Intercambiar con el anterior

                    System.out.println("Digite un número referencia");
                    dato = leer.nextInt();

                    cab = lista.intercambiar_con_el_interior(cab, dato);
                    break;

                case 9: // Invertir lista

                    cab = lista.invertir(cab);

                    break;

                case 10: // Eliminar lista

                    System.out.println("Digite número a eliminar");
                    numero = leer.nextInt();

                    cab = lista.Eliminar_Lista(cab, numero);

                    break;
                case 11:
                    cab = lista.jose(cab);
                    break;
                case 15:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 15);
    }
}
