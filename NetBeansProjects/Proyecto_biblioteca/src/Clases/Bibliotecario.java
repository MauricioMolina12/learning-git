package Clases;

import java.util.ArrayList;
import java.util.*;

public class Bibliotecario implements Interfaz.InterfaceBiblioteca{

    int id;
    Pedidos pedido;

    public Bibliotecario() {
    }

    public Bibliotecario(int id, Pedidos pedido) {
        this.id = id;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public void registra_material(ArrayList<Libros> libro, ArrayList<Revistas> Revistas, Scanner leer, int m) {

        if (m == 1) {
            System.out.println("Perfecto! Quiere registrar un libro.");
            System.out.println("Digite el codigo de material");
            int codM = leer.nextInt();
            System.out.println("Digite el titulo");
            String titulo = leer.next();
            System.out.println("Digite el tipo");
            String tipo = leer.next();
            System.out.println("Digite el autor o autores");
            String autor = leer.next();
            System.out.println("Digite la editorial");
            String editorial = leer.next();
            System.out.println("Digite cantidad de libros");
            int can = leer.nextInt();
            libro.add(new Libros(titulo, tipo, autor, editorial, codM, can));
            System.out.println("Registro exitoso!");
        } else if (m == 2) {
            System.out.println("Perfecto! Quiere registrar una revista.");
            System.out.println("Digite el codigo de material");
            int codM = leer.nextInt();
            System.out.println("Digite el titulo");
            String titulo = leer.next();
            System.out.println("Digite el tipo");
            String tipo = leer.next();
            System.out.println("Digite el autor o autores");
            String autor = leer.next();
            System.out.println("Digite la editorial");
            String editorial = leer.next();
            System.out.println("Digite cantidad de revistas");
            int can = leer.nextInt();
            Revistas.add(new Revistas(titulo, tipo, autor, editorial, codM, can));
            System.out.println("Registro exitoso!");
        }

    }

    public void registrar_lectores(ArrayList<Estudiantes> estudiantes, ArrayList<Docentes> docentes, Scanner leer, int rl) {

        if (rl == 1) {
            System.out.println("Bien! Desea registrar un docente.");

            System.out.println("Digite identificación");
            int cod = leer.nextInt();
            System.out.println("Ingrese el nombre completo");
            String nombre = leer.next();
            System.out.println("Ingrese la direccion");
            String direccion = leer.next();
            System.out.println("Digite el telefono");
            int tele = leer.nextInt();
            docentes.add(new Docentes(cod, nombre, direccion, tele));
            System.out.println("Registro exitoso!");
        } else if (rl == 2) {
            System.out.println("Bien! Desea registrar un estudiante.");

            System.out.println("Digite identificación");
            int cod = leer.nextInt();
            System.out.println("Ingrese el nombre completo");
            String nombre = leer.next();
            System.out.println("Ingrese la direccion");
            String direccion = leer.next();
            System.out.println("Digite el telefono");
            int tele = leer.nextInt();

            estudiantes.add(new Estudiantes(cod, nombre, direccion, tele));
            System.out.println("Registro exitoso!");
        }

    }

    public void mostrar_material(ArrayList<Libros> libro, ArrayList<Revistas> Revistas, Scanner leer, int m) {

        if (m == 1) {
            System.out.println("Libros");
            for (int i = 0; i < libro.size(); i++) {
                System.out.println("Código: " + libro.get(i).codL);
                System.out.println("Titulo: " + libro.get(i).tituloL);
                System.out.println("Tipo: " + libro.get(i).tipoL);
                System.out.println("Autor: " + libro.get(i).autor);
                System.out.println("Editorial: " + libro.get(i).editorial);
                System.out.println("Cantidad disponible: " + libro.get(i).cantidadL);

            }
        } else if (m == 2) {
            System.out.println("Revistas");
            for (int i = 0; i < Revistas.size(); i++) {
                System.out.println("Código: " + Revistas.get(i).codR);
                System.out.println("Titulo: " + Revistas.get(i).tituloR);
                System.out.println("Tipo: " + Revistas.get(i).tipoR);
                System.out.println("Autor: " + Revistas.get(i).autorR);
                System.out.println("Editorial: " + Revistas.get(i).editorialR);
                System.out.println("Cantidad disponible: " + Revistas.get(i).cantidadR);

            }

        }
    }

    public void mostrar_lectores(ArrayList<Estudiantes> estudiantes, ArrayList<Docentes> docentes, Scanner leer, int rl) {
        if (rl == 1) {
            System.out.println("Docentes");
            for (int i = 0; i < docentes.size(); i++) {
                System.out.println("Código: " + docentes.get(i).cod_D);
                System.out.println("Nombre: " + docentes.get(i).nombre);
                System.out.println("Dirección: " + docentes.get(i).direccion);
                System.out.println("Teléfono: " + docentes.get(i).telefono);

            }

        }
        if (rl == 2) {
            System.out.println("Estudiantes");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println("Código: " + estudiantes.get(i).cod_E);
                System.out.println("Nombre: " + estudiantes.get(i).nombre);
                System.out.println("Dirección: " + estudiantes.get(i).direccion);
                System.out.println("Teléfono: " + estudiantes.get(i).telefono);

            }

        }

    }

    @Override
    public void entregar(ArrayList<Pedidos> Pedidos, Scanner leer, ArrayList<Libros> libro, ArrayList<Revistas> Revistas) {
        
    }

    @Override
    public void reservarl(ArrayList<Libros> libro, Scanner leer, ArrayList<Pedidos> Pedidos) {
       
    }

    @Override
    public void reservarr(ArrayList<Revistas> Revistas, Scanner leer, ArrayList<Pedidos> Pedidos) {
        
    }

}

