package Clases;

import java.util.ArrayList;
import java.util.*;

abstract public class Lectores {

    String nombre, direccion;
    int telefono;
    protected ArrayList<Pedidos> Pedidos;

    public Lectores(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void entregar(ArrayList<Pedidos> Pedidos, Scanner leer, ArrayList<Libros> libro, ArrayList<Revistas> Revistas) {

        System.out.println("---Devolver material---");
        System.out.println("1.Libro");
        System.out.println("2.Revista");
        int tp = leer.nextInt();

        System.out.println("Digite id");
        int id = leer.nextInt();
        System.out.println("Código de material");
        int codigo = leer.nextInt();

        switch (tp) {
            case 1:
                for (int i = 0; i < Pedidos.size(); i++) {
                    if (codigo == libro.get(i).getCodL() && id == Pedidos.get(i).id_usuario) {
                        libro.get(i).setCantidadL(libro.get(i).cantidadL + 1);
                        System.out.println("Libro devuelto! Feliz día!");
                    }

                }
                break;
            case 2:
                for (int i = 0; i < Pedidos.size(); i++) {
                    if (codigo == Revistas.get(i).getCodR() && id == Pedidos.get(i).id_usuario) {
                        Revistas.get(i).setCantidadR(Revistas.get(i).cantidadR + 1);
                        System.out.println("Revista devuelta! Felíz día!");
                    }
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }

}
