
public class App {
    public static void main(String[] args) throws Exception {

Padres P1 = new Padres("Andres", "Segura","Gonzalez", "Mexicana", 32);
Padres P2 = new Padres("Veronica", "Ocaño", "Marin", "Mexicana", 26);
Padres P3 = new Padres("Luis","Mendez","Salazar","Mexicana", 54);
Padres P4 = new Padres("Liliana","Quiroga","Crecer","",24);
Niño N1 = new Niño(P1,P2, "Noe", "Hermosillo", "Hermosillo", "Sonora", 'H', true, 11, 8, 2005);
Niño N2 = new Niño(P3, P4, "Jorge", "Hermosillo", "Hermosillo", "Sonora", 'H', true, 11, 10, 2004);
N1.GenerarCurp(N1);

N2.GenerarCurp(N2);



}
}