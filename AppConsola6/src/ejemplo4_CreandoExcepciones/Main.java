package ejemplo4_CreandoExcepciones;

import javax.swing.JOptionPane;

public class Main
{
    
    public static void main(String[] args)
    {
        String correo = JOptionPane.showInputDialog( "Ingrese correo electr�nico: " );
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
