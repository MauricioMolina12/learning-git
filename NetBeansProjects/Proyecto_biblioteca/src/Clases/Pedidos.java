package Clases;

import java.util.ArrayList;
import java.util.*;

public class Pedidos {

    int id_usuario, cod_M;
    String tituloM;
    Lectores lector;
    Libros libro;
    Revistas revista;

    public Pedidos() {

    }

    public Pedidos(int id_usuario, int cod_M, String tituloM) {
        this.id_usuario = id_usuario;
        this.cod_M = cod_M;
        this.tituloM = tituloM;

    }

    public Pedidos(int id_usuario, int cod_M, String tituloM, Revistas revista) {
        this.id_usuario = id_usuario;
        this.cod_M = cod_M;
        this.tituloM = tituloM;
        this.revista = revista;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getCod_M() {
        return cod_M;
    }

    public void setCod_M(int cod_M) {
        this.cod_M = cod_M;
    }

    public String getTituloM() {
        return tituloM;
    }

    public void setTituloM(String tituloM) {
        this.tituloM = tituloM;
    }

    public Lectores getLector() {
        return lector;
    }

    public void setLector(Lectores lector) {
        this.lector = lector;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public Revistas getRevista() {
        return revista;
    }

    public void setRevista(Revistas revista) {
        this.revista = revista;
    }

    public void reservarl(ArrayList<Libros> libro, Scanner leer, ArrayList<Pedidos> Pedidos) {

        System.out.println("Digite id lector");
        int id = leer.nextInt();
        System.out.println("Digite código del material");
        int codigo = leer.nextInt();

        for (int i = 0; i < libro.size(); i++) {
            if (codigo == libro.get(i).codL) {
                if (libro.get(i).cantidadL > 0) {
                    System.out.println("Libro disponible.");
                    System.out.println("RESERVADO!");
                    libro.get(i).setCantidadL(libro.get(i).cantidadL - 1); //Le restará un libro del stock

                    Pedidos.add(new Pedidos(id, libro.get(i).codL, libro.get(i).tituloL));
                }
                if (libro.get(i).cantidadL == 0) {
                    System.out.println("libro no disponible."); //En caso tal no haya libros disponibles. porque la cantidad está en 0
                }
            }
        }
    }
    public void reservarr(ArrayList<Revistas> Revistas, Scanner leer, ArrayList<Pedidos> Pedidos) {

        System.out.println("Digite id lector");
        int id = leer.nextInt();
        System.out.println("Digite código del material");
        int codigo = leer.nextInt();

        for (int i = 0; i < Revistas.size(); i++) {
            if (codigo == Revistas.get(i).codR) {
                if (Revistas.get(i).cantidadR > 0) {
                    System.out.println("Revista disponible.");
                    System.out.println("RESERVADA!");
                    Revistas.get(i).setCantidadR(Revistas.get(i).cantidadR - 1); //Le restará un libro del stock

                    Pedidos.add(new Pedidos(id, Revistas.get(i).codR, Revistas.get(i).tituloR));
                }
                if (Revistas.get(i).cantidadR == 0) {
                    System.out.println("libro no disponible."); //En caso tal no haya libros disponibles. porque la cantidad está en 0
                }
            }
        }
    }


    
}
