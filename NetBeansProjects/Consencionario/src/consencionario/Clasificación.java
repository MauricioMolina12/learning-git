package consencionario;

public class Clasificación extends Vehiculo {

    int carrosb;
    int ncarros;

    public Clasificación(int carrosb, int ncarros, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.carrosb = carrosb;
        this.ncarros = ncarros;
    }

    public void carrobarato(Vehiculo carros[],int cb) {
        int i;
        cb = 0;
        double precio;

        precio = carros[1].getPrecio();
        for (i = 1; i < carros.length; i++) {
            if (carros[i].getPrecio() < precio) {
                precio = carros[i].getPrecio();
                cb = i;
            }
        }
        System.out.println(cb);
    }

    public void imprimirdatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getPrecio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("____________________________________________________");
    }
}
