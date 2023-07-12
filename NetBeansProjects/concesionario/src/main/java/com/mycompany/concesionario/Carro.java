/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionario;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Carro {

    int COC;
    String Marca;
    String Modelo;
    double precio;
    String color;
    int stock;

    public Carro(int COC, String Marca, String Modelo, double precio, String color, int stock) {
        this.COC = COC;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.precio = precio;
        this.color = color;
        this.stock = stock;
    }

    public Carro() {
    }

    public int getCOC() {
        return COC;
    }

    public void setCOC(int COC) {
        this.COC = COC;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void ReducirStock(int stock) {

        this.stock -= stock;
    }

    public void notificar() {

        if (this.stock < 8) {

            JOptionPane.showMessageDialog(null, "CANTIDAD INFERIOR A 8 AUTOS EN STOCK!");
        }
    }

    public void NullE() {

        if (this.stock == 0) {

            JOptionPane.showMessageDialog(null, "STOCK EN 0!", "ERROR", HEIGHT);

        }
    }

}
