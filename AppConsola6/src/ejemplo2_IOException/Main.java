package ejemplo2_IOException;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main
{
    
    public static void main(String[] args)
    {
            try
            {
                Image imagen = ImageIO.read( new File("src/imagen-gif") );
            }
            catch (IOException e)
            {
                System.out.println("No se pudo acceder a la imagen");
                e.printStackTrace();
            }
            finally 
            {
            }
    }
    
}
