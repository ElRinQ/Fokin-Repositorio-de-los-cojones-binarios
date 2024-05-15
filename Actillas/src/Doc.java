import java.io.FileWriter;
import java.io.IOException;

public class Doc implements Metodos{

    Padres Padre = new Padres();
    Padres Madre = new Padres();
    Niño NiñoL = new Niño();
    InfoDoc InfoD = new InfoDoc();
    private String nombreArchivo;
    public Doc(){

    }
    @Override

    public void Generar() throws IOException {
        Padres.DeterminarNumTut();
        if (Niño.getDosTutores() == false) {
            Padre.Generar();
        } else {
            Padre.Generar();
            Madre.Generar();
        }
        NiñoL.Generar();
        InfoD.Generar();

        nombreArchivo = "Acta De Nacimiento " + this.NiñoL.getCurp() + ".txt";

        try (FileWriter DocumentoFinal = new FileWriter(nombreArchivo)) {

            
            DocumentoFinal.write(
                    "                                          ESTADOS UNIDOS MEXICANOS                                            ");
            DocumentoFinal.write(
                    "\n                                       GOBIERNO DEL ESTADO DE SONORA                                        ");
            DocumentoFinal.write(
                    "\n                                               REGISTRO CIVIL                                               ");
                    DocumentoFinal.write(
                    "\n                                             ACTA DE NACIMIENTO                                             ");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");

            DocumentoFinal.write("              Oficialia:    \t");
            DocumentoFinal.write("Libro    \t");
            DocumentoFinal.write("Numero De Acta:     \t");
            DocumentoFinal.write("Fecha De Registro:     \t");
            DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            DocumentoFinal.write("\n              " + this.InfoD.getOficialiaFormat() + "\t");
            DocumentoFinal.write("         " + this.InfoD.getLibroFormat() + "\t");
            
            DocumentoFinal.write("              " + this.InfoD.getNumActaFormat() + "\t");
           
            DocumentoFinal.write("            " + this.InfoD.getFechaR() + "\t");

            DocumentoFinal.write(
                     "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");

            DocumentoFinal.write(
                       "|                                                   Curp                                                   |\n");
            DocumentoFinal.write(
                           "|                                            " + this.NiñoL.getCurp()  + "                                            |");
            DocumentoFinal.write(
                                "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");

            DocumentoFinal.write("\n           Localidad: ");
            DocumentoFinal.write(this.InfoD.getLocalidadR() + "\t");
            DocumentoFinal.write("Municipio: ");
            DocumentoFinal.write(this.InfoD.getMunicipioR() + "\t");
            DocumentoFinal.write("Entidad Federativa: ");
            DocumentoFinal.write(this.InfoD.getEstadoR() + "\t");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");

            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            DocumentoFinal.write(
                    "\n                                              DATOS DEL REGISTRADO                                          ");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");
            if (Niño.getDosTutores() == true) {
                DocumentoFinal.write("\n|NOMBRE:                              " + this.NiñoL.getNombre() + " "
                        + this.NiñoL.getApellido1() + " " + this.NiñoL.getApellido2());
            } else {
                DocumentoFinal.write("\n|NOMBRE:                              " + this.NiñoL.getNombre() + " "
                        + this.NiñoL.getApellido1());
            }
            DocumentoFinal.write("\n|FECHA DE NACIMIENTO: " + this.NiñoL.getFechaNaci());
            if(NiñoL.getRegistrado()== false){
                DocumentoFinal.write("\n|REGISTRADO: Muerto" + "                               " + " Sexo: " + this.NiñoL.getSexo() + "\t");                                
            }else{
                DocumentoFinal.write("\n|REGISTRADO: Vivo" + "                               "
                + " Sexo: " + this.NiñoL.getSexo() + "\t");
            }
            DocumentoFinal.write("\n|LUGAR DE NACIMIENTO: " + this.NiñoL.getLocalidad() + ", " + this.NiñoL.getMunipio()
                    + ", " + this.NiñoL.getEstado() + ", Mexico\n");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            DocumentoFinal.write(
                    "\n                                              DATOS DE LOS PADRES                                           ");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");
            if (Niño.getDosTutores() == false) {
                DocumentoFinal.write("\n|NOMBRE DEL TUTOR:                    " + Padre.getNombre() + " "
                        + Padre.getApellido1() + " " + Padre.getApellido2());
                DocumentoFinal.write("\n|Edad:  " + Padre.getEdad() + "                Nacionalidad : "
                        + Padre.getNacionalidad() + "\n");
            } else {
                DocumentoFinal.write("\n|NOMBRE DEL PADRE:                    " + Padre.getNombre() + " "
                        + Padre.getApellido1() + " " + Padre.getApellido2());
                DocumentoFinal.write("\n|Edad:  " + Padre.getEdad() + "                Nacionalidad : "
                        + Padre.getNacionalidad() + "\n");
                DocumentoFinal.write("\n|NOMBRE DE LA MADRE:                    " + Madre.getNombre() + " "
                        + Madre.getApellido1() + " " + Madre.getApellido2());
                DocumentoFinal.write("\n|Edad:  " + Madre.getEdad() + "                Nacionalidad :   "
                        + Madre.getNacionalidad());
            }
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|\n");

            DocumentoFinal.close();
            System.out.println("Archivo generado correctamente");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String GetNombreDelActa(){
        return nombreArchivo;

    }
}


