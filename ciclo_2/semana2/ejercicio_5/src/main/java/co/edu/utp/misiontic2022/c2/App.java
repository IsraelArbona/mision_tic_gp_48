package co.edu.utp.misiontic2022.c2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set
 *
 */
public class App 
{
    private String colores[] = {"rojo","blanco","azul","verde","gris","blanco","naranja","gris"};

    public App(){
        List<String> lista = Arrays.asList(colores);
        System.out.println("ArrayList : \n" + lista );
        imprimirSinDuplicar(lista);
    }

    private void imprimirSinDuplicar(Collection<String> coleccion){
        Set<String> conjunto = new HashSet<String>(coleccion);
        System.out.println("\n Los valores sin duplicar son: ");

        for(String string: conjunto){
            System.out.println(string);
        }
    } 

    public static void main( String[] args )
    {

        Set<Integer> conjuntoEntero = new HashSet<>();

        conjuntoEntero.add(4);
        conjuntoEntero.add(5);
        conjuntoEntero.add(7);
        conjuntoEntero.add(4); // no acepta duplicados
        conjuntoEntero.add(2);

        /*
            for(Integer entero: conjuntoEntero){
                System.out.println("Conjunto: " + entero);
            }
        */

        new App();
    }
}
