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
        
        System.out.println("Escribimos el archivo por lineas");
        file.writeByLine("Linea 1\n");
        file.writeByLine("Linea 2\n");
        file.writeByLine("Linea 3\n");
        
        System.out.println("Leemos el archivo por lineas");
        file.readByLine();
    }
    
}
