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

public class LaserPrinter extends Component implements DeviceOutput {

    public LaserPrinter(String cartridgeType, int printedPages, String manufacturer, String model, double price) {
        super(manufacturer, model, price);
        this.cartridgeType = cartridgeType;
        this.printedPages = printedPages;
    }
    private String cartridgeType;
    private int printedPages;


    @Override
    public String getTypeConnector() {
        return "USB";
    }

    @Override
    public List<Integer> getValidPorts() {
        return Arrays.asList(3, 4,5);
    }

    public int getPrintedPages() {
        return printedPages;    
    }

    @Override
    public double getPrice() {
        return price;
    }

}
