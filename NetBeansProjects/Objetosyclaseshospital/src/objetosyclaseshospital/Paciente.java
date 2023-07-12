package objetosyclaseshospital;

public class Paciente {

    String nombre;
    String segnombre;
    String apellido;
    String segapellido;
    String TI;
    int NI;
    int dia;
    int mes;
    int año;
    String ln;
    String pade;
    String medinom;
    String mediape;
    String medicina;

    public Paciente() {
    }

    public Paciente(String nombre, String segnombre, String apellido, String segapellido, String TI, int NI, int dia, int mes, int año, String ln, String pade, String medinom, String mediape, String medicina) {
        this.nombre = nombre;
        this.segnombre = segnombre;
        this.apellido = apellido;
        this.segapellido = segapellido;
        this.TI = TI;
        this.NI = NI;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.ln = ln;
        this.pade = pade;
        this.medinom = medinom;
        this.mediape = mediape;
        this.medicina = medicina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegnombre() {
        return segnombre;
    }

    public void setSegnombre(String segnombre) {
        this.segnombre = segnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegapellido() {
        return segapellido;
    }

    public void setSegapellido(String segapellido) {
        this.segapellido = segapellido;
    }

    public String getTI() {
        return TI;
    }

    public void setTI(String TI) {
        this.TI = TI;
    }

    public int getNI() {
        return NI;
    }

    public void setNI(int NI) {
        this.NI = NI;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getPade() {
        return pade;
    }

    public void setPade(String pade) {
        this.pade = pade;
    }

    public String getMedinom() {
        return medinom;
    }

    public void setMedinom(String medinom) {
        this.medinom = medinom;
    }

    public String getMediape() {
        return mediape;
    }

    public void setMediape(String mediape) {
        this.mediape = mediape;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public void imprimir(String nombre, String segnombre, String apellido, String segapellido, String TI, int NI, int dia, int mes, int año, String ln, String pade, String medinom,String mediape, String medicina) {
        System.out.println("Nombre del paciente: " + nombre + " " + segnombre + " " + apellido + " " + segapellido);
        System.out.println("Tipo de identificación: " + TI);
        System.out.println("Número de identificación: " + NI);
        System.out.println("Fecha y lugar de nacimiento: " + dia + "-" + mes + "-" + año + "/" + ln);
        System.out.println("Padecimiento del paciente: " + pade);
        System.out.println("Medico que lo atendió: " + medinom + " " + mediape);
        System.out.println("Medicina: " + medicina);

    }
}
