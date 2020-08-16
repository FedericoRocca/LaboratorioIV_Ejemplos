package ejemplo2;

public class Messi
{
    private String nacionalidad;
    private IEquipo equipo;

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

    public Messi(String nacionalidad, IEquipo _equipo)
    {
        super();
        this.nacionalidad = nacionalidad;
        equipo = _equipo;
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
        return "Messi [nacionalidad=" + nacionalidad + ", "+ equipo.toString() + "]";
    }

    /**
     * @return the barcelona
     */
    public IEquipo getEquipo()
    {
        return equipo;
    }

    /**
     * @param barcelona the barcelona to set
     */
    public void setEquipo(IEquipo _equipo)
    {
        this.equipo = _equipo;
    }
    
}
