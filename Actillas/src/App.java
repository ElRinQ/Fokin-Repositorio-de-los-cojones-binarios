
public class App {
    public static void main(String[] args) throws Exception {

       
        Niño N1 = new Niño();
        

        InfoDoc Nueva_Info = new InfoDoc();
        Doc Actilla = new Doc();

        Doc ActillaFinal = new Doc();
        Actilla.Generar();
        System.out.println(N1.getCurp());

        
    }
}
