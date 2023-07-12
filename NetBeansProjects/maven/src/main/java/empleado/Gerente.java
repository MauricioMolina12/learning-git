/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author ASUS
 */
public class Gerente extends Empleado{
    
    String departamento;

    public Gerente(String departamento, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public Gerente() {
        super(null, 0, 0);
    }
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        System.out.println("\nDepartamento: " + this.departamento);
          
    }


    
    
}
