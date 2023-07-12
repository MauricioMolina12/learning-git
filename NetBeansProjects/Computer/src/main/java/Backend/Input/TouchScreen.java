/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Input;

/**
 *
 * @author ASUS
 */
import Backend.Component;
import Backend.DeviceOutput;
import java.util.Arrays;
import java.util.List;

public class TouchScreen extends Component implements DeviceOutput {

    public TouchScreen(String manufacturer, String model, double price) {
        super(manufacturer, model, price);
    }

    
    @Override
    public String getTypeConnector() {
        return "USB";
    }

    @Override
    public List<Integer> getValidPorts() {
        return Arrays.asList(2, 3, 4);

    }

    @Override
    public double getPrice() {
        return price;
    }
    
    

}
