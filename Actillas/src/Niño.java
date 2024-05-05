
import java.text.DecimalFormat;

public class Niño {

    public static DecimalFormat DosC = new DecimalFormat("00");

    protected String Nombre, Apellido1, Apellido2 = null, FechaNaci, Localidad, Municipio, Estado, Curp, HomoClave;
    private char Sexo;
    private boolean Registrado, DosTutores;
    private int Dia,Mes, Año;
    protected char a,b;
    protected Padres Padre1, Padre2;
   
    
    // Constructor para cuando tine 2 padres
    public Niño(Padres Papa, Padres Mama, String Nombre, String Localidad, String Municipio, String Estado,
            char sexo, boolean Registrado, int Dia, int Mes, int Año) {
        this.Nombre = Nombre;
        this.Apellido1 = Papa.getApellido1();
        Padre1 = Papa;
        this.Apellido2 = Mama.getApellido1();
        Padre2 = Mama;
        this.Registrado = Registrado;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Estado = Estado;
        this.Sexo = sexo;
        this.DosTutores = true;
    }

    // Constructor para cuando tiene solo un padre
    public Niño(Padres Soltero, String Nombre, String Localidad, String Municipio, String Estado,
            char sexo, boolean Registrado, int Dia, int Mes, int Año) {
        this.Nombre = Nombre;
        this.Apellido1 = Soltero.getApellido1();
        this.Dia = Dia;
        MesNum();
        this.Mes = Mes;
        this.Año = Año;
        this.FechaNaci = (DosC.format(Dia) + "/" + DosC.format(Mes) + "/" + DosC.format(Año));
        this.Localidad = Localidad;
        this.Municipio = Municipio;
        this.Sexo = sexo;
        this.Registrado = Registrado;
        this.DosTutores = false;
    }

