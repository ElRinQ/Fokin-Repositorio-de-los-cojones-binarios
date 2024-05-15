import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {


        Doc Actilla = new Doc();
        Actilla.Generar();
        String NombreDelArchivo = Actilla.GetNombreDelActa();

        try {
            BufferedReader Lector = new BufferedReader(new FileReader(NombreDelArchivo));
            String LineaDelDocu;
            while ((LineaDelDocu = Lector.readLine())!= null ){
                System.out.println(LineaDelDocu);
            }
        } catch (Exception e) {
        }
        System.out.println();
    }
}
