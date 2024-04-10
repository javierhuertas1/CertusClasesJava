public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona();

        persona1.modificarNombre("Rodrigo");
        System.out.println("El nombre de la persona es "+persona1.obtenerNombre());
        

        persona1.modificarEdad(24);
       System.out.println("La edad de la persona es "+persona1.obtenerEdad());
        
    }
}
