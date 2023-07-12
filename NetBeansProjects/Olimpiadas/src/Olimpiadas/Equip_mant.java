
package Olimpiadas;
import java.util.ArrayList;

public class Equip_mant {
    
private ArrayList <Equipamiento> equip;
private ArrayList <Mantenimiento> mant;

    public Equip_mant(ArrayList<Equipamiento> equip, ArrayList<Mantenimiento> mant) {
        this.equip = equip;
        this.mant = mant;
    }

    public ArrayList<Equipamiento> getEquip() {
        return equip;
    }

    public void setEquip(ArrayList<Equipamiento> equip) {
        this.equip = equip;
    }

    public ArrayList<Mantenimiento> getMant() {
        return mant;
    }

    public void setMant(ArrayList<Mantenimiento> mant) {
        this.mant = mant;
    }


}
