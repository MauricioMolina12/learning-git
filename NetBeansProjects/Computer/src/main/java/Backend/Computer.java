/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Computer {

    private CentralUnit Cu;
    private DeviceInput Di;
    private DeviceOutput Do;
    private Peripheral AdditionalComponents;

    public void setCu(CentralUnit Cu) {
        this.Cu = Cu;
    }

    public void setDi(DeviceInput Di) {
        this.Di = Di;
    }

    public void setDo(DeviceOutput Do) {
        this.Do = Do;
    }

    public void setAdditionalComponents(Peripheral AdditionalComponents) {
        this.AdditionalComponents = AdditionalComponents;
    }

    
    public double getPrice() {
        double total = Cu.getPrice() + Di.getPrice() + Do.getPrice();
        for (Component componente : AdditionalComponents.getComponents()) {
            total += componente.getPrice();
        }
        return total;
    }
}
