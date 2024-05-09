import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InfoDoc implements Metodos {

    public static DecimalFormat LB = new DecimalFormat("0000");
    public static DecimalFormat ACT = new DecimalFormat("000,000,000,000");
    public static Scanner SC;

    private int Libro, Acta, DiaR, MesR, AñoR;
    private String EstadoR, MunicipioR, LocalidadR, FechaR, LibroFormat, NumActaFormat;

    public InfoDoc(){
        String FeAc = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.FechaR = FeAc;
    }

    public InfoDoc(int Libro, int Acta, String EstadoR, String MunicipioR, String LocalidadR) {
        this.Libro = Libro;
        this.Acta = Acta;
        this.EstadoR = EstadoR;
        this.MunicipioR = MunicipioR;
        this.LocalidadR = LocalidadR;
        this.LibroFormat = LB.format(Libro);
        this.NumActaFormat = ACT.format(Acta);
    }

    @Override
    public void Generar() throws IOException {
        

    }

    public void setEstado(){
        

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
