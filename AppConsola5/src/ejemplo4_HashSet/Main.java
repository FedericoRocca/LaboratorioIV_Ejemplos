package ejemplo4_HashSet;

import java.util.HashSet;

public class Main
{
    
    public static void main(String[] args)
    {
        Libro libro1 = new Libro("autor1", "titulo1", "isbn1"); 
        Libro libro2 = new Libro("autor2", "titulo2", "isbn2"); 
        Libro libro3 = new Libro("autor3", "titulo3", "isbn3"); 
        Libro libro4 = new Libro("autor4", "titulo4", "isbn4"); 
        Libro libro5 = new Libro("autor1", "titulo1", "isbn1"); 
        HashSet<Libro> listaLibros = new HashSet<Libro>();
        
        listaLibros.add(libro1);
        listaLibros.add(libro1);
        listaLibros.add(libro1);
        listaLibros.add(libro1);
        listaLibros.add(libro1);

        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        System.out.println("Listado de libros");
        for (Libro libro : listaLibros)
        {
            System.out.println(libro.toString());
        }
        
    }
    
}
