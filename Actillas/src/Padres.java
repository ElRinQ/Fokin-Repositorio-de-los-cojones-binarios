public class Padres{
    private String Nombre, Apellido1, Apellido2, Nacionalidad;
    private int Edad;

//Constructor para cuando el padre tiene 2 apellidos    
public Padres(String Nombre, String Apellido1, String Apellido2,String Nacionalidad , int Edad){
    this.Nombre = Nombre;
    this.Apellido1 = Apellido1;
    this.Apellido2 = Apellido2;
    this.Nacionalidad = Nacionalidad;
    this.Edad = Edad; 
}

//Constructor para cuando el padre tiene solo un apellido
public Padres(String Nombre, String Apellido1, String Nacionalidad,int Edad ){
    this.Nombre = Nombre;
    this.Apellido1 = Apellido1;
    this.Nacionalidad = Nacionalidad;
    this.Edad = Edad;
}

//Getters para los atributos
public String getNombre(){
    return Nombre;
}

public String getApellido1(){
    return Apellido1;
}

public String getApellido2(){
    return Apellido2;
}

public String getNacionalidad(){
    return Nacionalidad;
}

public int getEdad(){
    return Edad;
}

//Setters para los atributos 
public void setNombre(String Nombre){
    this.Nombre = Nombre;
}

public void setApellido1(String Apellido1){
    this.Apellido1 = Apellido1;
}

public void setApellido2 (String Apellido2){
    this.Apellido2 = Apellido2;
}

public void setNacionalidad (String Nacionalidad){
    this.Nacionalidad = Nacionalidad;
}

public void setEdad(int Edad){
    this.Edad = Edad;
}
}