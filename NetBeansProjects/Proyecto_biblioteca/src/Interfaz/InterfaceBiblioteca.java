
package Interfaz;

import Clases.*;
import java.util.*;

public interface InterfaceBiblioteca {
    
    public void registra_material(ArrayList<Libros> libro, ArrayList<Revistas> Revistas, Scanner leer, int m);
    public void registrar_lectores(ArrayList<Estudiantes> estudiantes, ArrayList<Docentes> docentes, Scanner leer, int rl);
    public void mostrar_material(ArrayList<Libros> libro, ArrayList<Revistas> Revistas, Scanner leer, int m);
    public void mostrar_lectores(ArrayList<Estudiantes> estudiantes, ArrayList<Docentes> docentes, Scanner leer, int rl);
    public void entregar(ArrayList<Pedidos> Pedidos, Scanner leer, ArrayList<Libros> libro, ArrayList<Revistas> Revistas);
    public void reservarl(ArrayList<Libros> libro, Scanner leer, ArrayList<Pedidos> Pedidos);
    public void reservarr(ArrayList<Revistas> Revistas, Scanner leer, ArrayList<Pedidos> Pedidos);
}
