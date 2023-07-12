/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Entrada;

import backend.DeviceInput;
import backend.DeviceInput;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class GraphicTablet extends DeviceInput{

    public GraphicTablet(String connector, List<Integer> Ports) {
        super(connector, Ports);
    }

    @Override
    public double GetPriceSale() {
        return 110.000;
    }

    @Override
    public String GetInfo() {
        return "Tableta Grafica conector: " + connector;
    }
    
    
}
