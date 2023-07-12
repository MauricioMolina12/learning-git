package listasordenadas;

import java.util.Random;
import java.util.Scanner;

public class Listasordenadas {

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
            } else {
                nodo p = new nodo(info);
                p.sig = cab;
                cab = p;
            }
            return cab;
        }

        public void MostrarLista(nodo cab) {
            if (ListaVacia(cab)) {
                System.out.println("La lista está vacía");
            } else {
                nodo p = cab;
                while (p != null) {
                    System.out.print(p.dato + " -> ");
                    p = p.sig;
                }
                System.out.println("null");
            }
        }

        public nodo Insertar_Final(nodo cab, int num) {
            if (cab == null) {
                cab = new nodo(num);
            } else {
                nodo p = cab;
                while (p.sig != null) {
                    p = p.sig;
                }
                nodo q = new nodo(num);
                p.sig = q;
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
            MostrarLista(cab);
            return cab;
        }

        public nodo Insertar_despuesde(nodo cab, int num, int dato) {

            nodo p, q = null, r = null;
            p = Buscar(cab, dato);
            if (p == cab) {
                r = new nodo(num);
                r.sig=p.sig;
                p.sig = r;
            } else {
                p = cab;
                while (p.sig != null && p.dato != dato) {
                    q = p;
                    p = p.sig;
                }
                if (p == null) {
                    System.out.println("El elemento no está en la lista");

                } else {
                    r = new nodo(num);
                    q = p.sig;
                    p.sig = r;
                    r.sig = q;
                }
            }
            MostrarLista(cab);
            return cab;
        }

        public nodo listaordenada(nodo cab, int dato) {
            if (cab == null) {
                cab = new nodo(dato);
            } else {
                if (cab.dato > dato) {
                    nodo n = new nodo(dato);
                    n.sig = cab;
                    cab = n;
                } else {
                    nodo a = cab;
                    while (a.sig != null && a.sig.dato < dato) {
                        a = a.sig;
                    }
                    nodo t = new nodo(dato);
                    t.sig = a.sig;
                    a.sig = t;
                }
            }
            MostrarLista(cab);
            return cab;

        }

        public nodo invertirlista(nodo cab) {
            nodo cab2, fin, p = null, q = null;
            if (cab == null || cab.sig == null) {
                System.out.println("No es posible, vacia.");
            } else {
                fin = null;
                cab2 = null;
                while (cab.sig != fin) {
                    p = cab;
                    q = null;
                    while (p.sig != fin) {
                        q = p;
                        p = p.sig;
                    }
                    if (fin == null) {
                        cab2 = p;
                        p.sig = q;
                        fin = p;
                    }
                    p.sig = q;
                    fin = p;
                }
                cab.sig = null;
                cab = cab2;
            }
            MostrarLista(cab);
            return cab;

        }

        public nodo Cambiarprimeroyultimo(nodo cab) {
            nodo p, q;
            if (cab.sig == null || cab == null) {
                System.out.println("está vacia o hay un elemento");
            } else {
                p = cab;
                q = null;
                while (p.sig != null) {
                    q = p;
                    p = p.sig;

                }

                if (q != cab) {

                    p.sig = cab.sig;
                    q.sig = cab;
                } else {
                    p.sig = cab;
                }
                cab.sig = null;
                cab = p;

            }
            MostrarLista(cab);
            return cab;
        }

        public nodo borrar_primer_nodo(nodo cab) {
            if (cab != null) {
                cab = cab.sig;
            }
            MostrarLista(cab);
            return cab;
        }

        public nodo borrar_ultimo_nodo(nodo cab) {
            nodo q = null, p = cab;
            if (cab == null || cab.sig == null) {
                System.out.println("No hay nodos para borrar");

            } else {
                q = null;
                p = cab;

            }
            while (p.sig != null) {
                q = p;
                p = p.sig;
            }
            if (q != cab) {
                q.sig = null;

            } else {
                cab = null;
            }
            MostrarLista(cab);
            return cab;
        }

        public nodo intercambiar_elemento_siguiente(nodo cab, int dato) {
            nodo q = null, p = cab, r;
            if (cab == null || cab.sig == null) {
                System.out.println("No se puede hacer nada");
            } else {
                q = null;
                p = cab;

                while (p != null && p.dato != dato) {
                    q = p;
                    p = p.sig;
                }
                if (p != null && p.sig != null) {
                    if (p == cab) {
                        r = cab.sig;
                        cab.sig = r.sig;
                        r.sig = cab;
                        cab = r;
                    } else {
                        q.sig = p.sig;
                        p.sig = p.sig.sig;
                        q.sig.sig = p;
                    }
                }
            }
            MostrarLista(cab);
            return cab;
        }

        public nodo intercambiar_el_anterior(nodo cab, int numero) {

            nodo p, q = null, r = null;

            if (cab == null || cab.sig == null) {
                System.out.println("No se puede");
            } else {
                p = cab;
                q = null;
                r = null;

                while (p != null && p.dato != numero) {
                    r = q;
                    q = p;
                    p = p.sig;
                }

                if (p != null) {

                    if (p == cab) {
                        System.out.println("No se puede");

                    } else if (p == cab.sig) {
                        q.sig = p.sig;
                        p.sig = q;
                        cab = p;

                    } else {

                        r.sig = p;
                        q.sig = p.sig;
                        p.sig = q;

                    }

                    MostrarLista(cab);

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
            System.out.println("\nMENÚ LISTAS ENLAZADAS");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Muestre la Lista");
            System.out.println("4. Insertar ordenadamente");
            System.out.println("5. Intercambiar primer con ultimo nodo");
            System.out.println("6. Intercambiar un nodo con el siguiente");
            System.out.println("7. Intercambiar un nodo con el anterior");
            System.out.println("8. Invertir una lista");
            System.out.println("9. Borrar al inicio");
            System.out.println("10.Borrar al final");
            System.out.println("11.Eliminar un número encontrado");
            System.out.println("12.Insertar después de un número con información X");
            System.out.println("13.Insertar antes de un número con información X");
            System.out.println("16. Salir");
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

                case 3: //Mostrar lista
                    lista.MostrarLista(cab);
                    break;
                case 4: //Insertar ordenadamente
                    numero = rnd.nextInt(10);
                    cab = lista.listaordenada(cab, numero);
                    break;

                case 5: //Cambiar primer y ultimo nodo
                    cab = lista.Cambiarprimeroyultimo(cab);
                    break;

                case 6: //Intercambiar un nodo con el siguiente

                    System.out.println("Digite numero referencia");
                    dato = leer.nextInt();
                    cab = lista.intercambiar_elemento_siguiente(cab, dato);
                    break;

                case 7: //Intercambiar un nodo con el anterior
                    System.out.println("Digite numero referencia");
                    numero = leer.nextInt();
                    cab = lista.intercambiar_el_anterior(cab, numero);
                    break;

                case 8: // Invertir 
                    cab = lista.invertirlista(cab);
                    break;

                case 9: //Borrar primer nodo
                    cab = lista.borrar_primer_nodo(cab);
                    break;

                case 10://Borrar ultimo nodo
                    cab = lista.borrar_ultimo_nodo(cab);
                    break;

                case 11://Eliminar elementos de la lista

                    System.out.println("Digite elemento a eliminar en la lista");
                    numero = leer.nextInt();
                    cab = lista.Eliminar_Lista(cab, numero);
                    break;
                case 12: //Insertar después de 
                    System.out.println("Digite número de referencia");
                    dato = leer.nextInt();
                    numero = rnd.nextInt(30);
                    cab = lista.Insertar_despuesde(cab, numero, dato);
                    break;
                case 13: //Insertar antes de
                    System.out.println("Digite número de referencia");
                    dato = leer.nextInt();
                    numero = rnd.nextInt(30);
                    cab = lista.Insertar_Antesde(cab, numero, dato);
                    break;
                case 16:
                    System.exit(0);
                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 16);
    }

}
