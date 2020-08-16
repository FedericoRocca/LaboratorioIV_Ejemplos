package ejemplo5_TreeSet;

public class Persona2 implements Comparable<Persona2>
{
    private String nombre;
    private String apellido;
    private int dni;
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
    /**
     * @return the dni
     */
    public int getDni()
    {
        return dni;
    }
    /**
     * @param dni the dni to set
     */
    public void setDni(int dni)
    {
        this.dni = dni;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
    }
    
    public Persona2()
    {
        super();
    }
    
    public Persona2(String nombre, String apellido, int dni)
    {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona2 other = (Persona2) obj;
        if (dni != other.dni)
            return false;
        return true;
    }
    @Override
    public int compareTo(Persona2 o)
    {
        if( o.dni == this.dni ) {
            return 0;
        }
        
        if( o.dni < this.dni )
        {
            return -1;
        }
        return 1;
    }
    
    
}
