package co.edu.utp.misiontic2022.c2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Objetos Serializable
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 
        File nombreObj = new File("Objeto.dat");

        try {
            FileOutputStream archivo = new FileOutputStream(nombreObj);
            ObjectOutputStream oos = new ObjectOutputStream(archivo);
            oos.writeObject(new Persona("348374343", "Maria", "Lopez"));
            oos.writeObject(new Persona("4034585", "Wilson", "Diaz"));
            System.out.println("Archivo escrito.");
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        */

        File nombreObj = new File("Objeto.dat");

        try {
            FileInputStream archivo = new FileInputStream(nombreObj);
            ObjectInputStream ois = new ObjectInputStream(archivo);

            Persona p1 = (Persona) ois.readObject();
            Persona p2 = (Persona) ois.readObject();
            ois.close();

            System.out.println("Cedula\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());

        } catch (FileNotFoundException e){
            System.out.println("El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
