package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * List
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        //var listaEnteros = new ArrayList<>();

        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(2,6); //agrega 6 entre 5 y 7

        System.out.println("La longitud de la lista es de : " + listaEnteros.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número a buscar: ");
        int buscar = sc.nextInt();

        if (!listaEnteros.isEmpty()){

            if (listaEnteros.contains(buscar) == true){
                System.out.println(buscar + " Si esta");
            } else {
                System.out.println(buscar + " No esta");
            }
    
            System.out.println("Introduzca un número que devuelva la posición: ");
            int buscar2 = sc.nextInt();
    
            /* 
                for (Integer entero: listaEnteros){
                    System.out.println(entero);
                }
            */
    
            for(int j = 0; j < listaEnteros.size(); j++){
                if (listaEnteros.get(j) == buscar2){
                    System.out.println(buscar2 + " esta en la posición: " + listaEnteros.indexOf(buscar2));
                }
            }

        } else {
            System.out.println("La lista esta vacia");
        }

        sc.close();
    }
}
