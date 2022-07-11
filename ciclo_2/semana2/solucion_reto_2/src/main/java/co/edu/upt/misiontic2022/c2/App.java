package co.edu.upt.misiontic2022.c2;

/**
 * Solución reto 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            Computadores computadores = new Computadores();
            System.out.println(computadores.calcularPrecio());
            ComputadoresMesa computadoresMesa = new ComputadoresMesa();
            System.out.println(computadoresMesa.calcularPrecio());
            ComputadoresPortatiles computadoresPortatiles = new ComputadoresPortatiles();
            System.out.println(computadoresPortatiles.calcularPrecio());
        */

        Computadores computadores[] = new Computadores[6];
        computadores[0] = new Computadores(150.0, 70, 'A');
        computadores[1] = new ComputadoresMesa(70.0, 40);
        computadores[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false);
        computadores[3] = new Computadores();
        computadores[4] = new Computadores(500.0, 60, 'A');
        computadores[5] = new Computadores(700.0, 50, 'D');
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();

        Computadores computadores2[] = new Computadores[4];
        computadores2[0] = new Computadores(60.0, 10, 'D');
        computadores2[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores2[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
        computadores2[3] = new Computadores(50.0, 10);
        PrecioTotal solucion2 = new PrecioTotal(computadores2);
        solucion2.mostrarTotales();
        System.out.println();





    }
}
