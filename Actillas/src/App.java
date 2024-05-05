
public class App {
    public static void main(String[] args) throws Exception {
Padres P1 = new Padres("Andres", "Segura","Gonzalez", "Mexicana", 32);
Padres P2 = new Padres("Veronica", "Ocaño", "Marin", "Mexicana", 26);
Niño N1 = new Niño(P1,P2, "Noe", "Hermosillo", "Hermosillo", "Sonora", 'H', true, 11, 8, 2005);
N1.GenerarCurp(N1);
}
}