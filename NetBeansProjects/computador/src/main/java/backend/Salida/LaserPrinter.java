/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Salida;

/**
 *
 * @author ASUS
 */
import backend.DeviceOutput;
import java.util.List;

public class LaserPrinter extends DeviceOutput{

    public LaserPrinter(List<Integer> Puertos) {
        super(Puertos);
    }

    @Override
    public double GetPriceSale() {
        return 560.000;
    }

    @Override
    public String GetInfo() {
        return "Impresora Laser";
    }
    
    
    
}
