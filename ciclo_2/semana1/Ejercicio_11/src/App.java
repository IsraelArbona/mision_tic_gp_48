import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano, numSuerte,sumFecha, cf1, cf2, cf3, cf4;

        System.out.println("Por favor introduzca su fecha de nacimiento");
        System.out.print("dia: ");
        dia = sc.nextInt();

        System.out.print("mes: ");
        mes = sc.nextInt();

        System.out.print("año: ");
        ano = sc.nextInt();

        sumFecha = dia + mes + ano;

        cf1 = sumFecha / 1000;           // Obtener la primera cifra
        cf2 = sumFecha / 100 % 10;       // Obtener la segunda cifra
        cf3 = sumFecha / 10 % 10;        // Obtener la tercera cifra
        cf4 = sumFecha % 10;             // Obtener la cuarta cifra

        numSuerte = cf1 + cf2 + cf3 + cf4;

        System.out.println("Su número de la suerte es: " + numSuerte);
    }
}
