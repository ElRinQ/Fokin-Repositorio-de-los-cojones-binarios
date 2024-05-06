
import java.text.DecimalFormat;

public class Niño {

    public static DecimalFormat DosC = new DecimalFormat("00");

    protected String Nombre, Apellido1, Apellido2 = null, FechaNaci, Localidad, Municipio, Estado, Curp, HomoClave;
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
        this.Estado = Estado;
        this.Sexo = Sexo;
        this.DosTutores = true;
        this.GenerarCurp();

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
        this.Estado = Estado;
        this.Sexo = Sexo;
        this.Registrado = Registrado;
        this.DosTutores = false;
        this.GenerarCurp();

    }

    public void GenerarCurp() {
        //Este Metodo se encarga de recopilar los datos necerios para una curp y unirlos
        this.GenerarHomoClave();
        if (DosTutores == true) {
            //Caso en que tiene 2 tutores todo se puede llenar correctamente
            this.Curp = this.SelctorDeLetra(this.getApellido1(), 1) + "" + this.SelctorDeLetra(this.getApellido1(), 3)
                    + this.SelctorDeLetra(this.getApellido2(), 1) + "" + this.SelctorDeLetra(this.getNombre(), 1) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 6) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 5)
                    + DosC.format(this.getMes()) + "" + DosC.format(this.getDia()) + "" + this.getSexo() + ""
                    + this.SelctorDeLetra(this.getEstado(), 1) + "" + this.SelctorDeLetra(this.getEstado(), 4) + ""
                    + this.SelctorDeLetra(this.getApellido1(), 2) + "" + this.SelctorDeLetra(this.getApellido2(), 2)
                    + this.SelctorDeLetra(this.getNombre(), 2) + "" + this.getHomoClave();

        } else {
            //Caso en el que tiene solo uno, los datos que no pueden ser llenados se remplazan por X
            this.Curp = this.SelctorDeLetra(this.getApellido1(), 1) + "" + this.SelctorDeLetra(this.getApellido1(), 3)
                    + "X" + this.SelctorDeLetra(this.getNombre(), 1) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 6) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 5)
                    + DosC.format(this.getMes()) + "" + DosC.format(this.getDia()) + "" + this.getSexo() + ""
                    + this.SelctorDeLetra(this.getEstado(), 1) + "" + this.SelctorDeLetra(this.getEstado(), 4) + ""
                    + this.SelctorDeLetra(this.getApellido1(), 2) + "X"
                    + this.SelctorDeLetra(this.getNombre(), 2) + "" + this.getHomoClave();
        }
    }

    public char SelctorDeLetra(String Palabra, int Modalidad) {
        char LetraSelecionada = '#';
        final String Vocales = "AEIOUaeiouáéíóúü";// Vocales y sus variantes
        final String Consonantes = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";// Consonantes y sus variables
        final String Abecedrio = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZbcdfghjklmnñpqrstvwxyzaeiouáéíóúü";// Abecedario con
        // variantes
        int contador = 0;

        switch (Modalidad) {

            case 1:// Primera Letra
                boolean EsLet = false;
                // El bucle sigira hasta encontrar una letra o que no haya mas caracteres para
                // evaluar
                do {
                    // Se seleciona la letra que vamos a evaluar
                    LetraSelecionada = Palabra.charAt(contador);
                    LetraSelecionada = Character.toUpperCase(LetraSelecionada);
                    for (int i = 0; i < Abecedrio.length(); i++) {
                        // Se comprueba que este en el abecedario
                        if (LetraSelecionada == Abecedrio.charAt(i)) {
                            EsLet = true;
                        }
                    }

                    contador++;
                } while ((EsLet == false) && (contador < Palabra.length()));

                break;
            ///////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:// Primer Consonante Interna
                boolean ConIn = false;
                // El bucle sigira hasta encontrar una consonante o que no haya mas caracteres
                // para evaluar
                do {
                    // Este if confirma que la palabra tenga mas de una letra
                    if (Palabra.length() <= contador + 1) {
                        // Se asigna esa unica letra como valor de retorno
                        LetraSelecionada = 'X';
                        ConIn = true;
                    } else {
                        // Se seleciona la letra que vamos a evaluar
                        LetraSelecionada = Palabra.charAt(contador + 1);
                        LetraSelecionada = Character.toUpperCase(LetraSelecionada);
                        for (int i = 0; i < Consonantes.length(); i++) {
                            // Se evalua que sea consonante
                            if (LetraSelecionada == Consonantes.charAt(i)) {
                                ConIn = true;
                            }
                        }
                    }
                    if (ConIn == false) {
                        LetraSelecionada = 'X';
                    }
                    contador++;
                } while ((ConIn == false) && (contador < Palabra.length()));

                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////
            case 3:// Primera vocal interna
                boolean VoIn = false;
                do {
                    // Este if confirma uqe la palabra tenga mas de una letra
                    if (Palabra.length() <= contador + 1) {
                        LetraSelecionada = 'X';
                        VoIn = true;
                    } else {
                        // Se seleciona la letra que vamos a evaluar
                        LetraSelecionada = Palabra.charAt(contador + 1);
                        LetraSelecionada = Character.toUpperCase(LetraSelecionada);
                        for (int i = 0; i < Vocales.length(); i++) {
                            // Se evalua que sea vocal
                            if (LetraSelecionada == Vocales.charAt(i)) {
                                VoIn = true;
                            }
                        }
                    }
                    if (VoIn == false) {
                        LetraSelecionada = 'X';
                    }
                    contador++;
                } while ((VoIn == false) && (contador < Palabra.length()));
                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////
            case 4:// Ultima consonante
                   // La variable UltimaCons Almacena la ultimima consonante de la palabra evaluada
                char UltimaCons = Palabra.charAt(contador);
                do {
                    boolean EsCon = false;// Esta variable evita que se pierda tiempo
                    LetraSelecionada = Palabra.charAt(contador);
                    for (int i = 0; (i < Consonantes.length()) && EsCon == false; i++) {
                        // Se confirma que la letra sea una consonante
                        if (LetraSelecionada == Consonantes.charAt(i)) {
                            UltimaCons = LetraSelecionada;// Se copea la consonante
                            EsCon = true;
                        }
                    }
                    LetraSelecionada = Character.toUpperCase(UltimaCons);// Se pone la ultima cons para el retorno
                    contador++;
                } while ((contador < Palabra.length()));
                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////
            case 5:// Ultimo Caracteres
                //Toma el largo de la cadena y se va por el ultimo carracter
                LetraSelecionada = Palabra.charAt(Palabra.length() - 1);
                break;
            case 6://Penultimo Caracter
                //Toma el largo de la cadena y devuelve el penultimo caracter
                if (Palabra.length() > 1) {
                    LetraSelecionada = Palabra.charAt(Palabra.length() - 2);
                } else {
                    LetraSelecionada = Palabra.charAt(0);//Caso de 1 caracter nomas
                }
                break;
            default:// Primera Caracter
                LetraSelecionada = Palabra.charAt(0);
                break;
        }

        return LetraSelecionada;
    }

    public void GenerarHomoClave() {

        // Variables para cada digito y una de alcenamiento temporal
        char Digito1 = 'A', Digito2 = '0', temp;
        // Cadena uqe contiene todas las letras que vamos a usar (26)
        final String Abecedrio = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String Numeros = "0123456789";

        for (int i = 0; i < 2; i++) {
            int ran = (int) (Math.random() * (3));// Num. 0-2

            // Aqui segun el resultado "ran" se determina si sera un careter numerico o
            // alfabetico
            if (ran >= 1) {
                // Selecciona un numero al azar de 0-9
                ran = (int) (Math.random() * (10));
                // Se selecciona un carcter de la cadena Numeros con base al num. aleatorio
                temp = Numeros.charAt(ran);
            } else {
                // Seleciona un numero al azar de 0-25
                ran = (int) (Math.random() * (26));
                // Se selecciona un carcter de la cadena abecedario con base al num. aleatorio
                temp = Abecedrio.charAt(ran);
            }

            // Agina los valores de "temp" a los digitos
            if (i == 0) {
                Digito1 = temp;
            } else {
                Digito2 = temp;
            }
        } // Fin del For

        // Se covierten los caracteres a cadena y se asigna valor a la homoclave
        this.HomoClave = String.valueOf(Digito1).concat(String.valueOf(Digito2));
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

    public String getHomoClave() {
        return HomoClave;
    }

}
