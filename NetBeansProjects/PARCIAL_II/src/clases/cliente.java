/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ASUS
 */
public class cliente extends usuario{
    
    protected int Ncuenta;
    protected double saldo;

    public cliente(int Ncuenta, double saldo, String nombre, int id) {
        super(nombre, id);
        this.Ncuenta = Ncuenta;
        this.saldo = saldo;
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public void setNcuenta(int Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        
    }
    
    static public void retirar(){
        
    }
    
}
