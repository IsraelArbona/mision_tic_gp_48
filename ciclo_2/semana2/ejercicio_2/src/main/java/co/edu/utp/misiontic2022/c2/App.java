package co.edu.utp.misiontic2022.c2;

/**
 * Interfases
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DeDos deDos = new DeDos();

        for(int i = 0; i < 5; i++)
            System.out.println("El siguiente valor es " + deDos.getSiguiente());
            System.out.println("El valor anterior a " + deDos.getSiguiente() + " es " + deDos.getAnterior());
        
        System.out.println("\nReiniciar....");
        deDos.reiniciar();

        for(int i = 0; i < 5; i++)
            System.out.println("El siguiente valor es " + deDos.getSiguiente());
            System.out.println("El valor anterior a " + deDos.getSiguiente() + " es " + deDos.getAnterior());
            System.out.println("\nIniciamos en 1000....");

        deDos.setComenzar(1000);
        for(int i = 0; i < 5; i++)
            System.out.println("El siguiente valor es " + deDos.getSiguiente());
            System.out.println("El valor anterior a " + deDos.getSiguiente() + " es " + deDos.getAnterior());
          
    }
}
