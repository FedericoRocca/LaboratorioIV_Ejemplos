package ejemplo1;

public class Main
{
    
    public static void main(String[] args)
    {
        Cantante cantor = new Cantante("nombreCantante", "apellidoCantante", true);
        Pajaro pajarito = new Pajaro(10);
        
        cantor.cantar();
        pajarito.cantar();
                
    }
    
}
