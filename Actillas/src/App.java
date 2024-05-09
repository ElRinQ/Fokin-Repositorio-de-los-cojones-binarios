
public class App {
    public static void main(String[] args) throws Exception {

        Padres P1 = new Padres("Enrique", "Segura", "Romo", 32);
        Padres P2 = new Padres("Ana Alicia", "Gonzalez", "Mendoza", "Mexicana", 26);
        Niño N1 = new Niño();
        Niño N2 = new Niño();

        InfoDoc Nueva_Info = new InfoDoc();
        Actilla Nueva_Acta_De_Nacimiento = new Actilla(N1);

        Doc Actilla = new Doc();
        Actilla.Generar();

        
    }
}
