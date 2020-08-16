package ejemplo2;

public class Messi
{
    private String nacionalidad;
    private Barcelona barcelona;

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad()
    {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }

    public Messi(String nacionalidad)
    {
        super();
        this.nacionalidad = nacionalidad;
    }

    public Messi()
    {
        super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Messi [nacionalidad=" + nacionalidad + "]";
    }
    
}
