package comboBox2;

public class Categorias
{
    private int id;
    private String nombre;
    public Categorias()
    {
        super();
    }
    public Categorias(int id, String nombre)
    {
        super();
        this.id = id;
        this.nombre = nombre;
    }
    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }
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
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return nombre;
    } 
}
