import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        String nombre = sc.nextLine();

        var resultado = saludo(nombre);
        System.out.println(resultado);
    }

    public static String  saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}
