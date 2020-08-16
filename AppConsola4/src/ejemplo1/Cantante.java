package ejemplo1;

public class Cantante extends Persona implements ICantar
{
    private boolean estudios;

    /**
     * @return the estudios
     */
    public boolean isEstudios()
    {
        return estudios;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setEstudios(boolean estudios)
    {
        this.estudios = estudios;
    }

    public Cantante(String nombre, String apellido, boolean estudios)
    {
        super(nombre, apellido);
        this.estudios = estudios;
    }

    @Override
    public void cantar()
    {
        System.out.println("cantante canta");
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Cantante [estudios=" + estudios + "]";
    }
    
    
}
