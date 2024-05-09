import java.io.FileWriter;
import java.io.IOException;

public class Doc implements Metodos{

    Padres Padre,Madre;
    Niño Niño;
    InfoDoc Doc;
    InfoDoc[][] Documentillo;
    Niño[][] Datos;
    Actilla Acta = new Actilla(Niño);
    @Override
    public void Generar() throws IOException {
        

            try {
                this.Acta.Generar();
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
                    DocumentoFinal.write(Niño.getLocalidad());
                    DocumentoFinal.write(Niño.getMunipio());
                    DocumentoFinal.write(Niño.getEstado());
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                DocumentoFinal.write("\n                                              DATOS DEL REGISTRADO                                          ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE:                              " + Niño.getNombre() + " " + Niño.getApellido1() +" " + Niño.getApellido2());
                DocumentoFinal.write("\nFECHA DE NACIMIENTO:  " + Niño.getFechaNaci());
                DocumentoFinal.write("\nREGISTRADO:  " + Niño.getRegistrado() + "                               " +" Sexo: " + Niño.getSexo());
                DocumentoFinal.write("\nLUGAR DE NACIMIENTO" + Niño.getLocalidad() + " " + Niño.getMunipio() + " " + Niño.getEstado() + " Mexico"  );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");

                DocumentoFinal.write("\n                                              DATOS DE LOS PADRES                                           ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE DEL PADRE:                    " + Padre.getNombre() + " " + Padre.getApellido1() +" " + Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + Padre.getEdad() + "                Nacionalidad :   " + Padre.getNacionalidad() );
                DocumentoFinal.write("\n|NOMBRE DE LA MADRE:                    " + Padre.getNombre() + " " + Padre.getApellido1() +" " + Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + Madre.getEdad() + "                Nacionalidad :   " + Madre.getNacionalidad() );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                }

             catch (Exception e) {
            }
 
    }
}


