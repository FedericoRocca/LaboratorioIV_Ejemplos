package ejemplo1;

public class Main
{
    
    public static void main(String[] args)
    {
        Archivo file = new Archivo();
        file.setPath("prueba.txt");
        if( file.fileExists() )
        {
            System.out.println("El archivo existe en el path: " + file.getPath());
        }
        else
        {
            System.out.println("El archivo " + file.getPath() + " no existe.");
            System.out.println("Lo creamos...");
            file.fileCreate();
        }
        
        System.out.println("Escribimos el archivo caracter por caracter");
        file.writeByChars("Creamos el archivo y escribimos caracter por caracter");
        
        System.out.println("Leemos el archivo caracter por caracter");
        file.readFileByChars();
    }
    
}
