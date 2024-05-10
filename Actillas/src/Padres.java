import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Padres implements Metodos {
    private String Nombre, Apellido1, Apellido2, Nacionalidad;
    private int Edad;
    public static Scanner SC1 = new Scanner(System.in);
    public static BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));
    private Boolean DosTutores;
    
    public Padres (){
    
    }
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

        public void Generar() throws IOException{
        
        System.out.println("----Bienvenido al generador de actas de nacimiento----");
        System.out.println("======================================================");
        System.out.println("----------Es usted un padre o madre solter@-----------");
        String Entrada = SC1.nextLine();
        if (Entrada.toLowerCase().contains("n") && Entrada.toLowerCase().contains("o")){
        Padres Padre = new Padres();
        System.out.println("Porfavor , ingrese los siguientes datos para continuar");
        System.out.println("Nombre del Padre: ");
        Padre.setNombre();
        System.out.println("Primer apellido del padre :");
        Padre.setApellido1();
        System.out.println("Segundo apellido del padre");
        Padre.setApellido2();
        System.out.println("Edad del padre: ");
        Padre.setEdad();
        System.out.println("Nacionalidad del padre: ");
        Padre.setNacionalidad();
        Padres Madre = new Padres();
        System.out.println("Nombre de la madre : ");
        Madre.setNombre();
        System.out.println("Primer apellido de la madre :");
        Madre.setApellido1();
        System.out.println("Segundo apellido de la madre");
        Madre.setApellido2();
        System.out.println("Edad de la madre : ");
        Madre.setEdad();
        System.out.println("Nacionalidad de la madre: ");
        Madre.setNacionalidad();
        }else{
            Padres Padre = new Padres();
            System.out.println("Porfavor , ingrese los siguientes datos para continuar");
            System.out.println("Nombre del Padre o madre : ");
            Padre.setNombre();
            System.out.println("Primer apellido del padre o madre :");
            Padre.setApellido1();
            System.out.println("Segundo apellido del padre o madre");
            Padre.setApellido2();
            System.out.println("Edad del padre o madre : ");
            Padre.setEdad();
            System.out.println("Nacionalidad del padre o madre: ");
            Padre.setNacionalidad();
        }
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

    public void setEdad()throws java.io.IOException{
        do {
            try {
                 this.Edad = Integer.parseInt(Leer.readLine());
                 break;
            }catch(NumberFormatException e){
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