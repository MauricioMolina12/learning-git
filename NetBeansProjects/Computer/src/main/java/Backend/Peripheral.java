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
public class Peripheral {

    private List<Component> components = new ArrayList<>();

    public Peripheral(){
        
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    

    public double getPrice() {
        double total = 0;
        for (Component component : components) {
            total += component.getPrice();
        }
        return total;
    }
    public Component getComponent(){
        return getComponent();
    }
}
