import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Padres implements Metodos {
    public static Scanner SC1 = new Scanner(System.in);
    public static BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));

    private String Nombre, Apellido1, Apellido2, Nacionalidad;
    private int Edad;
    private boolean P1_IS_R = false;

    public void Generar() throws IOException {
        if (Niño.getDosTutores() == true) {

            if (P1_IS_R == false) {
                System.out.println("Nombre del Padre: ");
                this.setNombre();
                System.out.println("Primer apellido del padre :");
                this.setApellido1();
                System.out.println("Segundo apellido del padre");
                this.setApellido2();
                System.out.println("Edad del padre: ");
                this.setEdad();
                System.out.println("Nacionalidad del padre: ");
                this.setNacionalidad();
                Niño.setPadre1(this);
                P1_IS_R = true;
            } else {
                Niño.setPadre2(this);
                System.out.println("Nombre de la madre : ");
                this.setNombre();
                System.out.println("Primer apellido de la madre :");
                this.setApellido1();
                System.out.println("Segundo apellido de la madre");
                this.setApellido2();
                System.out.println("Edad de la madre : ");
                this.setEdad();
                System.out.println("Nacionalidad de la madre: ");
                this.setNacionalidad();
            }
        } else {
           
            System.out.println("Nombre del tutor: ");
            this.setNombre();
            System.out.println("Primer apellido del tutor: ");
            this.setApellido1();
            System.out.println("Segundo apellido del tutor: ");
            this.setApellido2();
            System.out.println("Edad del tutor: ");
            this.setEdad();
            System.out.println("Nacionalidad del tutor: ");
            this.setNacionalidad();
            Niño.setPadre1(this);
        }
    }

    public static void DeterminarNumTut() {
        System.out.println("----Bienvenido al generador de actas de nacimiento----");
        System.out.println("======================================================");
        System.out.println("----------Es usted un padre o madre solter@-----------");
        String Entrada = SC1.nextLine();
        if (Entrada.toLowerCase().contains("s") && Entrada.toLowerCase().contains("i")) {
            Niño.setDosTutores(false);
        } else {
            Niño.setDosTutores(true);
        }
        System.out.println("Porfavor , ingrese los siguientes datos para continuar");

    }

    // Setters para los atributos
    public void setNombre() {
        String nombre = SC1.nextLine();
        this.Nombre = nombre;
    }

    public void setApellido1() {
        String ApellidoP = SC1.nextLine();
        this.Apellido1 = ApellidoP;
    }

    public void setApellido2() {
        String ApellidoM = SC1.nextLine();
        this.Apellido2 = ApellidoM;
    }

    public void setNacionalidad() {
        String nacionalidad = SC1.nextLine();
        this.Nacionalidad = nacionalidad;
    }

    public void setEdad() throws java.io.IOException {
        do {
            try {
                this.Edad = Integer.parseInt(Leer.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida, ingrese una edad expresada en enteros");
            }
        } while (true);
    }

    // Getters para los atributos
    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

}