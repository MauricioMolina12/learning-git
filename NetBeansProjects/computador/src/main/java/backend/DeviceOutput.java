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
public abstract class DeviceOutput implements ComponentComputer{
    
    protected List<Integer> Puertos;

    public DeviceOutput(List<Integer> Puertos) {
        this.Puertos = Puertos;
    }

    public List<Integer> getPuertos() {
        return Puertos;
    }

    
    
    
}
