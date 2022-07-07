package co.edu.utp.misiontic2022.c2;

/**
 * Enum
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( Color.BLANCO );

        Transporte tp;

        tp = Transporte.AVION;

        /* 
        if (tp == Transporte.BARCO)
            System.out.println("tp tiene el valor de BARCO");
        else
            System.out.println("tp tiene el valor de: " + tp);
        */
        
        // Enum se puede controlar por sentencia switch

        switch(tp){
            case COCHE:
                System.out.print("Un auto lleva personas");
                break;
            case CAMION:
                System.out.print("Un camión lleva carga");
                break;
            case AVION:
                System.out.print("Un avión vuela");
                break;
            case TREN:
                System.out.print("Un tren corre sobre rieles");
                break;
            default:
                System.out.print("Un barco navega en el agua");
        }

    }
}
