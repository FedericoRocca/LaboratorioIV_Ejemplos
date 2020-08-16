package ejemplo5_TreeSet;

import java.util.TreeSet;

public class Main
{
    
    public static void main(String[] args)
    {
        TreeSet<Persona2> listaPersonas = new TreeSet<Persona2>();
        
        Persona2 persona1 = new Persona2("nombre1", "apellido1", 11111111 );
        Persona2 persona2 = new Persona2("nombre2", "apellido2", 22222222 );
        Persona2 persona3 = new Persona2("nombre3", "apellido3", 33333333 );
        Persona2 persona4 = new Persona2("nombre4", "apellido4", 44444444 );
        Persona2 persona5 = new Persona2("nombre1", "apellido5", 11111111 );
        
        listaPersonas.add(persona1);
        listaPersonas.add(persona1);
        listaPersonas.add(persona1);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        
        for (Persona2 persona22 : listaPersonas)
        {
            System.out.println(persona22.toString());
        }
        
        TreeSet<Empleados> listaEmpleados = new TreeSet<Empleados>();
        listaEmpleados.add(new Empleados());
    }
    
}
