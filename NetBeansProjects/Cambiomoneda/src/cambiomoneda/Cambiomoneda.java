package cambiomoneda;

import java.util.*;

public class Cambiomoneda {

    public static double cambio(double dolar) {

        double cambiom = 0;

        cambiom = dolar * 3.760;

        return cambiom;

    }

    public static double euro(double cantidad) {

        double cambioe = 0;
       

        cambioe = cantidad * 4.363;

        return cambioe;
    }
    
    public static double sol (double valor){
        
        double cambiosol=0;
        
        cambiosol=valor*941.53;
        
        return cambiosol;
    }
    public static double Quetzal (double valorq){
        
        double cambioq=0;
        
        cambioq= valorq*486.22;
        
        return cambioq;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la cantidad de dolares a convertir en peso colombiano");
        double dolar = leer.nextDouble();
        if (dolar == 1) {
            System.out.println("Un dolar son " + (3.760));

        } else {
            System.out.println(dolar + " dolares en peso colombiano son " + cambio(dolar));
        }
        System.out.println("_________________________________________________________________");
        System.out.println("Digite la cantidad de euros a convertir en peso colombiano");
        double cantidad= leer.nextDouble();
        if (cantidad==1) {
            System.out.println("Un euro son " + (4.363));
            
        } else{
            System.out.println(cantidad + " euros en peso colombiano son " + euro(cantidad));
        }
        System.out.println("________________________________________________________________");
        System.out.println("Digite la cantidad de soles a convertir en peso colombiano");
        double valor= leer.nextDouble();
        if (valor==1) {
            System.out.println("Un sol son " + (941.53));
            
        } else {
            System.out.println(valor + " soles en peso colombiano son " + sol (valor));
        }
        System.out.println("________________________________________________________________");
        System.out.println("Digite la cantidad de Quetzal a convertir en peso colombiano");
        double valorq=leer.nextDouble();
        if (valorq==1) {
            System.out.println("Un quetzal son " + (486.22));
            
        } else{
            System.out.println(valorq + "quetzal en peso colombiano son " + Quetzal(valorq));
        }
        
    }

}
