package co.edu.utp.misiontic2022.c2;

import java.util.HashMap;

/**
 * HashMap
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(920, "Carlos Diaz");
        m.put(923,"Antonio Lopez");

        System.out.println(m.entrySet());
    }
}
