package co.edu.utp.misiontic2022.c2;

public class DeDos implements Series {

    int iniciar;
    int valor;
    int anterior;

    DeDos(){
        iniciar = 0;
        valor = 0;
    }

    @Override
    public int getSiguiente() {
        anterior = valor;
        valor += 2;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor = iniciar;
        anterior = valor - 2;
        
    }

    @Override
    public void setComenzar(int entrada) {
        iniciar = entrada;
        valor = entrada;
        anterior = entrada - 2;
    }

    // Añadiendo un método que no está definido en Series
    public int getAnterior(){
        return anterior;
    }

    
    
}
