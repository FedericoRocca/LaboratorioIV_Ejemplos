package ejemplo2;

public class Main
{
    
    public static void main(String[] args)
    {
        Messi messi = new Messi();
        Barcelona barcelona = new Barcelona();
        barcelona.setFechaInauguracion("01/01/89");
        messi.setEquipo(barcelona);
        messi.setNacionalidad("Argentina");
        Juventus juventus = new Juventus();
        System.out.println(messi.toString());
        
        messi.setEquipo(juventus);
        System.out.println(messi.toString());
    }
    
}
