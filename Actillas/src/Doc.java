import java.io.FileWriter;
import java.io.IOException;

public class Doc implements Metodos {

    Padres Padre = new Padres();
    Padres Madre = new Padres();
    Niño NiñoL = new Niño();
    InfoDoc InfoD = new InfoDoc();

    @Override
    public void Generar() throws IOException {
        Padre.Generar();
        NiñoL.Generar();
        InfoD.Generar();

        try {

            FileWriter DocumentoFinal = new FileWriter("Acta De Nacimiento " + this.NiñoL.getCurp() + ".txt");
            DocumentoFinal.write(
                    "                                           ESTADOS UNIDOS MEXICANOS                                           ");
            DocumentoFinal.write(
                    "\n                                       GOBIERNO DEL ESTADO DE SONORA                                        ");
            DocumentoFinal.write(
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");

            DocumentoFinal.write("Oficialia: ");
            DocumentoFinal.write(this.InfoD.getMunicipioR() + "\t");
            DocumentoFinal.write("Libro\t");
            DocumentoFinal.write(this.InfoD.getLibro() + "\t");
            DocumentoFinal.write("Numero De Acta: ");
            DocumentoFinal.write(this.InfoD.getActa() + "\t");
            DocumentoFinal.write("Fecha De Registro: ");
            DocumentoFinal.write(this.InfoD.getFechaR() + "\t");

            DocumentoFinal.write(
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

            DocumentoFinal.write("Localidad: ");
            DocumentoFinal.write(this.InfoD.getLocalidadR() + "\t");
            DocumentoFinal.write("Municipio: ");
            DocumentoFinal.write(this.InfoD.getMunicipioR() + "\t");
            DocumentoFinal.write("Entidad Federativa: ");
            DocumentoFinal.write(this.InfoD.getEstadoR() + "\t");
            DocumentoFinal.write(
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

            DocumentoFinal.write(
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            DocumentoFinal.write(
                    "\n                                              DATOS DEL REGISTRADO                                          ");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            if (Niño.getDosTutores() == true) {
                DocumentoFinal.write("\n|NOMBRE:                              " + this.NiñoL.getNombre() + " "
                        + this.NiñoL.getApellido1() + " " + this.NiñoL.getApellido2());
            } else {
                DocumentoFinal.write("\n|NOMBRE:                              " + this.NiñoL.getNombre() + " "
                        + this.NiñoL.getApellido1());
            }
            DocumentoFinal.write("\nFECHA DE NACIMIENTO: " + this.NiñoL.getFechaNaci());
            DocumentoFinal.write("\nREGISTRADO:  " + this.NiñoL.getRegistrado() + "                               "
                    + " Sexo: " + this.NiñoL.getSexo());
            DocumentoFinal.write("\nLUGAR DE NACIMIENTO" + this.NiñoL.getLocalidad() + " " + this.NiñoL.getMunipio()
                    + " " + this.NiñoL.getEstado() + " Mexico");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            DocumentoFinal.write(
                    "\n                                              DATOS DE LOS PADRES                                           ");
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
            DocumentoFinal.write("\n|NOMBRE DEL PADRE:                    " + this.Padre.getNombre() + " "
                    + this.Padre.getApellido1() + " " + this.Padre.getApellido2());
            DocumentoFinal.write("\nEdad:  " + this.Padre.getEdad() + "                Nacionalidad :   "
                    + this.Padre.getNacionalidad());
            DocumentoFinal.write("\n|NOMBRE DE LA MADRE:                    " + this.Padre.getNombre() + " "
                    + this.Padre.getApellido1() + " " + this.Padre.getApellido2());
            DocumentoFinal.write("\nEdad:  " + this.Madre.getEdad() + "                Nacionalidad :   "
                    + this.Madre.getNacionalidad());
            DocumentoFinal.write(
                    "\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");

            DocumentoFinal.close();
            System.out.println("Archivo generado correctamente");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
