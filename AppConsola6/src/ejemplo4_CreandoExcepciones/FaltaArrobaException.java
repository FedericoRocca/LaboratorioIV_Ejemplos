package ejemplo4_CreandoExcepciones;

public class FaltaArrobaException extends Exception
{
    public FaltaArrobaException()
    {
        
    }

    @Override
    public String getMessage()
    {
        return "Falta colocar arroba";
    }
    
    
}
