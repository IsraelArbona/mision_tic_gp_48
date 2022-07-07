package co.edu.utp.misiontic2022.c2;

/**
 * Interfases
 * 
 * Define métodos sin cuerpo
 * Implementados por subclases
 * 
 * <(modificador) "public" o "default"> interface <nombre> (<tipo parametro>)
 * 
 * donde:
 *      public: para todos los paquetes
 *      default: No se coloca y solo es visto desde otros miembros del mismo paquete
 * 
 * Las variable declaradas en una interfaz no son variable de instancia. En cambio,
 * son implícitamente publi final y stactic y deben ser inicializadas es decir constantes.
 */

public interface Series {

    int getSiguiente();                 // retorna el siguiente número de la serie
    void reiniciar();                   // reinicia la serie
    void setComenzar(int entrada);      // establece un valor inicial
    
}
