import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número entero: ");
        var numero = sc.nextInt();

        var digitos = numeroDigito(numero);
        System.out.println("El número tiene : " + digitos + " cifras");
    }

    public static int numeroDigito(int numero){
        var cifras = 0;

        while (numero != 0){
            // numero = numero / 10;
            numero /= 10;

            // cifras = cifras + 1;
            cifras++;
        }

        return cifras;
    }
}
