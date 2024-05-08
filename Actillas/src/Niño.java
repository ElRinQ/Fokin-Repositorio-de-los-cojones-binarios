
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Niño {

    public static DecimalFormat DosC = new DecimalFormat("00");
    public static BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));


    protected String Nombre, Apellido1, Apellido2 = null, FechaNaci, Localidad, Municipio, Estado, Curp, HomoClave;
    private char Sexo;
    private boolean Registrado, DosTutores;

    private int Dia, Mes, Año , NCreados;
    protected char a,b , Decada , Anualidad;
    protected Padres Padre1, Padre2;


    // Constructor para cuando tine 2 padres
    public Niño(){
        NCreados++;
        
    }
    // Segun tengo entendido esto ya no sirve de nada
    public Niño(Padres Papa, Padres Mama, String Nombre, String Localidad, String Municipio, String Estado,
            char sexo, boolean Registrado, int Dia, int Mes, int Año) {
        NCreados++;
        this.Nombre = Nombre;
        this.Apellido1 = Papa.getApellido1();
        Padre1 = Papa;
        this.Apellido2 = Mama.getApellido1();
        Padre2 = Mama;
        this.Registrado = Registrado;
        this.Dia = Dia;
        this.Mes = Mes;
        DosC.format(Mes);
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Estado = Estado;
        this.Sexo = sexo;
        this.DosTutores = true;
    }
    //y esto tampoco
    // Constructor para cuando tiene solo un padre
    public Niño(Padres Soltero, String Nombre, String Localidad, String Municipio, String Estado,
            char sexo, boolean Registrado, int Dia, int Mes, int Año) {
        NCreados++;
        this.Nombre = Nombre;
        this.Apellido1 = Soltero.getApellido1();
        Padre1 = Soltero;
        this.Dia = Dia;
        this.Mes = Mes;
        DosC.format(Mes);
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Estado = Estado;
        this.Sexo = sexo;
        this.Registrado = Registrado;
        this.DosTutores = false;
    }

    public void GenerarCurp() {
        
        // Este Metodo se encarga de recopilar los datos necerios para una curp y
        // unirlos
        this.GenerarHomoClave();
        if (DosTutores == true) {
            // Caso en que tiene 2 tutores todo se puede llenar correctamente
            this.Curp = this.SelctorDeLetra(this.getApellido1(), 1) + "" + this.SelctorDeLetra(this.getApellido1(), 3)
                    + this.SelctorDeLetra(this.getApellido2(), 1) + "" + this.SelctorDeLetra(this.getNombre(), 1) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 6) + ""
                    + this.SelctorDeLetra(String.valueOf(this.getAño()), 5)
                    + DosC.format(this.getMes()) + "" + DosC.format(this.getDia()) + "" + this.getSexo() + ""
                    + this.SelctorDeLetra(this.getEstado(), 1) + "" + this.SelctorDeLetra(this.getEstado(), 4) + ""
                    + this.SelctorDeLetra(this.getApellido1(), 2) + "" + this.SelctorDeLetra(this.getApellido2(), 2)
                    + this.SelctorDeLetra(this.getNombre(), 2) + "" + this.getHomoClave();

        } else {
            // Caso en el que tiene solo uno, los datos que no pueden ser llenados se
            // remplazan por X
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
        final String Consonantes = "BCDFGHJKLMNÑOPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";// Consonantes y sus variables
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
                        LetraSelecionada = Palabra.charAt(contador);
                        ConIn = true;
                    } else {
                        // Se seleciona la letra que vamos a evaluar
                        LetraSelecionada = Palabra.charAt(contador + 1);
                        for (int i = 0; i < Consonantes.length(); i++) {
                            // Se evalua que sea consonante
                            if (LetraSelecionada == Consonantes.charAt(i)) {
                                ConIn = true;
                            }
                        }
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
                        LetraSelecionada = Palabra.charAt(contador);
                        VoIn = true;
                    } else {
                        // Se seleciona la letra que vamos a evaluar
                        LetraSelecionada = Palabra.charAt(contador + 1);
                        for (int i = 0; i < Vocales.length(); i++) {
                            // Se evalua que sea vocal
                            if (LetraSelecionada == Vocales.charAt(i)) {
                                VoIn = true;
                            }
                        }
                    }
                    contador++;
                } while ((VoIn == false) && (contador < Palabra.length()));
                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////
            case 4://Ultima consonante
                //La variable UltimaCons Almacena la ultimima consonante de la palabra evaluada
                char UltimaCons = Palabra.charAt(contador);
                do {
                    boolean EsCon = false;//Esta variable evita que se pierda tiempo
                    LetraSelecionada = Palabra.charAt(contador);
                    for (int i = 0; (i < Consonantes.length()) && EsCon == false; i++) {
                        //Se confirma que la letra sea una consonante
                        if (LetraSelecionada == Consonantes.charAt(i)) {
                            UltimaCons = LetraSelecionada;//Se copea la consonante
                            EsCon = true;
                        }
                    }
                    LetraSelecionada = UltimaCons;//Se pone la ultima cons para el retorno
                    contador++;
                } while ((contador < Palabra.length()));
                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////

            case 5:// Ultimo Caracteres
                   // Toma el largo de la cadena y se va por el ultimo carracter
                LetraSelecionada = Palabra.charAt(Palabra.length() - 1);
                break;
            case 6:// Penultimo Caracter
                   // Toma el largo de la cadena y devuelve el penultimo caracter
                if (Palabra.length() > 1) {
                    LetraSelecionada = Palabra.charAt(Palabra.length() - 2);
                } else {
                    LetraSelecionada = Palabra.charAt(0);// Caso de 1 caracter nomas
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

    public void getNombreCompleto(String A1, String A2, String N){
        Apellido1 = A1;
        Apellido2 = A2;
        Nombre = N;

    }

    public void EntiedadFederativa(){

        switch (Estado) {
            case "Aguas Calientes" , "aguas calientes" :
                a = 'A';
                b = 'C';
                break;

                case "Baja California" , "baja california" :
                a = 'B';
                b = 'C';
                break;
                                
                case "Coahuila" , "cohahuila" :
                a = 'C';
                b = 'L';
                break;
                                
                case "Chiapas" , "chiapas":
                a = 'C';
                b = 'S';
                break;
                                
                case "Campeche" , "campeche":
                a = 'C';
                b = 'C';
                break;
                                
                case "Colima" , "colima" :
                a = 'C';
                b = 'M';
                break;
                                
                case "Chihuahua" , "chihuahua" :
                a = 'C';
                b = 'H';
                break;
                                
                case "Distrito Federal" , "distrito federal" :
                a = 'D';
                b = 'F';
                break;
                                
                case "Durango" , "durango" :
                a = 'D';
                b = 'G';
                break;
                                
                case "Guanajuato" , "guanajuato" :
                a = 'G';
                b = 'T';
                break;
                                
                case "Guerrero", "guerrero" :
                a = 'G';
                b = 'R';
                break;
                                
                case "Hidalgo", "hidalgo" :
                a = 'H';
                b = 'G';
                break;
                                
                case "Jalisco" , "jalisco" :
                a = 'J';
                b = 'C';
                break;
                                
                case "Mexico" , "mexico":
                a = 'M';
                b = 'C';
                break;
                                
                case "Michoacan" , "michoacan":
                a = 'M';
                b = 'N';
                break;
                                
                case "Nuevo Leon" , "nuevo leon" :
                a = 'N';
                b = 'L';
                break;
                                
                case "Morelos" , "morelos" :
                a = 'M';
                b = 'S';
                break;
                                
                case "Nayarit" , "nayarit":
                a = 'N';
                b = 'T';
                break;
                                
                case "Oaxaca" , "oaxaca" :
                a = 'O';
                b = 'C';
                break;
                                
                case "Puebla" , "puebla" :
                a = 'P';
                b = 'L';
                break;
                                
                case "Queretaro" , "queretaro":
                a = 'Q';
                b = 'T';
                break;
                                
                case "Quintanaroo" , "quintanaroo" :
                a = 'Q';
                b = 'R';
                break;
                                
                case "San Luis Potosi" , "san luis potosi" :
                a = 'S';
                b = 'P';
                break;
                                
                case "Sinaloa" , "sinaloa":
                a = 'S';
                b = 'L';
                break;
                                
                case "Sonora" , "sonora" :
                a = 'S';
                b = 'R';
                break;
                                
                case "Tlaxcala" , "tlaxcala" :
                a = 'T';
                b = 'L';
                break;
                                
                case "Tabasco" , "tabasco" :
                a = 'T';
                b = 'C';
                break;
                                
                case "Tamaulipas" , "tamaulipas" :
                a = 'T';
                b = 'S';
                break;
                                
                case "Veracruz" , "veracruz" :
                a = 'V';
                b = 'Z';
                break;
                                
                case "Yucatan" , "yucatan":
                a = 'Y';
                b = 'N';
                break;
                                
                case "Zacatecas" , "zacatecas" :
                a = 'Z';
                b = 'S';
                break;
                                
                case "Nacido en el extrangero" , "extrangero", "nacido en el extrangero" :
                a = 'N';
                b = 'E';
                break;
        }
    }

    public void MesNum() {
        switch (Mes) {
            case 1:
                Decada = '0';
                Anualidad = '1';
                break;
            case 2:
                Decada = '0';
                Anualidad = '2';
                break;
            case 3:
                Decada = '0';
                Anualidad = '3';
                break;
            case 4:
                Decada = '0';
                Anualidad = '4';
                break;
            case 5:
                Decada = '0';
                Anualidad = '5';
                break;
            case 6:
                Decada = '0';
                Anualidad = '6';
                break;
            case 7:
                Decada = '0';
                Anualidad = '7';
                break;
            case 8:
                Decada = '0';
                Anualidad = '8';
                break;
            case 9:
                Decada = '0';
                Anualidad = '9';
                break;
            case 10:
                Decada = '1';
                Anualidad = '0';
                break;
            case 11:
                Decada = '1';
                Anualidad = '1';
                break;
            case 12:
                Decada = '1';
                Anualidad = '2';
                break;
        }
    }

    public int getNCreados(){
        return NCreados;
        
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getFechaNaci() {
        FechaNaci = (DosC.format(this.Dia) + "/" + DosC.format(this.Mes) + "/" + DosC.format(this.Año));
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

    public void setNombre(){
        Scanner SC1 = new Scanner(System.in);
        String nombre = SC1.nextLine();
        this.Nombre = nombre; 
    }


    public void setApellidoP(Padres Padre){
        Padre1 = Padre;
        this.Apellido1 = Padre.getApellido1();
    }

    public void setApellidoM(Padres Madre){
        DosTutores = true;
        Padre2 = Madre;
        this.Apellido2 = Madre.getApellido1();
    }

    public void setFechaCum(){
        System.out.println("Dia de nacimiento :");
        Scanner SCN1 = new Scanner(System.in);
        int dia = SCN1.nextInt();
        this.Dia = dia;
        System.out.println("Mes de nacimiento :");
        Scanner SCN2 = new Scanner(System.in);
        int mes = SCN2.nextInt();
        this.Mes = mes;
        System.out.println("Año de nacimiento : ");
        Scanner SCN3 = new Scanner(System.in);
        int año = SCN3.nextInt();
        this.Año = año;
    }

    public void setEstado(){
        System.out.println("Ingrese el estado en el que el niño nacio : ");
        
        Scanner Sc = new Scanner(System.in);
        String estado = Sc.nextLine();
        
        this.Estado = estado;
        EntiedadFederativa();
    }

    public void setLocalidad(){
        System.out.println("Ingrese la localidad en la que el niño nacio :");
        Scanner sc = new Scanner(System.in);
        String localidad = sc.nextLine();
        this.Localidad = localidad;

    }

    public void setMunicipio(){
        System.out.println("Ingrese el municipio en el que el niño nacio :");
        Scanner sc = new Scanner(System.in);
        String municipio = sc.nextLine();
        this.Municipio = municipio;

    }

    public String toString(){
        
        return "El niño " + getNCreados() +"De sexo " + getSexo() + " de nombre " + getNombre() + " y apellidos " + Padre1.getApellido1() + " " + " Nacio el " + FechaNaci;
    }

    // Setters

    public void setSexo() throws java.io.IOException {
        System.out.println("Ingrese el sexo del niño : ");
        this.Sexo = Character.toUpperCase(Leer.readLine().charAt(0));
    }

    public void setRegistro() throws java.io.IOException {
        do {
            System.out.println("Estado de registro: ");
            char regisTemp = Character.toUpperCase(Leer.readLine().charAt(0));

            if (regisTemp == 'M') {
                this.Registrado = false;
                break;
            } else {
                if (regisTemp == 'V') {
                    this.Registrado = true;
                    break;
                } else {
                    System.out.println(
                            "Estado invalido, porfavor llene con el estado de vivo o muerto segun sea el caso");
                }
            }
        } while (true);
    }

        public void cerrarLector() {
        try {
            Leer.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el lector: " + e.getMessage());
        }
    }
}
