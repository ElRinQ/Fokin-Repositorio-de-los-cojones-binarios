import java.text.DecimalFormat;

public class InfoDoc {

    public static DecimalFormat DosC = new DecimalFormat("00");
    public static DecimalFormat LB = new DecimalFormat("0000");
    public static DecimalFormat ACT = new DecimalFormat("000,000,000,000");

    private int Libro, Acta, DiaR, MesR, AñoR;
    private String EstadoR, MunicipioR, LocalidadR, FechaR, LibroFormat, NumActaFormat;

    public InfoDoc(int Libro, int Acta, int DiaR, int MesR, int AñoR, String EstadoR, String MunicipioR,
            String LocalidadR) {
        this.Libro = Libro;
        this.Acta = Acta;
        this.DiaR = DiaR;
        this.MesR = MesR;
        this.AñoR = AñoR;
        this.EstadoR = EstadoR;
        this.MunicipioR = MunicipioR;
        this.LocalidadR = LocalidadR;
        this.FechaR = (DosC.format(DiaR) + "/" + DosC.format(MesR) + "/" + DosC.format(AñoR));
        this.LibroFormat = LB.format(Libro);
        this.NumActaFormat = ACT.format(Acta);
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
