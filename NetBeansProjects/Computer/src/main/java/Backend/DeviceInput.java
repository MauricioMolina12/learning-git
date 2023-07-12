/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

import java.util.List;

/**
 *
 * @author ASUS
 */
import Backend.Component;

public interface DeviceInput{
    
    String getTypeConnector();
    List<Integer> getValidPorts();
    public double getPrice();
    
}
