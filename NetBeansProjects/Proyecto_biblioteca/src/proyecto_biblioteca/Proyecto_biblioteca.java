package proyecto_biblioteca;

import Clases.Bibliotecario;
import Clases.Docentes;
import Clases.Estudiantes;
import Clases.Libros;
import Clases.Pedidos;
import Clases.Revistas;
import java.util.ArrayList;
import java.util.*;

public class Proyecto_biblioteca {

    static ArrayList<Docentes> dc = new ArrayList<Docentes>();
    static ArrayList<Estudiantes> et = new ArrayList<Estudiantes>();
    static ArrayList<Libros> l = new ArrayList<Libros>();
    static ArrayList<Revistas> r = new ArrayList<Revistas>();
    static ArrayList<Pedidos> p = new ArrayList<Pedidos>();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Bibliotecario bl = new Bibliotecario();
        Pedidos pd = new Pedidos();
        Docentes d = new Docentes(null, null, 0);
        Estudiantes e = new Estudiantes(null, null, 0);
        int b = 0;
        int tu = 0;
        do {
            System.out.println("---MENÚS---");
            System.out.println("1.Menú Bibliotecario.");
            System.out.println("2.Menú Lector.");
            System.out.println("3.Salir");
            tu = leer.nextInt();
            if (tu == 1) {
                System.out.println("");
                System.out.println("------------------------------------------------");
                System.out.println("---Menú Bibliotecario---");
                System.out.println("1.Registrar lectores.");
                System.out.println("2.Registrar material.");
                System.out.println("3.Mostrar lectores.");
                System.out.println("4.Mostrar materiales.");
                System.out.println("5.Salir");
                System.out.println("------------------------------------------------");
                System.out.println("");
                b = leer.nextInt();

                switch (b) {
                    case 1:
                        System.out.println("---Registrar lectores---");
                        System.out.println("1.Para registrar docentes");
                        System.out.println("2.Para registrar estudiantes");
                        System.out.println("--------------------------------------------");
                        System.out.println("");
                        int rl = leer.nextInt();
                        bl.registrar_lectores(et, dc, leer, rl);
                        break;
                    case 2:
                        System.out.println("---Registrar material---");
                        System.out.println("1.Registrar libro");
                        System.out.println("2.Registrar revista");
                        System.out.println("--------------------------------------------");
                        System.out.println("");
                        int m = leer.nextInt();
                        bl.registra_material(l, r, leer, m);
                        break;

                    case 3:
                        if (dc.size() > 0 || et.size() > 0) {
                            System.out.println("---Imprimir datos lectores---");
                            System.out.println("1.Datos docentes.");
                            System.out.println("2.Datos estudiantes.");
                            rl = leer.nextInt();
                            System.out.println("--------------------------------------------");
                            System.out.println("");
                            bl.mostrar_lectores(et, dc, leer, rl);
                        } else {
                            System.out.println("Primero debes registar un lector.");
                        }
                    case 4:
                        if (l.size() > 0 || r.size() > 0) {
                            System.out.println("---Imprimir datos materiales---");
                            System.out.println("1.Datos libro");
                            System.out.println("2.Datos revista");
                            m = leer.nextInt();
                            bl.mostrar_material(l, r, leer, m);
                        } else {
                            System.out.println("Primero debes registrar un material.");
                        }
                        break;
                    case 5:

                        System.out.println("---MENÚS---");
                        System.out.println("1.Menú Bibliotecario.");
                        System.out.println("2.Menú Lector.");
                        tu = leer.nextInt();

                        break;

                    default:
                        System.out.println("Opción errada");
                        break;
                }

            }
            if (tu == 2) {
                System.out.println("---Menú lector---");
                System.out.println("1.Reservar");
                System.out.println("2.Devolver");

                int le = leer.nextInt();

                switch (le) {
                    case 1:
                        if (dc.size() == 0 && et.size() == 0) {
                            System.out.println("No puedes reservar sin antes haberte registrado un lector.");

                        } else if (l.size() == 0 && r.size() == 0) {
                            System.out.println("No hay libros disponibles");

                        } else {
                            System.out.println("---Reservar---");
                            System.out.println("¿Tipo de usuario?");
                            System.out.println("1.Docentes");
                            System.out.println("2.Estudiantes");
                            System.out.println("--------------------------------------------");
                            System.out.println("");
                            int re = leer.nextInt();

                            System.out.println("¿Tipo de material?");
                            System.out.println("1.Libro");
                            System.out.println("2.Revista");
                            int mat = leer.nextInt();
                            if (mat == 1) {
                                pd.reservarl(l, leer, p);
                            } else {

                                pd.reservarr(r, leer, p);

                            }
                        }
                        break;

                    case 2:
                        System.out.println("---Devolver---");
                        System.out.println("1.Docentes");
                        System.out.println("2.Estudiantes");
                        System.out.println("------------------------------------------------");
                        System.out.println("");
                        int de = leer.nextInt();
                        if (de == 1) {
                            d.entregar(p, leer, l, r);
                        } else if (de == 2) {

                            e.entregar(p, leer, l, r);
                        }
                        break;

                }

            }
        } while (tu != 3);

    }

}
