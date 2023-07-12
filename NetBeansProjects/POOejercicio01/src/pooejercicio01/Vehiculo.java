
package pooejercicio01;

import java.util.Scanner;

public class Vehiculo {
    public static int indiceCochesMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    private String marca;
    private String modelo;
    private float precio;
    
    //Constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "
                +modelo+"\nPrecio: $"+precio+"\n";
    }
    
    public static void main (String[] args){
        String marca,modelo;
        float precio;
        int Nvehiculos, indiceBarato;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de vehiculos: ");
        Nvehiculos = leer.nextInt();
        
        //Crear objetos para los coches
        Vehiculo coches[] = new Vehiculo[Nvehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            leer.nextLine();
            System.out.println("\nIngrese las carateristicas del"
                    + " coche "+(i+1)+":");
            System.out.print("Ingrese MARCA: ");
            marca = leer.nextLine();
            System.out.print("Ingrese MODELO: ");
            modelo = leer.nextLine();
            System.out.print("Ingrese PRECIO: ");
            precio = leer.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = indiceCochesMBarato(coches);
        
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
