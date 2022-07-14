package co.edu.utp.misiontic2022.c2;

import java.util.HashMap;
import java.util.Map;

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
        m.put(700, "Cesar Vazquez");
        m.put(219, "Victor Tilla");
        m.put(537,"Alan Brito");
        m.put(923,"Maria Muñoz");

        System.out.println(m.get(921));
        System.out.println(m.get(920));
        System.out.println(m.get(537));
        System.out.println(m.get(923));


        System.out.println(m.entrySet());

        for(Map.Entry parejas: m.entrySet()){
            System.out.println(parejas);
        }
    }
}
