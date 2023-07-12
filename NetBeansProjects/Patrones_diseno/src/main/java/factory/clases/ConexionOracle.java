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
public class ConexionOracle implements IConexion {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConexionOracle() {
        this.host = "localhost";
        this.port = "1521";
        this.user = "mauro";
        this.password = "1234";

    }

    @Override
    public void conectar() {
        System.out.println("Se conectó ORACLE");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó ORACLE");
    }

    @Override
    public String toString() {
        return "ConexionOracle{" + "host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + '}';
    }
    
    

}
