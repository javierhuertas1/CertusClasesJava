public class App {
    public static void main(String[] args) throws Exception {
/* 
        Persona persona1 = new Persona();

        persona1.setNombre("Rodrigo");
        System.out.println("El nombre de la persona es "+persona1.getNombre());
        

        persona1.setEdad(24);
       System.out.println("La edad de la persona es "+persona1.getEdad());
        
*/



            Persona persona1 = new Persona("Javier",15);
            Persona persona2 = new Persona();
            Persona persona3 = new Persona("Javier",15,784512478,985478965,"Direccion");

            System.out.println("El nombre de la persona es "+ persona1.getNombre());
            System.out.println("La edad de la persona es "+ persona1.getEdad());

            System.out.println("El nombre de la persona 3 es "+persona3.getNombre());
            System.out.println("El edad de la persona 3 es "+persona3.getEdad());
            System.out.println("El dni de la persona 3 es "+persona3.getDni());
            System.out.println("El numero celular de la persona 3 es "+persona3.getNumeroCelular());
            System.out.println("El direccion de la persona 3 es "+persona3.getDireccion());





    }
}
