
package Olimpiadas;

import java.util.ArrayList;

public class Com_eve {
    
    
    private ArrayList<Eventos>eve;
    private Comisario com;

    public Com_eve(ArrayList<Eventos> eve, Comisario com) {
        this.eve = eve;
        this.com = com;
    }

    public ArrayList<Eventos> getEve() {
        return eve;
    }

    public void setEve(ArrayList<Eventos> eve) {
        this.eve = eve;
    }

    public Comisario getCom() {
        return com;
    }

    public void setCom(Comisario com) {
        this.com = com;
    }
    
    
    
    
}
