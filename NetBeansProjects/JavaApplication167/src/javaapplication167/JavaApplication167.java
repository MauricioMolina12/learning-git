package javaapplication167;

import java.util.*;

public class JavaApplication167 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        int cont1 = 0, totalest1 = 0, porcEstrato1 = 0, total = 0,
                cont2 = 0, totalest2 = 0, porcEstrato2 = 0,
                cont3 = 0, totalest3 = 0, porcEstrato3 = 0,
                cont4 = 0, totalest4 = 0, porcEstrato4 = 0,
                cont5 = 0, totalest5 = 0, porcEstrato5 = 0,
                cont6 = 0, totalest6 = 0, porcEstrato6 = 0;
        System.out.println("Digite cantidad de usuarios");
        int n = leer.nextInt();
        String[] Usu = new String[n];
        int Est[] = new int[n];
        int Nkc[] = new int[n];
        int Fact[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nombre del usuario #" + (i + 1));
            Usu[i] = leer.next();
            System.out.println("Digite estrato del usuario " + Usu[i] + " (1-6)");
            Est[i] = leer.nextInt();
            System.out.println("Digite numero de kilowatios que consumió el usuario " + Usu[i]);
            Nkc[i] = leer.nextInt();
            if (Est[i] == 1) {
                Fact[i] = Nkc[i] * 120;
                totalest1 = totalest1 + Fact[i];
                cont1++;
                porcEstrato1 = (cont1 * 100) / n;
            } else if (Est[i] == 2) {
                Fact[i] = Nkc[i] * 180;
                totalest2 = totalest2 + Fact[i];
                cont2++;
                porcEstrato2 = (cont2 * 100) / n;
            } else if (Est[i] == 3) {
                Fact[i] = Nkc[i] * 210;
                totalest3 = totalest3 + Fact[i];
                cont3++;
                porcEstrato3 = (cont3 * 100) / n;
            } else if (Est[i] == 4) {
                Fact[i] = Nkc[i] * 250;
                totalest4 = totalest4 + Fact[i];
                cont4++;
                porcEstrato4 = (cont4 * 100) / n;
            } else if (Est[i] == 5) {
                Fact[i] = Nkc[i] * 365;
                totalest5 = totalest5 + Fact[i];
                cont5++;
                porcEstrato5 = (cont5 * 100) / n;
            } else if (Est[i] == 6) {
                Fact[i] = Nkc[i] * 444;
                totalest6 = totalest6 + Fact[i];
                cont6++;
                porcEstrato6 = (cont6 * 100) / n;
            }
            total = total + Fact[i];
        }
        System.out.println();
        System.out.println("Menu");
        System.out.println("1. Imprimir factura de todos los usuarios");
        System.out.println("2. Imprimir lo recaudado por cada estrato");
        System.out.println("3. Porcentaje de usuarios por cada estrato");
        System.out.println("4. Total recaudado");
        System.out.println("5. Imprimir las facturas mas altas y mas bajas");
        System.out.println("6. Salir");
        System.out.println("Digite la opcion");
        int opcion = leer.nextInt();
        do {
            switch (opcion) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Usuario: " + Usu[i] + " - Consumo: " + Fact[i]);
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Consumo del estrato 1: " + totalest1);
                    System.out.println("Consumo del estrato 2: " + totalest2);
                    System.out.println("Consumo del estrato 3: " + totalest3);
                    System.out.println("Consumo del estrato 4: " + totalest4);
                    System.out.println("Consumo del estrato 5: " + totalest5);
                    System.out.println("Consumo del estrato 6: " + totalest6);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Porcentaje de usuarios del estrato 1: " + porcEstrato1 + "%");
                    System.out.println("Porcentaje de usuarios del estrato 2: " + porcEstrato2 + "%");
                    System.out.println("Porcentaje de usuarios del estrato 3: " + porcEstrato3 + "%");
                    System.out.println("Porcentaje de usuarios del estrato 4: " + porcEstrato4 + "%");
                    System.out.println("Porcentaje de usuarios del estrato 5: " + porcEstrato5 + "%");
                    System.out.println("Porcentaje de usuarios del estrato 6: " + porcEstrato6 + "%");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Total recaudado por la empresa A-ire: " + total);
                    break;
                case 5:
                    System.out.println("Facturas mas bajas");
                    int temporal = 0;
                    for (int i = 0; i < Fact.length; i++) {
                        for (int j = 1; j < (Fact.length - i); j++) {
                            if (Fact[j - 1] > Fact[j]) {
                                temporal = Fact[j - 1];
                                String temp = Usu[j - 1];
                                Fact[j - 1] = Fact[j];
                                Usu[j - 1] = Usu[j];
                                Fact[j] = temporal;
                                Usu[j] = temp;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(Fact));
                    System.out.println(Arrays.toString(Usu));
                    System.out.println();
                    System.out.println("Facturas mas altas");
                    int temporal2 = 0;
                    for (int i = 0; i < Fact.length; i++) {
                        for (int j = 1; j < (Fact.length - i); j++) {
                            if (Fact[j - 1] < Fact[j]) {
                                temporal = Fact[j - 1];
                                String temp = Usu[j - 1];
                                Fact[j - 1] = Fact[j];
                                Usu[j - 1] = Usu[j];
                                Fact[j] = temporal;
                                Usu[j] = temp;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(Fact));
                    System.out.println(Arrays.toString(Usu));
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Imprimir factura de todos los usuarios");
            System.out.println("2. Imprimir lo recaudado por cada estrato");
            System.out.println("3. Porcentaje de usuarios por cada estrato");
            System.out.println("4. Total recaudado");
            System.out.println("5. Imprimir las facturas mas altas y mas bajas");
            System.out.println("6. Salir");
            System.out.println("Digite la opcion");
            opcion = leer.nextInt();
        } while (opcion
                != 6);
        System.out.println(
                "Programa terminado");
    }
}
