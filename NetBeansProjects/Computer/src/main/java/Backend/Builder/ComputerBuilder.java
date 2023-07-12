/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Builder;

import Backend.CentralUnit;
import Backend.Component;
import Backend.Computer;
import Backend.DeviceInput;
import Backend.DeviceOutput;
import Backend.Peripheral;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ComputerBuilder {

    private CentralUnit CeUn;
    private DeviceInput DeIn;
    private DeviceOutput DeOu;
    private Peripheral AC;

    public ComputerBuilder(CentralUnit CeUn, DeviceInput DeIn, DeviceOutput DeOu, Peripheral AC) {
        this.CeUn = CeUn;
        this.DeIn = DeIn;
        this.DeOu = DeOu;
        this.AC = AC;
    }
    public Computer build() {
        Computer c = new Computer();
        c.setCu(CeUn);
        c.setDi(DeIn);
        c.setDo(DeOu);
        c.setAdditionalComponents(AC);
        
        return c;
    }
}
