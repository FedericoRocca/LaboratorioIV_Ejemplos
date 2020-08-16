package ejemplo1;

public class Pajaro implements ICantar
{
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Pajaro [edad=" + edad + "]";
    }

    private int edad;

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int _edad)
    {
        edad = _edad;
    }

    public Pajaro(int _edad)
    {
        super();
        edad = _edad;
    }

    public Pajaro()
    {
        super();
    }

    @Override
    public void cantar()
    {
        System.out.println("pajaro canta");
    }
    
    
}