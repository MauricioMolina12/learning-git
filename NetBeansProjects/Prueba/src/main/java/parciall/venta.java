/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class venta {

    private productos prod;
    private double total;
    private double efectivo;
    private int cant;
    private int idventa;
    private double vuelto;
    private LocalDate fecha;

    public venta(productos prod, double total, double efectivo, int cant, int idventa, double vuelto, LocalDate fecha) {
        this.prod = prod;
        this.total = total;
        this.efectivo = efectivo;
        this.cant = cant;
        this.idventa = idventa;
        this.vuelto = vuelto;
        this.fecha = fecha;
    }

    public productos getProd() {
        return prod;
    }

    public void setProd(productos prod) {
        this.prod = prod;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public void CalcularVuelto() {

        double vuelto = 0;

        vuelto = this.efectivo - this.total;

        JOptionPane.showMessageDialog(null, "Vuelto:" + vuelto);
    }

    public void ImprimirFactura() {
        
            
            JOptionPane.showMessageDialog(null, 
                    "\nFecha de la venta " + this.fecha
                    + "\nCódigo producto : " + prod.getId()
                    + "\nProducto :" + prod.getNombre()
                    + "\nPrecio : " + prod.getPrecio()
                    + "\nCantidad : " + this.cant
                    + "\nTotal a pagar :" + this.total
                    + "\nEfectivo :" + this.efectivo
                    + "\nVuelto :" + this.vuelto);


    }

}
