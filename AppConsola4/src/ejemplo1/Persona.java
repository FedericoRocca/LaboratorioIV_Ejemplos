package ejemplo1;

public class Persona
{
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }
    private String nombre;
    private String apellido;
    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    /**
     * @return the apellido
     */
    public String getApellido()
    {
        return apellido;
    }
    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido)
    {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
