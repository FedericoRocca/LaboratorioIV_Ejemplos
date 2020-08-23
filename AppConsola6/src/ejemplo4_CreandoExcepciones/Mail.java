package ejemplo4_CreandoExcepciones;

public class Mail
{
    public Mail()
    {
        
    }
    
    public static boolean validarMail(String _mail) throws FaltaArrobaException, FaltaPuntoException
    {
        Boolean auxArroba = false;
        Boolean auxPunto = false;
        
        for (int i = 0; i < _mail.length(); i++)
        {
            if( _mail.charAt(i) == '@' )
            {
                auxArroba = true;
            }
            
            if( _mail.charAt(i) == '.' )
            {
                auxPunto = true;
            }
        }
        
        if( !auxArroba )
        {
            throw new FaltaArrobaException();
        }

        if( !auxPunto )
        {
            throw new FaltaPuntoException();
        }

        return true;
    }
}
