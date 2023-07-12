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

public class PrinterInkjet extends DeviceOutput{

    public PrinterInkjet(List<Integer> Puertos) {
        super(Puertos);
    }

    @Override
    public double GetPriceSale() {
        return 500.000;
    }

    @Override
    public String GetInfo() {
        return "Impresora Inyección";
    }
    
    
}
