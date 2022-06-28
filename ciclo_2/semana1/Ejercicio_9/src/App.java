public class App {
    public static void main(String[] args) throws Exception {
        
        String palabra = "          EstoesunaCadenaDeCaracteres       ";
        var longitud = 0;

        longitud = palabra.length();

        System.out.println("La longitud de la cadena es : " + longitud);
        System.out.println("Indice de caracter t: " + palabra.indexOf('t'));
        System.out.println("Posición de caracter '2': " + palabra.charAt(2));

        System.out.println("Devolver la sub-cadena desde la posición 1 hasta 6: " + palabra.substring(1, 6));
        System.out.println("Devolver la cadena convertida en mayúsculas: " + palabra.toUpperCase());
        System.out.println("Devolver la cadena convertida en minúscula: " + palabra.toLowerCase());

        System.out.println("Elimina espacion a inicio y final: " + palabra.trim());
    }
}
