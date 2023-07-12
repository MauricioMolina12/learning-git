/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Output;

/**
 *
 * @author ASUS
 */
import Backend.Component;
import Backend.DeviceOutput;
import java.util.Arrays;
import java.util.List;

public class Screen extends Component implements DeviceOutput{

    public Screen(String manufacturer, String model, double price) {
        super(manufacturer, model, price);
    }

    
    @Override
    public String getTypeConnector() {
        return "HDMI";
    }

    @Override
    public List<Integer> getValidPorts() {
        return Arrays.asList(1, 2);
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    
    
    
}
