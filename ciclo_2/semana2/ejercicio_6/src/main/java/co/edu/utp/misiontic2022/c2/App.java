package co.edu.utp.misiontic2022.c2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Colas en java Queue: 
 * 
 * Para insertar:
 * - add(e)
 * - offer(e)
 *
 * Para extraer
 * - remove()
 * - poll()
 * 
 * para consultar el frente:
 * - element()
 * - peek()
 */
public class App 
{
    public static void main( String[] args )
    {
        // crear la Cola indicando el tipo de dato
        Queue<Integer> cola = new LinkedList<>();

        cola.offer(3);  // insertamos un elemento (mejor método)
        cola.add(14);   // insertamos un elemento (lanza excepciones)
        cola.offer(12);
        cola.add(7);
        cola.offer(10);

        System.out.println("Cola llena : " + cola);

        // Estructura repetitiva para desencolar
        
        while(cola.poll() != null){             // recuperar el primer elemento, si es null = vacio
            System.out.println(cola.peek());    // muestra el primer elemento de la cola
        }
        
        // Muesta null debido a que ya esta vacia
        System.out.print(cola.peek());
    }
}
