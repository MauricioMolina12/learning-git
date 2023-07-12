/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Factory f = new Factory();

        System.out.println("Digite motor");
        String m = read.next();

        if (m.equalsIgnoreCase("MYSQL")) {

            IConexion c1 = f.getConexion(m);
            c1.conectar();
            c1.desconectar();
        } else if (m.equalsIgnoreCase("ORACLE")) {

            IConexion c2 = f.getConexion(m);
            c2.conectar();
            c2.desconectar();
        } else {

            IConexion c3 = f.getConexion(m);
            c3.conectar();
            c3.desconectar();
        }
        f.getConexion(m);
    }
}
