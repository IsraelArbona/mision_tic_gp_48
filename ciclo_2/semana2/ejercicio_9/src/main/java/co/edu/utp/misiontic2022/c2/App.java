package co.edu.utp.misiontic2022.c2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * try
 * catch
 * finally
 * throws
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        /*
            try {
                System.out.println("Intentamos ejecutar el bloque de instrucciones");
                System.out.println("Instruccion 1.");
                System.out.println("Instruccion 2.");
                
            } catch (Exception e) {
                System.out.println("Se produjo un error");
            } finally{
                System.out.println("Instruccion a ejecutar final se produce ya sea por el error o no");
            }
        */

        /* 
            int[] array = new int[20];

            try{
                array[-2] = 48;
                int b = 0;
                int a = 48/b;
            } catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){
                System.out.println("Error inesperado: " + ex.getMessage());
            }
        */

        /* 
            Scanner sc = new Scanner(System.in);
            int numero;
            try {
                System.out.println("Ingrese el numero entero");
                numero = sc.nextInt();
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            } catch (InputMismatchException e) {
                System.out.print("Debe ingresar obligatoriamente un numero");
            }
        */

        Matematicas matematicas = new Matematicas();
        double resultado = matematicas.dividir(24.0,0.0);
        System.out.println("El resultado es: " + resultado);




        
    }
}
