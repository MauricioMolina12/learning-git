package Clasesyobjetos;

public class Carro {
    
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodos
    public static void main(String[] args) {
    
     Carro carro1= new Carro ();
     
     carro1.color= "Negro";
     carro1.marca= "Ford";
     carro1.km= 0;
    
    
        System.out.println("El color de este auto es: " + carro1.color);
        System.out.println("La marca de este auto es: " + carro1.marca);
        System.out.println("Su kilometraje es: " + carro1.km);
        System.out.println("____________________________________________________");
        Carro carro2= new Carro ();
        
        carro2.color="Blanco";
        carro2.marca="Chevrolet";
        carro2.km= 100;
        
        System.out.println("El color del segundo auto es: " + carro2.color);
        System.out.println("Su marca es: " + carro2.marca);
        System.out.println("Su kilometraje es: " + carro2.km);
    }
}
