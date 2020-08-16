package ejemplo2;

public class Juventus implements IEquipo
{
    private int cantidadJugadores;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Juventus [cantidadJugadores=" + cantidadJugadores + "]";
    }

    public Juventus()
    {
        super();
    }

    public Juventus(int cantidadJugadores)
    {
        super();
        this.cantidadJugadores = cantidadJugadores;
    }

    /**
     * @return the cantidadJugadores
     */
    public int getCantidadJugadores()
    {
        return cantidadJugadores;
    }

    /**
     * @param cantidadJugadores the cantidadJugadores to set
     */
    public void setCantidadJugadores(int cantidadJugadores)
    {
        this.cantidadJugadores = cantidadJugadores;
    }

    @Override
    public String devuelveInformacion()
    {
        return "Juventus...";
    }
}
