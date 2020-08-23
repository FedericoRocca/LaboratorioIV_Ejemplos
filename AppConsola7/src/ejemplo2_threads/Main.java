package ejemplo2_threads;

public class Main
{
    
    public static void main(String[] args)
    {
        Mensaje msg1 = new Mensaje("Mensaje 1");
        Mensaje msg2 = new Mensaje("Mensaje 2");
        Mensaje msg3 = new Mensaje("Mensaje 3");
        
        Thread hilo1 = new Thread(msg1);
        Thread hilo2 = new Thread(msg2);
        Thread hilo3 = new Thread(msg3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
