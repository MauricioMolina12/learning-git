package figuras;

import java.util.*;

public class Figuras {

    public static double circulo(double radio) {
        double rad = (3.1416) * (radio * radio);
        return rad;
    }

    public static double triangulo(double base, double altura) {
        double tria = (base * altura) / 2;
        return tria;
    }

    public static double cuadrado(double lado1, double lado2) {
        double cuadr = lado1 * lado2;
        return cuadr;

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("ÁREA DE UN CIRCULO");
        System.out.println("Digite el radio del circulo");
        double rad= leer.nextDouble();
        System.out.println("El área de un circulo " + rad + " es = " + circulo(rad));
        
        System.out.println("____________________________________________________");
        System.out.println("ÁREA DE UN TRIANGULO");
        System.out.println("Digite la base del triangulo");
        double base=leer.nextDouble();
        System.out.println("Digite la altura de éste");
        double altura= leer.nextDouble();
        System.out.println("El área del triangulo es= " + triangulo(base,altura));
        
        System.out.println("____________________________________________________");
        System.out.println("ÁREA DE UN CUADRADO");
        System.out.println("Digite su primer lado");
        double lado1= leer.nextDouble();
        System.out.println("Digite su segundo lado");
        double lado2= leer.nextDouble();
        System.out.println("El área del cuadrado es= " + cuadrado(lado1,lado2));
    }
    
}
