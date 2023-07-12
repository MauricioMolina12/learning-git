package listasordenadas;

import java.util.Random;
import java.util.Scanner;

public class Listasordenadas {

    static public class nodo {

        double dato;
        nodo sig;

        public nodo(double dato) {
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

        public nodo InsertarInicio(nodo cab, double info) {
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

        public nodo Insertar_Final(nodo cab, double num) {
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

        public nodo Buscar(nodo cab, double num) {
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
                r.sig = p.sig;
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

        public nodo mayor_y_menor_nota(nodo cab) {
            nodo p;
            double mayor = 0;
            double menor = 5000;
            double suma = 0;
            int n = 0;
            double promedio = 0;
            if (cab == null || cab.sig == null) {
                System.out.println("Tiene que primero ingresar notas para luego comparar cual es mayor y cual es menor");
            } else {
                p = cab;
                while (p != null) {
                    suma = suma + p.dato;
                    n = n + 1;

                    if (p.dato > mayor) {
                        mayor = p.dato;

                    }
                    if (p.dato < menor) {
                        menor = p.dato;
                    }
                    p = p.sig;
                }

                promedio = suma / n;

            }
            MostrarLista(cab);
            System.out.println("El mayor es: " + mayor);
            System.out.println("El menor es: " + menor);
            System.out.println("El promedio es: " + promedio);
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
        int opcion;
        double numero;
        double dato;
        nodo p;
        do {
            System.out.println("\nPrograma para almacenar notas de un parcial");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Muestre la mayor, menor y el promedio");
            System.out.println("3. Salir");
            System.out.println("Digite la opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: //Ingresar las notas
                    System.out.println("Digite las notas");
                    numero = leer.nextDouble();
                    cab = lista.InsertarInicio(cab, numero);
                    break;

                case 2: //Mostrar las notas
                    lista.mayor_y_menor_nota(cab);
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Salió u Opción errada");

            }
        } while (opcion != 4);
    }

}
