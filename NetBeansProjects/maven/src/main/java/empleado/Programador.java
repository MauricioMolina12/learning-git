/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author ASUS
 */
public class Programador extends Empleado{
    
    String LDP;

    public Programador(String LDP, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.LDP = LDP;
    }

    public Programador() {
        super(null, 0, 0);
    }
    

    public String getLDP() {
        return LDP;
    }

    public void setLDP(String LDP) {
        this.LDP = LDP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("\nLenguaje de programación: " + this.LDP);
    }
    
    
}
