import java.io.FileWriter;
import java.io.IOException;

public class Doc implements Metodos{

    Padres Padre = new Padres();
    Padres Madre = new Padres();
    Niño NiñoL = new Niño();
    InfoDoc InfoD = new InfoDoc();

    InfoDoc[][] Documentillo =  new InfoDoc[4][6];
    Niño[][] Datos =  new Niño[7][7];
    
    @Override
    public void Generar() throws IOException {
            Padre.Generar(); 
            NiñoL.Generar();
            InfoD.Generar();
        
            try {

                FileWriter DocumentoFinal= new FileWriter("Acta De Nacimiento "+this.NiñoL.getCurp()+".txt");
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
                    DocumentoFinal.write(this.InfoD.getLibro() + "\t");
                    DocumentoFinal.write(this.InfoD.getActa() + "\t");
                    DocumentoFinal.write(this.InfoD.getFechaR() + "\t");
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
                    DocumentoFinal.write(this.NiñoL.getLocalidad());
                    DocumentoFinal.write(this.NiñoL.getMunipio());
                    DocumentoFinal.write(this.NiñoL.getEstado());
                    DocumentoFinal.write("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                DocumentoFinal.write("\n                                              DATOS DEL REGISTRADO                                          ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE:                              " + this.NiñoL.getNombre() + " " + this.NiñoL.getApellido1() +" " + this.NiñoL.getApellido2());
                DocumentoFinal.write("\nFECHA DE NACIMIENTO:  " + this.NiñoL.getFechaNaci());
                DocumentoFinal.write("\nREGISTRADO:  " + this.NiñoL.getRegistrado() + "                               " +" Sexo: " + this.NiñoL.getSexo());
                DocumentoFinal.write("\nLUGAR DE NACIMIENTO" + this.NiñoL.getLocalidad() + " " + this.NiñoL.getMunipio() + " " + this.NiñoL.getEstado() + " Mexico"  );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");

                DocumentoFinal.write("\n                                              DATOS DE LOS PADRES                                           ");
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                DocumentoFinal.write("\n|NOMBRE DEL PADRE:                    " + this.Padre.getNombre() + " " + this.Padre.getApellido1() +" " + this.Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + this.Padre.getEdad() + "                Nacionalidad :   " + this.Padre.getNacionalidad() );
                DocumentoFinal.write("\n|NOMBRE DE LA MADRE:                    " + this.Padre.getNombre() + " " + this.Padre.getApellido1() +" " + this.Padre.getApellido2());
                DocumentoFinal.write("\nEdad:  " + this.Madre.getEdad() + "                Nacionalidad :   " + this.Madre.getNacionalidad() );
                DocumentoFinal.write("\n|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
                
                DocumentoFinal.close();
                System.out.println("Archivo generado correctamente");
                }

             catch (Exception e) {
                e.printStackTrace();
            }
 
    }
}


