
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Acta_De_Nacimiento implements Metodos {

    private Niño Descendente;
    private Padres Padre , Madre;
    private InfoDoc Documentillo;
    private Scanner sc;

    public Acta_De_Nacimiento(Niño Registrado){
        this.Descendente = Registrado;
        sc = new Scanner(System.in);
    }

    public Acta_De_Nacimiento(Niño Registrado, InfoDoc Info, Padres Papa, Padres Mama) {
        this.Descendente = Registrado;
        this.Documentillo = Info;
        this.Padre = Papa;
        this.Madre = Mama;
    }

    public Acta_De_Nacimiento(Niño Registrado, InfoDoc Info, Padres Soltero) {
        this.Descendente = Registrado;
        this.Documentillo = Info;
        this.Padre = Soltero;
    }

    @Override
    public void Generar() throws java.io.IOException{
        Padre.Generar(); 
        Descendente.Generar();
        
    InfoDoc Doc;
    InfoDoc[][] Documentillo = null;
    Niño[][] Datos = null;

            try {
                FileWriter DocumentoFinal= new FileWriter("Acta De Nacimiento.txt");
                DocumentoFinal.write("                                           ESTADOS UNIDOS MEXICANOS                                           ");
                DocumentoFinal.write("\n                                       GOBIERNO DEL ESTADO DE SONORA                                        ");
                DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        InfoDoc Documentando = Documentillo[i][j];
                        DocumentoFinal.write("Oficialia\t");
                        DocumentoFinal.write("Libro\t");
                        DocumentoFinal.write("Acta\t");
                        DocumentoFinal.write("Fecha De Registro\t");
                    }
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    //DocumentoFinal.write(Doc.getOficialia() + "\t");
                    DocumentoFinal.write(Doc.getLibro() + "\t");
                    DocumentoFinal.write(Doc.getActa() + "\t");
                    DocumentoFinal.write(Doc.getFechaR() + "\t");
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        Niño DatosDelNene = Datos[i][j];
                        DocumentoFinal.write("Localidad\t");
                        DocumentoFinal.write("Municipio\t");
                        DocumentoFinal.write("Entidad Federativa\t");
                    }
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    DocumentoFinal.write(Descendente.getLocalidad());
                    DocumentoFinal.write(Descendente.getMunipio());
                    DocumentoFinal.write(Descendente.getEstado());
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                DocumentoFinal.write("\n                                              DATOS DEL REGISTRADO                                          ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE:                              " + Descendente.getNombre() + " " + Descendente.getApellido1() +" " + Descendente.getApellido2());
                DocumentoFinal.write("\nFECHA DE NACIMIENTO:  " + Descendente.getFechaNaci());
                DocumentoFinal.write("\nREGISTRADO:  " + Descendente.getRegistrado() + "                               " +" Sexo: " + Descendente.getSexo());
                DocumentoFinal.write("\nLUGAR DE NACIMIENTO" + Descendente.getLocalidad() + " " + Descendente.getMunipio() + " " + Descendente.getEstado() + " Mexico"  );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");

                DocumentoFinal.write("\n                                              DATOS DE LOS PADRES                                           ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE DEL PADRE:                    " + Padre.getNombre() + " " + Padre.getApellido1() +" " + Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + Padre.getEdad() + "                Nacionalidad :   " + Padre.getNacionalidad() );
                DocumentoFinal.write("\n|NOMBRE DE LA MADRE:                    " + Padre.getNombre() + " " + Padre.getApellido1() +" " + Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + Madre.getEdad() + "                Nacionalidad :   " + Madre.getNacionalidad() );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                
                DocumentoFinal.close();
                System.out.println("Archivo generado correctamente");
                }

             catch (Exception e) {
                e.printStackTrace();
            }
        
    }
    

    public void GenerarNiño() throws java.io.IOException {
        System.out.println("Por favor, ingrese los siguientes datos para el niño:");
        
        Descendente.setNombre();
        Descendente.setApellidoP(Padre);
        Descendente.setApellidoM(Madre);
        Descendente.setFechaCum();
        Descendente.GeneraFechaNaci();
        System.out.println(Descendente.getFechaNaci());
        Descendente.setEstado();
        Descendente.setMunicipio();
        Descendente.setLocalidad();
        Descendente.setSexo();
        Descendente.setRegistro();
        Descendente.GenerarCurp();
    }

    public void GenerarPadres() throws IOException{
        
        System.out.println("----Bienvenido al generador de actas de nacimiento----");
        System.out.println("======================================================");
        System.out.println("----------Es usted un padre o madre solter@-----------");
        String Entrada = sc.nextLine();
        if (Entrada.toLowerCase().contains("n") && Entrada.toLowerCase().contains("o")){
        this.Padre = new Padres();
        System.out.println("Porfavor , ingrese los siguientes datos para continuar");
        System.out.println("Nombre del Padre: ");
        Padre.setNombre();
        System.out.println("Primer apellido del padre :");
        Padre.setApellido1();
        System.out.println("Segundo apellido del padre");
        Padre.setApellido2();
        System.out.println("Edad del padre: ");
        Padre.setEdad();
        System.out.println("Nacionalidad del padre: ");
        Padre.setNacionalidad();
        this.Madre = new Padres();
        System.out.println("Nombre de la madre : ");
        Madre.setNombre();
        System.out.println("Primer apellido de la madre :");
        Madre.setApellido1();
        System.out.println("Segundo apellido de la madre");
        Madre.setApellido2();
        System.out.println("Edad de la madre : ");
        Madre.setEdad();
        System.out.println("Nacionalidad de la madre: ");
        Madre.setNacionalidad();
        }else{
            this.Padre = new Padres();
            System.out.println("Porfavor , ingrese los siguientes datos para continuar");
            System.out.println("Nombre del Padre o madre : ");
            Padre.setNombre();
            System.out.println("Primer apellido del padre o madre :");
            Padre.setApellido1();
            System.out.println("Segundo apellido del padre o madre");
            Padre.setApellido2();
            System.out.println("Edad del padre o madre : ");
            Padre.setEdad();
            System.out.println("Nacionalidad del padre o madre: ");
            Padre.setNacionalidad();
        }
    }

}
