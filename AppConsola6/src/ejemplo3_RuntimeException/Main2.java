package ejemplo3_RuntimeException;

import javax.swing.JOptionPane;

public class Main2
{
    
    public static void main(String[] args)
    {
        try
        {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingres� el primer n�mero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingres� el segundo n�mero"));
            int result = num1 / num2;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Error, no se puede dividir por cero");
        }
        catch (NumberFormatException ex) 
        {
            System.out.println("Error, el n�mero ingresado no es correcto");
        }
        finally 
        {
            
        }
    }
    
}
