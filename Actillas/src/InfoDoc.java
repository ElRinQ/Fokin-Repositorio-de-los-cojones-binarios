import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InfoDoc implements Metodos {

    public static DecimalFormat DosC = new DecimalFormat("00");
    public static DecimalFormat LB = new DecimalFormat("0000");
    public static DecimalFormat ACT = new DecimalFormat("000,000,000,000");
    public static BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));

    private int Libro, Acta, DiaR, MesR, AñoR;
    private String EstadoR, MunicipioR, LocalidadR, FechaR, LibroFormat, NumActaFormat;


    @Override
    public void Generar() throws IOException {
        

    }

    public void setAñoR() throws java.io.IOException {
        do {
            try {
                System.out.println("Año de registro: ");
                this.AñoR = Integer.parseInt(Leer.readLine());
                break;
            } catch (NumberFormatException Noint) {
                System.out.println("\nSolo se aceptan numeros enteros positivos\n");
            }
        } while (true);
    }

    public void setMesR() throws java.io.IOException {
        do {
            try {
                System.out.println("Mes de nacimiento: ");
                this.MesR = Integer.parseInt(Leer.readLine());
                if (MesR > 0 && MesR <= 12) {
                    break;
                } else {
                    System.out.println("\nSolo se aceptan numeros enteros positivos del rango 1-12\n");
                }
            } catch (NumberFormatException Noint) {
                System.out.println("\nSolo se aceptan numeros enteros positivos del rango 1-12\n");
            }
        } while (true);

    }

    public void setDiaR() throws java.io.IOException {
        do {
            try {
                System.out.println("Dia de nacimiento: ");
                this.DiaR = Integer.parseInt(Leer.readLine());
                if (DiaR > 0 && DiaR <= 31) {
                    break;
                } else {
                    System.out.println("\nSolo se aceptan numeros enteros positivos del rango 1-31\n");
                }
            } catch (NumberFormatException Noint) {
                System.out.println("\nSolo se aceptan numeros enteros positivos del rango 1-31\n");
            }
        } while (true);

    }

    public void GeneraFechaR() {
        this.FechaR = (DosC.format(DiaR) + "/" + DosC.format(MesR) + "/" + DosC.format(AñoR));
    }

    public void setEstadoR() throws java.io.IOException {
        System.out.println("Estado de registro: ");
        this.EstadoR = Leer.readLine();
    }

    public void setMunicipioR() throws java.io.IOException {
        System.out.println("Municipio de nacimiento: ");
        this.MunicipioR = Leer.readLine();
    }

    public void setLocalidadR() throws java.io.IOException {
        System.out.println("Localidad de nacimiento: ");
        this.LocalidadR = Leer.readLine();
    }

    //Getters 
    public int getLibro() {
        return Libro;
    }

    public int getActa() {
        return Acta;
    }

    public int getDiaR() {
        return DiaR;
    }

    public int getMesR(){
        return MesR;
    }

    public int getAñoR(){
        return AñoR;
    }

    public String getEstadoR(){
        return EstadoR;
    }

    public String getMunicipioR(){
        return MunicipioR;
    }

    public String getLocalidadR(){
        return LocalidadR;
    }

    public String getFechaR(){
        return FechaR;
    }

    public String getLibroFormat(){
        return LibroFormat;
    }

    public String getNumActaFormat(){
        return NumActaFormat;
    }


}
