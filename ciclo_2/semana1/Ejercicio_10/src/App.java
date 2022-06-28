import java.util.Scanner;

/*
 * Programa que lea dos variables enteras n y m y le quite a n sus m ultimas cifras
 * Por ejemplo, si n = 12345678 y m = 3 rl nuevo valor de n es 12345
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        /*
            int n;
            int m;
            int d;
        */

        int n, m, d;

        System.out.print("Por favor ingrese el numero n : ");
        n = sc.nextInt();

        System.out.print("Por favor ingrese el numero m : ");
        m = sc.nextInt();

        d = (int)Math.pow(10, m);
        n = n / d;
        System.out.println("Número modificado : " + n);

    }
}
