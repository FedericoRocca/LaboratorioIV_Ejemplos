package ejemplo1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.KeyStore.PrivateKeyEntry;

public class Archivo
{
    private String path;
    
    public Boolean fileExists()
    {
        File file = new File(path);
        return file.exists();
    }
    
    public Boolean fileCreate()
    {
        FileWriter file;
        try
        {
            file = new FileWriter(path, true);
            file.write("");
            file.close();
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Se produjo una excepción al crear el archivo:");
            e.printStackTrace();
        }
        return false;
    }
    
    public void writeByChars(String toWrite)
    {
        try
        {
            FileWriter file = new FileWriter(path, true);
            for (int i = 0; i < toWrite.length(); i++)
            {
                file.write(toWrite.charAt(i));
            }
            //Se pueden escribir tanto caracteres o números
            //file.write("a");
            //file.write(33);
            //Como Strings
            //file.write(toWrite);
            file.close();
        }
        catch (Exception e)
        {
            System.out.println("Se produjo una excepción al escribir el archivo: ");
            e.printStackTrace();
        }
    }

    public void readFileByChars()
    {
        try
        {
            FileReader file = new FileReader(path);
            int c = file.read();
            while( c != -1 )
            {
                char _char = (char)c;
                System.out.print(_char);
                c = file.read();
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println("Se produjo una excepción al leer el archivo: ");
            e.printStackTrace();
        }
    }
    
    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }
}
