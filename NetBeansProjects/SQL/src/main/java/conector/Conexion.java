/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import static javax.swing.DropMode.INSERT;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Conexion {
    
    Connection conectar = null;
    String user = "root";
    String password = "Universidadlibre202108";
    String BDD = "negocio";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + BDD;



    public Connection EstableceConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, user, password);
            JOptionPane.showMessageDialog(null, "Se conectó la base de datos. ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó la base de datos, error: " + e.toString());
        }

        return conectar;
    }
    
}
