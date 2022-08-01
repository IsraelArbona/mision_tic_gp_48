package co.edu.utp.misiontic2022.c2;

import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        /*
        int numBytes = 0;
        char caracter;

        System.out.println("\nEscribe el texto: ");

        try {
            do {
                caracter = (char)System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.out.printf("%d bytes leidos %n", numBytes);
        } catch (Exception e) {
            System.err.println(e);
        }

        */



        /*
        byte[] buffer = new byte[255];
        System.out.println("\nEscriba el texto: ");

        try {
            System.in.read(buffer, 0 , 255);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("\nLa línea escrita es: ");
        System.out.println(buffer);
        System.out.println(new String(buffer));
        */

        /* 
        String linea = null;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);
        PrintWriter salida = new PrintWriter(System.out, true);

        salida.println("\nEscriba el texto: ");

        try {
            linea = entrada.readLine();
        } catch (Exception e) {
            System.err.println(e);
        }

        salida.println("\nLa línea escrita es: ");
        salida.println(linea);

        */


        /* 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.print("Sumando 1 : ");
            int s1 = Integer.parseInt(br.readLine());
            System.out.print("Sumando 2 : ");
            int s2 = Integer.parseInt(br.readLine());
            int suma = s1 + s2;
            System.out.println("La suma es " + s1 + " + " + s2 + " = " + suma);
        } catch (IOException e) {
            e.printStackTrace();
        }

        */


        // Notar que readLine() nos obliga a declarar IOException
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el lector

            System.out.println("Por favor ingrese su nombre"); // se pide el dato del usuario
            String nombre = br.readLine(); // Se lee el nombre con readLine() que retorna un String con el dato
   
            System.out.println("Bienvenid@ " + nombre + ". por favor ingrese su edad"); // se pide otro dato al usuario
            String edadString = br.readLine(); // se guarda la edad en la variables String "edad"

            // Nótese que readLine() siempre retorna String 
            // La clase BufferedReader no tiene metodo para leer enteros, entonces debemos convertirlo.
            int edad = Integer.parseInt(edadString);

            System.out.print("datos del usuario : " + nombre + " y su edad : " + edad);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
