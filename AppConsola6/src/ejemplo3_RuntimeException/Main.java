package ejemplo3_RuntimeException;

public class Main
{
    
    public static void main(String[] args)
    {
        int [] vector = new int[5];
        
        try
        {
            vector[0] = 0;
            vector[1] = 5;
            vector[2] = 10;
            vector[3] = 15;
            vector[4] = 20;
            vector[5] = 20;
            
            
            
        }
        catch (Exception e)
        {
            System.out.println("Se produjo una excepción: ");
            e.printStackTrace();
        }
        
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Números: " + vector[i]);
        }
        
    }
    
}
