package co.edu.utp.misiontic2022.c2;

import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ficheros
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        var f = new File("prueba.txt");

        System.out.println("pathSeparator : " + File.pathSeparator );
        System.out.println("separator : " + File.separator);
        System.out.println("separatorChar : " + File.separator);

        try {
            System.out.println("canRead : " + f.canRead());
            System.out.println("canWrite : " + f.canWrite());
            System.out.println("exists : " + f.exists());
            System.out.println("getName : " + f.getName());

            System.out.println("getParent : " + f.getParent());
            System.out.println("isDirecty : " + f.isDirectory());
            System.out.println("isFile : " + f.isFile());
            System.out.println("length : " + f.length());

        } catch (Exception e) {
            System.out.println(e);
        }

        */


        
        try {
            File archivo = new File("Numeros.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Errores encontrados del fichero : ");
            e.printStackTrace();
        }

    


        /* 

        // El siguiente ejemplo abre un archivo de registro. Si no existe el archivo se crea.
        // Si el archivo existe, se abre para agregar datos.

        // Convertir un String a byte array
        String s = "Grupo 48";
        byte datos[] = s.getBytes();

        Path p = Paths.get("./prueba_2.txt");

        // Un archivo bytes a bytes desde el BufferedOutputStream quien los convierte de caracteres a bytes
        try (OutputStream out = new BufferedOutputStream(
            // anexar a un archivo existente, crear un archivo si no existe inicialmente
            Files.newOutputStream(p,CREATE,APPEND))){
                out.write(datos,0 ,datos.length);
                System.out.print("Archivo Creado");
        } catch (Exception e) {
            System.err.println(e);
        }

        */



        
        int[][] numeros = { 
            { 1, 2, 3, 4, 5},
            { 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        try {
            File numArchivo = new File("Numeros.txt");
            PrintWriter salida = new PrintWriter(numArchivo);

            for(int i = 0; i < numeros.length; i++){
                for(int j = 0; j < numeros[i].length; j++){
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }

            System.out.println("Archivo escrito.");
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }








    }
}
