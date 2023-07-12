/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

/**
 *
 * @author ASUS
 */
public class Pedido {
    
    private int id_usuario;
    public String titulo_material;
    private int cod_m;

    public Pedido(int id_usuario, String titulo_material, int cod_m) {
        this.id_usuario = id_usuario;
        this.titulo_material = titulo_material;
        this.cod_m = cod_m;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTitulo_material() {
        return titulo_material;
    }

    public void setTitulo_material(String titulo_material) {
        this.titulo_material = titulo_material;
    }

    public int getCod_m() {
        return cod_m;
    }

    public void setCod_m(int cod_m) {
        this.cod_m = cod_m;
    }
    
    
    
}
