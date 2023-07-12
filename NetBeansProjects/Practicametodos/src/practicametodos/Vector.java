
package practicametodos;

public class Vector {
    
    int [] vec;
    int t;

    public Vector() {
    }

    public Vector(int[] vec, int t) {
        this.vec = vec;
        this.t = t;
    }

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    
    public void imprimir (int [] vec, int t) {
        System.out.println("El vector es " + vec + " ");
        
        
    }
    
    
}
