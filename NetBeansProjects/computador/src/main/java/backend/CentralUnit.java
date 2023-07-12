/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author ASUS
 */
public class CentralUnit {
    
    private String ManufacturerName;
    private String model;
    private double PriceSale;

    public CentralUnit(String ManufacturerName, String model, double PriceSale) {
        this.ManufacturerName = ManufacturerName;
        this.model = model;
        this.PriceSale = PriceSale;
    }

    public String getManufacturerName() {
        return ManufacturerName;
    }

    public String getModel() {
        return model;
    }

    public double getPriceSale() {
        return PriceSale;
    }

    
    
}
