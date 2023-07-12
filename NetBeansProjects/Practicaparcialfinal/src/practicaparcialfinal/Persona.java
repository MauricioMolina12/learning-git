package practicaparcialfinal;

import java.util.*;

public class Persona {

    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, int DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int generarDNI(int DNI) {
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            DNI = rnd.nextInt(9);

        }
        return DNI;

    }

    public static void compsexo(String sexo) {

        if (sexo == "M") {
            System.out.println("Es hombre");

        } else if (sexo == "F") {
            System.out.println("Es mujer");

        } else {
            System.out.println("Digite bien la letra");
        }

    }

    public boolean mayoredad(int edad) {
        boolean mayor;
        if (edad > 18) {
            System.out.println("Es mayor de edad");
            mayor = true;
        } else {
            System.out.println("No es mayor de edad");
            mayor = false;
        }
        return mayor;
    }

    public int pesoideal(double peso) {
        int IMC = 0;
        double pesoid = peso / (altura * altura);

        if (pesoid < 20) {
            IMC = -1;
        } else if (pesoid >= 20 && pesoid <= 25) {
            IMC = 0;

        } else {
            IMC = 0;
        }

        return IMC;

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
