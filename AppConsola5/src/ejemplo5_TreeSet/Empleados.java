package ejemplo5_TreeSet;

public class Empleados implements Comparable<Empleados>
{
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
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    @Override
    public int compareTo(Empleados o)
    {
        // TODO Auto-generated method stub
        return 0;
    }
}
