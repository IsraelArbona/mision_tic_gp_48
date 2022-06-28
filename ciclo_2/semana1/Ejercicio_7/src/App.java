import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        var a = 4;
        var b = (a == 4 ? a+5 : 6-a);
        // System.out.println("b: " + b);

        /*
            if (a == 4){
                b = a + 5;
            } else {
                b = 6 -a;
            }
        */

        var c = (a > 4 ? a*7 : a+8);
        // System.out.println("c: " + c);

        var sc = new Scanner(System.in);
        System.out.print("Ingrese el número entero: ");
        var numero = sc.nextInt();

        System.out.println(validarNumero(numero));

    }

    public static String validarNumero(int numero){
        return (numero%2 == 0 ? numero + " Es par" : numero + " es impar");
    }
    

}
