package POOconoperaciones;

import javax.swing.JOptionPane;

public class OpPOO {

    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicación;
    int división;
    int mostrarR;

    public void leernúmeros() {

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));

    }

    public void suma() {
        suma = num1 + num2;
    }

    public void resta() {
        resta = num1-num2;
    }

    public void multiplicación() {
        multiplicación = num1 * num2;
    }

    public void división() {
        división = num1 / num2;
    }

    public void mostrarR() {
    
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicación);
        System.out.println("La división es: " + división);
        
    }
}
