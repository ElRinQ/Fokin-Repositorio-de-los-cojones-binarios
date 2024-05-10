
public class App {
    public static void main(String[] args) throws Exception {

        Padres P1 = new Padres("Enrique", "Segura", "Romo", 32);
        Padres P2 = new Padres("Ana Alicia", "Gonzalez", "Mendoza", "Mexicana", 26);
        Niño N1 = new Niño();
        

        InfoDoc Nueva_Info = new InfoDoc();
        Acta_De_Nacimiento Actilla = new Acta_De_Nacimiento(N1);

        Doc ActillaFinal = new Doc();
        Actilla.Generar();
        System.out.println(N1.getCurp());

        
    }
}
