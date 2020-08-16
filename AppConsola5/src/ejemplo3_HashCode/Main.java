package ejemplo3_HashCode;

import ejemplo1_Equals.Persona;

public class Main
{
    
    public static void main(String[] args)
    {
        String nombre="Pepe";
        String nombre2="Pepe";
        System.out.println(nombre.hashCode());
        System.out.println(nombre2.hashCode());
        
        Persona persona1 = new Persona();
        Persona persona2  = new Persona();
        
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        
        persona1.setApellido("apellido");
        persona1.setDni("dni");
        persona1.setNombre("nombre");
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
    }
}
