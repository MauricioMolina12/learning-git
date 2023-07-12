/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class DeviceInput extends ComponentComputer {
    
    protected String connector;
    protected List<Integer> Ports;

    public DeviceInput(String conector, List<Integer> Puertos) {
        this.connector = conector;
        this.Ports = Puertos;
    }

    public String getConector() {
        return connector;
    }

    public List<Integer> getPuertos() {
        return Ports;
    }

    
    
    
}
