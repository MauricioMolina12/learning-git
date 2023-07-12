package placteos;

import java.util.*;
import Clases.Productos_congelados;
import Clases.Productos_frescos;
import Clases.Productos_refrigerados;

public class Placteos {

    static ArrayList<Productos_frescos> pfrescos = new ArrayList<Productos_frescos>();
    static ArrayList<Productos_refrigerados> prefrigerados = new ArrayList<Productos_refrigerados>();
    static ArrayList<Productos_congelados> pcongelados = new ArrayList<Productos_congelados>();

    public static void mostrar_menu(int ag) {

        Scanner read = new Scanner(System.in);
        for (int i = 0; i < ag; i++) {

            System.out.println("BIENVENIDOS A LA BASE DE DATOS DE MAMILK");
            System.out.println("1.Llenar productos");
            System.out.println("2.Salir");
            int opc = read.nextInt();

            System.out.println("PRODUCTOS FRESCOS-NECESITAREMOS LA S/TE INFORMACIÓN:");
            System.out.println("Ingresa el nombre del producto");
            String nombre = read.next();
            System.out.println("Digita la fecha de envasado-(dd-mm-aa)");
            System.out.println("dd:");
            int ddf = read.nextInt();
            System.out.println("mm:");
            int mmf = read.nextInt();
            System.out.println("aa:");
            int aaf = read.nextInt();
            System.out.println("Digita la fecha de caducidad-(dd-mm-aa)");
            System.out.println("dd:");
            int ddca = read.nextInt();
            System.out.println("mm:");
            int mmca = read.nextInt();
            System.out.println("aa:");
            int aaca = read.nextInt();
            System.out.println("Ingresa el país de orígen");
            String pais = read.next();
            System.out.println("N lote");
            int nlote = read.nextInt();
            pfrescos.add(new Productos_frescos(ddf, mmf, aaf, pais, ddca, mmca, aaca, nlote, nombre));

            System.out.println("PRODUCTOS REFRIGERADOS-NECESITAREMOS LA S/TE INFORMACIÓN:");
            System.out.println("Ingresa el nombre del producto");
            nombre = read.next();
            System.out.println("Digite el código del organismo de supervisión alimentaria");
            int COL = read.nextInt();
            System.out.println("Digita la fecha de caducidad-(dd-mm-aa)");
            System.out.println("dd:");
            ddca = read.nextInt();
            System.out.println("mm:");
            mmca = read.nextInt();
            System.out.println("aa:");
            aaca = read.nextInt();
            System.out.println("Digita la fecha de envasado-(dd-mm-aa)");
            System.out.println("dd:");
            int ddr = read.nextInt();
            System.out.println("mm:");
            int mmr = read.nextInt();
            System.out.println("aa:");
            int aar = read.nextInt();
            System.out.println("Ingrese la temperatura");
            String temp = read.next();
            System.out.println("Ingrese el país de origen");
            pais = read.next();
            System.out.println("Digite número de lote");
            nlote = read.nextInt();
            prefrigerados.add(new Productos_refrigerados(COL, ddr, mmr, aar, temp, pais, ddca, mmca, aaca, nlote, nombre));

            System.out.println("PRODUCTOS CONGELADOS-NECESITAREMOS LA S/TE INFORMACIÓN:");
            System.out.println("Ingresa el nombre del producto");
            nombre = read.next();
            System.out.println("Digita la fecha de caducidad-(dd-mm-aa)");
            System.out.println("dd:");
            ddca = read.nextInt();
            System.out.println("mm:");
            mmca = read.nextInt();
            System.out.println("aa:");
            aaca = read.nextInt();
            System.out.println("Digita la fecha de envasado-(dd-mm-aa)");
            System.out.println("dd:");
            int ddc = read.nextInt();
            System.out.println("mm:");
            int mmc = read.nextInt();
            System.out.println("aa:");
            int aac = read.nextInt();
            System.out.println("Ingrese la temperatura");
            temp = read.next();
            System.out.println("Ingrese el país de origen");
            pais = read.next();
            System.out.println("Digite número de lote");
            nlote = read.nextInt();

            pcongelados.add(new Productos_congelados(ddc, mmc, aac, pais, temp, ddca, mmca, aaca, nlote, nombre));

        }
    }

    public static void imprimir() {
        System.out.println("PRODUCTO FRESCO REGISTRADO-INFORMACIÓN:");
        for (int i = 0; i < pfrescos.size(); i++) {
            System.out.println("Nombre producto: " + pfrescos.get(i).getNombre());
            System.out.println("Fecha de envasado: " + pfrescos.get(i).getDdf() + "/" + pfrescos.get(i).getMmf() + "/" + pfrescos.get(i).getAaf());
            System.out.println("Fecha de caducidad: " + pfrescos.get(i).getDdca() + "/" + pfrescos.get(i).getMmca() + "/" + pfrescos.get(i).getAaca());
            System.out.println("País de origen: " + pfrescos.get(i).getPais());
            System.out.println("Número de lote: " + pfrescos.get(i).getNlote());
            System.out.println("------------------------------------------------");
            System.out.println("PRODUCTO REFRIGERADO REGISTRADO-INFORMACIÓN:");
            for (int j = 0; j < prefrigerados.size(); j++) {

                System.out.println("Nombre producto: " + prefrigerados.get(j).getNombre());
                System.out.println("Fecha de envasado: " + prefrigerados.get(j).getDdr() + "/" + prefrigerados.get(j).getMmr() + "/" + prefrigerados.get(j).getAar());
                System.out.println("Fecha de caducidad: " + prefrigerados.get(j).getDdca() + "/" + prefrigerados.get(j).getMmca() + "/" + prefrigerados.get(j).getAaca());
                System.out.println("Codigo de del organismo de supervisión alimentaria: " + prefrigerados.get(j).getCOL());
                System.out.println("País de origen: " + prefrigerados.get(j).getPais());
                System.out.println("Número de lote: " + prefrigerados.get(j).getNlote());
                System.out.println("Temperatura: " + prefrigerados.get(j).getTemp());
                System.out.println("--------------------------------------------");
                System.out.println("PRODUCTO CONGELADO REGISTRADO-INFORMACIÓN");
                for (int k = 0; k < pcongelados.size(); k++) {
                    System.out.println("Nombre producto: " + pcongelados.get(k).getNombre());
                    System.out.println("Fecha de envasado: " + pcongelados.get(k).getDdc() + "/" + pcongelados.get(k).getMmc() + "/" + pcongelados.get(k).getAac());
                    System.out.println("Fecha de caducidad: " + pcongelados.get(k).getDdca() + "/" + pcongelados.get(k).getMmca() + "/" + pcongelados.get(k).getAaca());
                    System.out.println("País de origen: " + pcongelados.get(k).getPais());
                    System.out.println("Número de lote: " + pcongelados.get(k).getNlote());
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("...");
        int ag = read.nextInt();
        int opc;
        do {
            
        
        
        System.out.println("MENÚ");
        System.out.println("1.Mostrar_menú");
        System.out.println("2.Imprimir");
        System.out.println("3.Salir");
        opc = read.nextInt();
        
        switch (opc){
            case 1:
            mostrar_menu(ag);
            break;
            case 2:
                imprimir();
                break;
            case 3:
                System.exit(0);
        }
        } while (opc != 3);
        
        
    }

}
