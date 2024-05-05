import java.text.DecimalFormat;

public class InfoDoc {

    public static DecimalFormat DosC = new DecimalFormat("00");
    public static DecimalFormat LB = new DecimalFormat("0000");
    public static DecimalFormat ACT = new DecimalFormat("000,000,000,000");

    private int Libro, Acta, DiaR, MesR, AñoR;
    private String EstadoR, MunicipioR, LocalidadR, FechaR;

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
        //Falta generar FechaR
    }

    // Getters (incompleto)
    public int getLibro() {
        return Libro;
    }

    public int getActa() {
        return Acta;
    }

    public int getDiaR() {
        return DiaR;
    }
}
