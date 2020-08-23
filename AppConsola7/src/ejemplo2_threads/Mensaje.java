package ejemplo2_threads;

public class Mensaje implements Runnable
{
    private String text;

    public Mensaje()
    {
        super();
    }

    public Mensaje(String text)
    {
        super();
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public void run()
    {
        System.out.println("Iniciamos envio de mensajes");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Mensaje N° " + i);
        }
    }
}
