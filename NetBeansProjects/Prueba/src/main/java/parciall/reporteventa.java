/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class reporteventa {

    private ArrayList<venta> reporven;
    private Almacen a;

    public reporteventa() {
    }

    public reporteventa(ArrayList<venta> reporven, Almacen a) {
        this.reporven = reporven;
        this.a = a;
    }

    public Almacen getA() {
        return a;
    }

    public void setA(Almacen a) {
        this.a = a;
    }

    public ArrayList<venta> getReporven() {
        return reporven;
    }

    public void setReporven(ArrayList<venta> reporven) {
        this.reporven = reporven;
    }

    public void ReporteDiario(String FechaReporteD) {

        LocalDate fechaReporteD = LocalDate.parse(FechaReporteD);

        double mon = 0;
        int c = 0;

        for (int i = 0; i < a.getVentas().size(); i++) {
            if (a.getVentas().get(i).getFecha().isEqual(fechaReporteD)) {
                c++;
                mon += a.getVentas().get(i).getTotal();

            }
        }
        JOptionPane.showMessageDialog(null, "\nVentas "
                + "\nNúmero de ventas: " + c
                + "\nMonto total de ventas: " + mon);

    }

    public void ReporteSemanal(String DiaSemanaR) {

        ValueRange semana1 = ValueRange.of(1, 8);
        ValueRange semana2 = ValueRange.of(9, 16);
        ValueRange semana3 = ValueRange.of(17, 24);
        ValueRange semana4 = ValueRange.of(25, 31);
        int c = 0;
        double mon = 0;
        String s = "";

        for (int i = 0; i < a.getVentas().size(); i++) {

            int DiaSemanar = Integer.parseInt(DiaSemanaR);
            int detalledia = Integer.parseInt("" + a.getVentas().get(i).getFecha().getDayOfMonth());

            if (DiaSemanar == detalledia) {

                if (semana1.isValidIntValue(detalledia)) {
                    c++;
                    mon += a.getVentas().get(i).getTotal();
                    s = " 1";

                }
                if (semana2.isValidIntValue(detalledia)) {
                    c++;
                    mon += a.getVentas().get(i).getTotal();
                    s = " 2";
                }
                if (semana3.isValidIntValue(detalledia)) {
                    c++;
                    mon += a.getVentas().get(i).getTotal();
                    s = " 3";

                }
                if (semana4.isValidIntValue(detalledia)) {
                    c++;
                    mon += a.getVentas().get(i).getTotal();
                    s = " 4";
                }

            }

        }
        JOptionPane.showMessageDialog(null, "\nReporte semana " + s + ": "
                + "\nNúmero de ventas: " + c
                + "\nMonto total de ventas: " + mon);
    }

    public void ReporteMensual(int NumeroMesRM, int NumeroAñoRM1) {

        int c = 0;
        double mon = 0;
        String fec;
        String m = "";
        
        if (NumeroMesRM < 10) {
            fec = NumeroAñoRM1 + "-0" + NumeroMesRM + "-01";
        } else {
            fec = NumeroAñoRM1 + "-" + NumeroMesRM + "-01";
        }
        LocalDate date = LocalDate.parse(fec);

        for (int i = 0; i < a.getVentas().size(); i++) {
            if (a.getVentas().get(i).getFecha().getMonth().getValue() == NumeroMesRM && a.getVentas().get(i).getFecha().getYear() == NumeroAñoRM1) {
                c++;
                mon += a.getVentas().get(i).getTotal();
            }
        }

        JOptionPane.showMessageDialog(null, "\nNúmero de ventas: " + c
                + "\nMonto total de ventas: " + mon);
    }
}
