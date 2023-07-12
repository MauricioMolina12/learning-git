/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import factory.clases.ConexionMySQL;
import factory.clases.ConexionOracle;
import factory.clases.ConexionPostgre;
import factory.clases.ConexionVacia;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Factory {
    
    public static IConexion getConexion (String motor){
        if (motor == null) {
            return new ConexionVacia();
        }else if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        }else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgre();
        }
        return new ConexionVacia();
    }
  
}
