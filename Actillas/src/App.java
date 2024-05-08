
public class App {
    public static void main(String[] args) throws Exception {


Padres P1 = new Padres("Enrique", "Segura", "Romo", 32);
Padres P2 = new Padres("Ana Alicia", "Gonzalez", "Mendoza", "Mexicana", 26);
Niño N1 = new Niño();
Niño N2 = new Niño(P1, P2, "Andres", "Hermosillo", "Hermosillo", "Sonora", 'H', true, 10, 11, 1976);


Acta_De_Nacimiento Nueva_Acta_De_Nacimiento = new Acta_De_Nacimiento(N1);

Nueva_Acta_De_Nacimiento.Generar();

N1.GenerarCurp();

System.out.println(N1);
System.out.println(N2);
System.out.println(N1.getCurp());
}
}

