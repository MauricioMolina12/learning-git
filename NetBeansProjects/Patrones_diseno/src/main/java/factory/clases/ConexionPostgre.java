/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.clases;

/**
 *
 * @author ASUS
 */
import factory.IConexion;

public class ConexionPostgre implements IConexion {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConexionPostgre() {
        this.host = "localhost";
        this.port = "5433";
        this.user = "mauricio";
        this.password = "12345";

    }

    @Override
    public void conectar() {
        System.out.println("Se conectó POSTGRE");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó POSTGRE");
    }

    @Override
    public String toString() {
        return "ConexionOracle{" + "host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + '}';
    }
}
