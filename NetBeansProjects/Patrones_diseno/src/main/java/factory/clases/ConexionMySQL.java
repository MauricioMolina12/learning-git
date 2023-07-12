/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.clases;

import factory.IConexion;

/**
 *
 * @author ASUS
 */
public class ConexionMySQL implements IConexion{
 
    private String host;
    private String port;
    private String user;
    private String password;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.port = "3306";
        this.user = "mau";
        this.password = "123";
        
    }

    @Override
    public void conectar() {
        System.out.println("Se conectó MYSQL");
    }  

    @Override
    public void desconectar() {
        System.out.println("Se desconectó MYSQL");  
    }

    @Override
    public String toString() {
        return "ConexionMySQL{" + "host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + '}';
    }
    
    
    
}
