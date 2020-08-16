package ejemplo2;

public class Barcelona implements IEquipo
{
    private String fechaInauguracion;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Barcelona [fechaInauguracion=" + fechaInauguracion + "]";
    }

    /**
     * @return the fechaInauguracion
     */
    public String getFechaInauguracion()
    {
        return fechaInauguracion;
    }

    /**
     * @param fechaInauguracion the fechaInauguracion to set
     */
    public void setFechaInauguracion(String fechaInauguracion)
    {
        this.fechaInauguracion = fechaInauguracion;
    }

    public Barcelona(String fechaInauguracion)
    {
        super();
        this.fechaInauguracion = fechaInauguracion;
    }

    public Barcelona()
    {
        super();
    }

    @Override
    public String devuelveInformacion()
    {
        return "Barcelona...";
    }
    
}
