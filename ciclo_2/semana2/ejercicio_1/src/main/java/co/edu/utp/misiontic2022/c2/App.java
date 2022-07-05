package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MiPrimerClase mpc = new MiPrimerClase();
        MiPrimerClase mpc2 = new MiPrimerClase(50);
        MiPrimerClase mpc3 = new MiPrimerClase(10,20);

        mpc.incrementarContador(15);
        System.out.println("Valor del atributo contador : " + mpc.getContador());
        mpc2.setContador(20);
        System.out.println("valor del atributo es :" + mpc.getContador());

        System.out.println("mpc2 atributo : " + mpc2.getContador());
        mpc2.incrementarContador(50);
        System.out.println("mpc2 atributo es : " + mpc2.getContador());

        System.out.println("mpc3 atributo : " + mpc3.getContador());
        System.out.println("mpc3 atributos horas : "+ mpc3.getNumHoras() );

    }
}
