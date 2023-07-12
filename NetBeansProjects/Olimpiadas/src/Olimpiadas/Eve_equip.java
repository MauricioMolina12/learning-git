
package Olimpiadas;
import java.util.ArrayList;
public class Eve_equip {
    
    private ArrayList <Eventos> eve;
    private ArrayList <Equipamiento> equip;

    public Eve_equip(ArrayList<Eventos> eve, ArrayList<Equipamiento> equip) {
        this.eve = eve;
        this.equip = equip;
    }

    public ArrayList<Eventos> getEve() {
        return eve;
    }

    public void setEve(ArrayList<Eventos> eve) {
        this.eve = eve;
    }

    public ArrayList<Equipamiento> getEquip() {
        return equip;
    }

    public void setEquip(ArrayList<Equipamiento> equip) {
        this.equip = equip;
    }
    
    
    
    
    
}
