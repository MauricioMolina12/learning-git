package pooejercicio01;

public class Clase2 {

    private String marca;
    private String modelo;
    private float precio;

    public Clase2(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public static int carrob(Vehiculo coches[], int cb) {
        double precio;
        cb = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                cb = i;
            }
        }
        return cb;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + "\nModelo: "
                + modelo + "\nPrecio: $" + precio + "\n";
    }
}
