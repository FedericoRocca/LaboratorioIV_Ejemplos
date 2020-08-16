package ejemplo1_Equals;

public class Main
{
    
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.setApellido("apellido");
        persona1.setDni("dni");
        persona1.setNombre("nombre");
        
        persona2.setApellido("apellido");
        persona2.setDni("dni");
        persona2.setNombre("nombre");
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
        // Se comparan direcciones de memória
        // if( persona1 == persona2 )
        
        // El equals se tiene que sobrecargar para comparar los valores de las propiedades de los objetos
        if( persona1.equals(persona2)) 
        {
            System.out.println("Las personas son iguales.");
        }
        else
        {
            System.out.println("Las personas son distintas.");
        }
    }
    
}
