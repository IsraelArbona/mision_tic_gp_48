package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

/**
 * Clases abstracta
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
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
        */

        /*
            // declarar variables
            String colorTriangulo;
            double baseTriangulo;
            double alturaTriangulo;

            // Se instancia de la clase "Scanner"
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca el color del triángulo: ");
            colorTriangulo = sc.nextLine();
            System.out.print("Introduzca la base del triángulo: ");
            baseTriangulo = sc.nextDouble();
            System.out.print("Introduzca la altura del triángulo: ");
            alturaTriangulo = sc.nextDouble();

            Triangulo triangulo = new Triangulo(colorTriangulo, baseTriangulo, alturaTriangulo);
            System.out.printf("El área del triángulo %s es: %f", triangulo.getColor(), triangulo.carcularArea());
            sc.close();
        */

        // declarar variables
        String colorCuadrado;
        double ladoCuadrado;

        // Se instancia a la clase "Scanner"
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Introduzca el color del cuadrado: ");
        colorCuadrado = sc2.nextLine();
        System.out.print("Introduzca el lado del cuadrado: ");
        ladoCuadrado = sc2.nextDouble();

        Cuadrado cuadrado = new Cuadrado(colorCuadrado, ladoCuadrado);
        System.out.printf("El área del cuadrado %s es: %f",cuadrado.getColor(),cuadrado.carcularArea());
        sc2.close();

    }
}
