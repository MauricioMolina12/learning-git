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
public class Revistas {
    
    private String titulo_r;
    public String tipo_r;
    private int cod_r;
    private String autor_r;
    public int edicion;

    public Revistas(String titulo_r, String tipo_r, int cod_r, String autor_r, int edicion) {
        this.titulo_r = titulo_r;
        this.tipo_r = tipo_r;
        this.cod_r = cod_r;
        this.autor_r = autor_r;
        this.edicion = edicion;
    }

    public String getTitulo_r() {
        return titulo_r;
    }

    public void setTitulo_r(String titulo_r) {
        this.titulo_r = titulo_r;
    }

    public String getTipo_r() {
        return tipo_r;
    }

    public void setTipo_r(String tipo_r) {
        this.tipo_r = tipo_r;
    }

    public int getCod_r() {
        return cod_r;
    }

    public void setCod_r(int cod_r) {
        this.cod_r = cod_r;
    }

    public String getAutor_r() {
        return autor_r;
    }

    public void setAutor_r(String autor_r) {
        this.autor_r = autor_r;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    

    
}
