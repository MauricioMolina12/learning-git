/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textos;

/**
 *
 * @author ASUS
 */
public class Libros {
    
    private String titulo_l;
    public String tipo_l;
    private int cod_l;
    public String autor_l;
    public String editorial_l;

    public Libros(String titulo_l, String tipo_l, int cod_l, String autor_l, String editorial_l) {
        this.titulo_l = titulo_l;
        this.tipo_l = tipo_l;
        this.cod_l = cod_l;
        this.autor_l = autor_l;
        this.editorial_l = editorial_l;
    }

    public String getTitulo_l() {
        return titulo_l;
    }

    public void setTitulo_l(String titulo_l) {
        this.titulo_l = titulo_l;
    }

    public String getTipo_l() {
        return tipo_l;
    }

    public void setTipo_l(String tipo_l) {
        this.tipo_l = tipo_l;
    }

    public int getCod_l() {
        return cod_l;
    }

    public void setCod_l(int cod_l) {
        this.cod_l = cod_l;
    }

    public String getAutor_l() {
        return autor_l;
    }

    public void setAutor_l(String autor_l) {
        this.autor_l = autor_l;
    }

    public String getEditorial_l() {
        return editorial_l;
    }

    public void setEditorial_l(String editorial_l) {
        this.editorial_l = editorial_l;
    }

    
    
}
