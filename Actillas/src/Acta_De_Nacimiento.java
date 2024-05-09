
import java.util.Scanner;



public class Acta_De_Nacimiento implements Metodos {

    Niño Descendente;
    Padres Padre, Madre;
    InfoDoc Documentillo;

    public Acta_De_Nacimiento(Niño Registrado){
        this.Descendente = Registrado;
    }

    public Acta_De_Nacimiento(Niño Registrado, InfoDoc Info, Padres Papa, Padres Mama) {
        this.Descendente = Registrado;
        this.Documentillo = Info;
        this.Padre = Papa;
        this.Madre = Mama;
    }

    public Acta_De_Nacimiento(Niño Registrado, InfoDoc Info, Padres Soltero) {
        this.Descendente = Registrado;
        this.Documentillo = Info;
        this.Padre = Soltero;
    }

    @Override
    public void Generar() throws java.io.IOException{
        GenerarPadres();
        GenerarNiño();
    }

    public void GenerarNiño() throws java.io.IOException {
        
        Descendente.setNombre();
        Descendente.setApellidoP(Padre);
        Descendente.setApellidoM(Madre);
        Descendente.setFechaCum();
        Descendente.GeneraFechaNaci();
        System.out.println(Descendente.getFechaNaci());
        Descendente.setEstado();
        Descendente.setMunicipio();
        Descendente.setLocalidad();
        Descendente.setSexo();
        Descendente.setRegistro();
        Descendente.GenerarCurp();
    }

    public void GenerarPadres(){
        this.Padre = new Padres(null, null, null, 0);
        System.out.println("----Bienvenido al generador de actas de nacimiento----");
        System.out.println("======================================================");
        System.out.println("----------Es usted un padre o madre solter@-----------");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equalsIgnoreCase("no")){
        System.out.println("Porfavor , ingrese los siguientes datos para continuar");
        System.out.println("Nombre del Padre: ");
        Padre.setNombre();
        System.out.println("Primer apellido del padre:");
        Padre.setApellido1();
        System.out.println("Segundo apellido del padre");
        Padre.setApellido2();
        System.out.println("Edad del padre: ");
        Padre.setEdad();
        System.out.println("Nacionalidad del padre: ");
        Padre.setNacionalidad();
        this.Madre = new Padres(null, null, null, 0);
        System.out.println("Nombre de la madre: ");
        Madre.setNombre();
        System.out.println("Primer apellido de la madre:");
        Madre.setApellido1();
        System.out.println("Segundo apellido de la madre");
        Madre.setApellido2();
        System.out.println("Edad de la madre: ");
        Madre.setEdad();
        System.out.println("Nacionalidad de la madre: ");
        Madre.setNacionalidad();
        }else{
            System.out.println("Porfavor , ingrese los siguientes datos para continuar");
            System.out.println("Nombre del Padre o madre: ");
            Padre.setNombre();
            System.out.println("Primer apellido del padre o madre:");
            Padre.setApellido1();
            System.out.println("Segundo apellido del padre o madre");
            Padre.setApellido2();
            System.out.println("Edad del padre o madre: ");
            Padre.setEdad();
            System.out.println("Nacionalidad del padre o madre: ");
            Padre.setNacionalidad();
            this.Madre = new Padres(null, null, null, 0);
        }
    }

}
