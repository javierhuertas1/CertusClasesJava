public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private int numeroCelular;
    private String direccion;

    public Persona(String nombre , int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        
    }

    public Persona(String nombre , int edad , int dni , int numeroCelular , String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni ;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getNumeroCelular() {
        return numeroCelular;
    }
    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

}
