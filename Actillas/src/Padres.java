import java.util.InputMismatchException;
import java.util.Scanner;

public class Padres {
    private String Nombre, Apellido1, Apellido2, Nacionalidad;
    private int Edad;
    Scanner SC1;

    // Constructor para cuando el padre tiene 2 apellidos
    public Padres(String Nombre, String Apellido1, String Apellido2, String Nacionalidad, int Edad) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
    }

    // Constructor para cuando el padre tiene solo un apellido
    public Padres(String Nombre, String Apellido1, String Nacionalidad, int Edad) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
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

    // Setters para los atributos
    public void setNombre() {
        Scanner SC1 = new Scanner(System.in);
        String nombre = SC1.nextLine();
        this.Nombre = nombre;
    }

    public void setApellido1() {
        SC1 = new Scanner(System.in);
        String ApellidoP = SC1.nextLine();
        this.Apellido1 = ApellidoP;
    }

    public void setApellido2() {
        SC1 = new Scanner(System.in);
        String ApellidoM = SC1.nextLine();
        this.Apellido2 = ApellidoM;
    }

    public void setNacionalidad() {
        SC1 = new Scanner(System.in);
        String nacionalidad = SC1.nextLine();
        this.Nacionalidad = nacionalidad;
    }

    public void setEdad(){
        do {
            try {
                 SC1 = new Scanner(System.in);
                 int edad = SC1.nextInt();
                 this.Edad = edad;
                 break;
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida, ingrese una edad expresada en enteros");
            }
        } while (true);
    }


}