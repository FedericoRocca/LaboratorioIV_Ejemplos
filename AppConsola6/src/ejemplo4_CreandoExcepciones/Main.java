package ejemplo4_CreandoExcepciones;

import javax.swing.JOptionPane;

public class Main
{
    
    public static void main(String[] args)
    {
        String correo = JOptionPane.showInputDialog( "Ingrese correo electrónico: " );
        try
        {
            Mail.validarMail(correo);
        }
        catch (Exception e)
        {
            System.out.println("Se produjo un error");
            e.printStackTrace();
        }
    }
    
}
