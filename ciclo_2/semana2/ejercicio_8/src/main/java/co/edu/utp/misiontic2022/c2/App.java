package co.edu.utp.misiontic2022.c2;

/**
 * Clases Genericas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crea una referencia de la clase Gen para Integers
        Gen<Integer> iOb;

        // asigna su referencia iOb
        // encapsulando el valor 48 dentro de un objeto Integer
        iOb = new Gen<Integer>(48);

        // Mostrar el tipo de dato utilizado por el iOb
        iOb.mostrarTipo();

        // obtener el valor de iOb
        // Que no se necesita realizar conversión
        int v = iOb.getOb();
        System.out.println("valor: " + v);

        // crear un objeto Gen de tipo String
        Gen<String> cadena = new Gen<String>("Grupo 48");

        // mostrar el objeto
        cadena.mostrarTipo();

        // Obtener el valor
        String string = cadena.getOb();
        System.out.println("Cadena de texto: " + string);


    }
}

// T es un parametro de tipo que será reemplazado por un tipo real,
// cuando se crea el objeto de tipo "Gen"
class Gen<T> {

    // T es el parametro de tipo generico
    T ob;

    // Constructor
    public Gen(T o){
        ob = o;
    }

    public T getOb(){
        return ob;
    }

    // Muestra el tipo de T
    public void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
}