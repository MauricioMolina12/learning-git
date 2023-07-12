/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Backend.Builder.ComputerBuilder;
import Backend.CentralUnit;
import Backend.Computer;
import Backend.DeviceInput;
import Backend.DeviceOutput;
import Backend.Input.Keyboard;
import Backend.Output.LaserPrinter;
import Backend.Output.PrinterInkjet;
import Backend.Output.Screen;
import Backend.Peripheral;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

        CentralUnit CenUni = new CentralUnit("HP", "L550", 500.0);
        DeviceInput DevInp = new Keyboard("ASUS","XJ14",450.000);
        DeviceOutput DevOut = new Screen("SAMSUMG","10G",300.000);

        Peripheral additional = new Peripheral();
        additional.addComponent(new PrinterInkjet("Epson","L410",130.000));
        additional.addComponent(new LaserPrinter("Cartucho 1",12,"CANON","L110",190.000));
        
        ComputerBuilder builder = new ComputerBuilder(CenUni, DevInp, DevOut,additional);
        

        Computer co = builder.build();

        double precioTotal = co.getPrice();
        
        System.out.println(precioTotal);

    }
}
