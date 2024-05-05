
import java.text.DecimalFormat;

public class Niño {

    public static DecimalFormat DosC = new DecimalFormat("00");

    private String Nombre, Apellido1, Apellido2 = null, FechaNaci, Localidad, Municipio, Estado, Curp, HomoClave;
    private char Sexo;
    private boolean Registrado, DosTutores;
    private int Dia, Mes, Año;

    // Constructor para cuando tine 2 padres
    public Niño(Padres Papa, Padres Mama, String Nombre, String Localidad, String Municipio, String Estado,
            char Sexo, boolean Registrado, int Dia, int Mes, int Año) {
        this.Nombre = Nombre;
        this.Apellido1 = Papa.getApellido1();
        this.Apellido2 = Mama.getApellido1();
        this.Registrado = Registrado;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Sexo = Sexo;
        this.DosTutores = true;

    }

    // Constructor para cuando tiene solo un padre
    public Niño(Padres Soltero, String Nombre, String Localidad, String Municipio, String Estado,
            char Sexo, boolean Registrado, int Dia, int Mes, int Año) {
        this.Nombre = Nombre;
        this.Apellido1 = Soltero.getApellido1();
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Sexo = Sexo;
        this.Registrado = Registrado;
        this.DosTutores = false;
    }

    public void GenerarCurp(Niño registrando) {
        // si no hay segundo apellido se llena el espacio conuna x
        // si se llama jose o maria, se toma en cuenta el segundo nombre en lugar del
        // primero
        // El plan es que se ejecute distinto segun si tiene o no dos padres

    }

    public void GenerarHomoClave() {

        // Variables para cada digito y una de alcenamiento temporal
        char Digito1 = 'A', Digito2 = '0', temp;
        // Cadena uqe contiene todas las letras que vamos a usar (26)
        final String Abecadrio = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 1; i < 3; i++) {
            int ran = (int) (Math.random() * (2));// Num. 0-1

            // Aqui segun el resultado "ran" se determina si sera un careter numerico o
            // alfabetico
            if (ran == 0) {
                // Selecciona un numero al azar de 0-9
                temp = (char) (int) (Math.random() * (10));
            } else {
                // Seleciona un numero al azar de 0-24
                ran = (int) (Math.random() * (26));
                // Se le accigna un carcter de la cadena abecedario con base al num. aleatorio
                temp = Abecadrio.charAt(ran);
            }

            // Agina los valores de "temp" a los digitos
            if (i == 1) {
                Digito1 = temp;
            } else {
                Digito2 = temp;
            }
        } // Fin del For

        // Se covierten los caracteres a cadena y se asigna valor a la homoclave
        this.HomoClave = String.valueOf(Digito1) + String.valueOf(Digito2);
    }

    // Getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getFechaNaci() {
        return FechaNaci;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public String getMunipio() {
        return Municipio;
    }

    public String getEstado() {
        return Estado;
    }

    public char getSexo() {
        return Sexo;
    }

    public boolean getRegistrado() {
        return Registrado;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAño() {
        return Año;
    }

    public String getCurp() {
        return Curp;
    }

}