    public void GenerarCurp(Niño registrando) {
        // si no hay segundo apellido se llena el espacio conuna x
        // si se llama jose o maria, se toma en cuenta el segundo nombre en lugar del
        // primero
        // El plan es que se ejecute distinto segun si tiene o no dos padres

        if (registrando.DosTutores == false){
            //Captura el primer caracter del apeliido
            char c1 = Apellido1.charAt(0);
            char c2 = 0;
            //Captura la vocal del apellido
            for (int i = 0; i < Apellido1.length(); i++) {
               char L = Apellido1.charAt(i);
               if(L == 'A' ||L == 'E' ||L == 'I' ||L == 'O' ||L == 'U'|| L == 'e'|| L == 'i'|| L == 'o'|| L == 'u'){
                c2 = Character.toUpperCase(L);
                break;
               }
            }
            char c4 = Nombre.charAt(0);
            //Como no hay segundo apellido se genera una x en su ausencia
            String Ano = String.valueOf(Año);
            char c5 = Ano.charAt(2);
            char c6 = Ano.charAt(3);
            //Llamamos al metodo entidad federativa para que lea el estado y nos diga su abreviacion6
            EntiedadFederativa();
            char c12 = a;
            char c13 = b;
            char c14 = 0;
            for (int i = 0; i < Apellido1.length(); i++) {
                char L = Apellido1.charAt(i);
                if(L != 'A' && L != 'E' && L != 'I' && L != 'O' && L != 'U'){//Busca Consonantes excluyendo vocales
                 c14 = Character.toUpperCase(L);
                 break;
                }
            }
            char c15 = 0;
            for (int i = 0; i < Apellido2.length(); i++) {
                char L = Apellido2.charAt(i);
                if(L != 'A' && L != 'E' && L != 'I' && L != 'O' && L != 'U'){
                 c15 = Character.toUpperCase(L);
                 break;
                }
            }
            char c16 = 0;
            for (int i = 0; i < Nombre.length(); i++) {
                char L = Nombre.charAt(i);
                if(L != 'A' || L != 'E' || L != 'I' || L != 'O' || L != 'U'){
                 c16 = Character.toUpperCase(L);
                }else{
                    c16 = 'X';
                 
                 break;
                }
            }
                GenerarHomoClave();
            System.out.println(c1 + "" + c2 + "" + "x" + "" + c4 + "" + c5 + "" + c6 + "" + Mes + "" + Dia + "" + Sexo + "" + c12 + "" + c13 + "" + c14 + "" + c15 + "" + c16 + "" + HomoClave);
        }else{
            char c1 = Apellido1.charAt(0);
            char c2 = 0;
            //Captura la vocal del apellido
            for (int i = 1; i < Apellido1.length(); i++) {
               char L = Apellido1.charAt(i);
               if(L == 'A' ||L == 'E' ||L == 'I' ||L == 'O' ||L == 'U' || L == 'a'|| L == 'e'|| L == 'i'|| L == 'o'|| L == 'u'){
                c2 = Character.toUpperCase(L);
                break;
               }
            }
            char c3 = Apellido2.charAt(0);
            char c4 = Nombre.charAt(0);
            String Ano = String.valueOf(Año);
            char c5 = Ano.charAt(2);
            char c6 = Ano.charAt(3);
            //Llamamos al metodo entidad federativa para que lea el estado y nos diga su abreviacion6
            EntiedadFederativa();
            char c12 = a;
            char c13 = b;
            char c14 = 0;
            for (int i = 0; i < Apellido1.length(); i++) {
                char L = Apellido1.charAt(i);
                if(L != 'A' && L != 'E' && L != 'I' && L != 'O' && L != 'U'){//Busca Consonantes excluyendo vocales
                 c14 = Character.toUpperCase(L);
                 break;
                }
            }
            char c15 = 0;
            for (int i = 0; i < Apellido2.length(); i++) {
                char L = Apellido2.charAt(i);
                if(L != 'A' && L != 'E' && L != 'I' && L != 'O' && L != 'U'){
                 c15 = Character.toUpperCase(L);
                 break;
                }
            }
            char c16 = 0;
            for (int i = 0; i < Nombre.length(); i++) {
                char L = Nombre.charAt(i);
                if(L == 'A' || L == 'E' || L == 'I' || L == 'O' || L == 'U'){
                 c16 = Character.toUpperCase(L);
                }else{
                    c16 = 'X';
                 break;
                }
            }
                GenerarHomoClave();
            System.out.println(c1 + "" + c2 + "" + c3 + "" + c4 + "" + c5 + "" + c6 + "" + Mes + "" + Dia + "" + Sexo + "" + c12 + "" + c13 + "" + c14 + "" + c15 + "" + c16 + "" + HomoClave);
        }

        // Para las claves de los estados usaremos la primera letra y la ultima
        // consonante
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

        for (int i = 1; i < 3; i++) {
            int ran = (int) (Math.random() * (2));// Num. 0-1

            // Aqui segun el resultado "ran" se determina si sera un careter numerico o
            // alfabetico
            if (ran == 0) {
                // Selecciona un numero al azar de 0-9
                temp = (char) (int) (Math.random() * (10));
            } else {
                // Seleciona un numero al azar de 0-25
                ran = (int) (Math.random() * (26));
                // Se le accigna un carcter de la cadena abecedario con base al num. aleatorio
                temp = Abecedrio.charAt(ran);
            }

            // Agina los valores de "temp" a los digitos
            if (i == 1) {
                Digito1 = temp;
            } else {
                Digito2 = temp;
            }
        } // Fin del For

        // Se covierten los caracteres a cadena y se asigna valor a la homoclave
        this.HomoClave = String.valueOf(Digito1)+ "" + String.valueOf(Digito2);
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
            case "Aguas Calientes" :
                a = 'A';
                b = 'C';
                break;

                case "Baja California" :
                a = 'B';
                b = 'C';
                break;
                                
                case "Coahuila" :
                a = 'C';
                b = 'L';
                break;
                                
                case "Chiapas" :
                a = 'C';
                b = 'S';
                break;
                                
                case "Campeche" :
                a = 'C';
                b = 'C';
                break;
                                
                case "Colima" :
                a = 'C';
                b = 'M';
                break;
                                
                case "Chihuahua" :
                a = 'C';
                b = 'H';
                break;
                                
                case "Distrito Federal " :
                a = 'D';
                b = 'F';
                break;
                                
                case "Durango" :
                a = 'D';
                b = 'G';
                break;
                                
                case "Guanajuato" :
                a = 'G';
                b = 'T';
                break;
                                
                case "Guerrero" :
                a = 'G';
                b = 'R';
                break;
                                
                case "Hidalgo" :
                a = 'H';
                b = 'G';
                break;
                                
                case "Jalisco" :
                a = 'J';
                b = 'C';
                break;
                                
                case "Mexico" :
                a = 'M';
                b = 'C';
                break;
                                
                case "Michoacan" :
                a = 'M';
                b = 'N';
                break;
                                
                case "Nuevo Leon" :
                a = 'N';
                b = 'L';
                break;
                                
                case "Morelos" :
                a = 'M';
                b = 'S';
                break;
                                
                case "Nayarit" :
                a = 'N';
                b = 'T';
                break;
                                
                case "Oaxaca" :
                a = 'O';
                b = 'C';
                break;
                                
                case "Puebla" :
                a = 'P';
                b = 'L';
                break;
                                
                case "Queretaro" :
                a = 'Q';
                b = 'T';
                break;
                                
                case "Quintanaroo" :
                a = 'Q';
                b = 'R';
                break;
                                
                case "San Luis Potosi" :
                a = 'S';
                b = 'P';
                break;
                                
                case "Sinaloa" :
                a = 'S';
                b = 'L';
                break;
                                
                case "Sonora" :
                a = 'S';
                b = 'R';
                break;
                                
                case "Tlaxcala" :
                a = 'T';
                b = 'L';
                break;
                                
                case "Tabasco" :
                a = 'T';
                b = 'C';
                break;
                                
                case "Tamaulipas" :
                a = 'T';
                b = 'S';
                break;
                                
                case "Veracruz" :
                a = 'V';
                b = 'Z';
                break;
                                
                case "Yucatan" :
                a = 'Y';
                b = 'N';
                break;
                                
                case "Zacatecas" :
                a = 'Z';
                b = 'S';
                break;
                                
                case "Nacido en el extrangero" :
                a = 'N';
                b = 'E';
                break;
        }
    }

    public void MesNum(){
        switch (Mes) {
            case 1:
            Mes = Integer.parseInt("01");   
                break;
            case 2:
            Mes = Integer.parseInt("02");   
                break;
            case 3:
            Mes = Integer.parseInt("03");    
                break;
            case 4:
                Mes = Integer.parseInt("04");    
                break;
            case 5:
                Mes = Integer.parseInt("05");    
                break;
            case 6:
            Mes = Integer.parseInt("06");    
                break;
            case 7:
            Mes = Integer.parseInt("07");   
                break;
            case 8:
            Mes = Integer.parseInt("08");  
                break;
            case 9:
            Mes = Integer.parseInt("09");   
                break;
            case 10:
            Mes = Integer.parseInt("10");    
                break;
            case 11:
            Mes = Integer.parseInt("11");   
                break;
            case 12:
            Mes = Integer.parseInt("12");    
                break;
        }
    

    }

    public String getApellidoP(Padres Padre) {
        return Apellido1;
    }

    public String getApellidoM(Padres Madre) {
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
