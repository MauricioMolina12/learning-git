/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Entrada;

/**
 *
 * @author ASUS
 */
import backend.DeviceInput;
import java.util.List;

public class TouchScreen extends DeviceInput{

    public TouchScreen(String connector, List<Integer> Ports) {
        super(connector, Ports);
    }
    
    @Override
    public double GetPriceSale() {
        return 150.000;
    }

    @Override
    public String GetInfo() {
        return "Pantalla Tactil conector: " + connector;
    }
    
}
