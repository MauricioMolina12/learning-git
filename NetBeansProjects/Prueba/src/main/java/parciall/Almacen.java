/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;
/**
 *
 * @author FAMILIA ESCORCIA
 */

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Almacen {

    private ArrayList<productos> IngresarStock = new ArrayList<productos>();
    private ArrayList<venta> Ventas = new ArrayList<venta>();
    private ArrayList<inversion> Inversiones = new ArrayList<inversion>();

    public Almacen() {
    }

    public ArrayList<productos> getIngresarStock() {
        return IngresarStock;
    }

    public void setIngresarStock(ArrayList<productos> IngresarStock) {
        this.IngresarStock = IngresarStock;
    }

    public ArrayList<venta> getVentas() {
        return Ventas;
    }

    public void setVentas(ArrayList<venta> Ventas) {
        this.Ventas = Ventas;
    }

    public ArrayList<inversion> getInversiones() {
        return Inversiones;
    }

    public void setInversiones(ArrayList<inversion> Inversiones) {
        this.Inversiones = Inversiones;
    }

    public void AgregarProducto(int id, String nombre, double precio, int cantidad) {

        IngresarStock.add(new productos(id, nombre, precio, cantidad));
        JOptionPane.showMessageDialog(null, "Ingresado");

    }

    public void Dar_de_bajaProducto(int j) {

        IngresarStock.remove(j);
        JOptionPane.showMessageDialog(null, "Bajado");

    }

    public void agregarInversion(inversion inversionn) {
        this.Inversiones.add(inversionn);

        JOptionPane.showMessageDialog(null, "Inversion agregada");
    }

    public double ObtenerGanancia(double totalvent ,double totalinv, double obtGanancia) {
       obtGanancia = totalvent - totalinv;
       return obtGanancia;

    }

    public void AgregarVentas(venta ventas) {
        this.Ventas.add(ventas);
        JOptionPane.showMessageDialog(null, "Venta realizada");
    }

}