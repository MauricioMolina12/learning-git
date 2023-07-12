package consencionario;

import java.util.*;

public class Consencionario {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String modelo, marca;
        double precio;
        int carrosb, ncarros;

        System.out.println("Digite cantidad de carros");
        ncarros = read.nextInt();

        Clasificación carrone[] = new Clasificación[ncarros];

        for (int i = 1; i < ncarros; i++) {

            System.out.println("Digite la marca del carro " + i);
            marca = read.next();

            System.out.println("");

            System.out.println("Digite el modelo del carro " + i);
            modelo = read.next();

            System.out.println("");

            System.out.println("Digite el precio del carro " + i);
            precio = read.nextDouble();

            carrone[i] = (Clasificación) new Vehiculo(marca, modelo, precio);

        }
        
    }

}
