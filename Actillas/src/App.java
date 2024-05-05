

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
Padres P1 = new Padres("Andres", "Segura","Gonzalez", "Mexicana", 32);
Padres P2 = new Padres("Veronica", "Ocaño", "Marin", "Mexicana", 26);
Niño N1 = new Niño(P1,P2, "Noe", "Hermosillo", "Hermosillo", "Sonora", "H", true, 11, "Agosto", 2005);
System.out.println(N1.getCurp());
}
}