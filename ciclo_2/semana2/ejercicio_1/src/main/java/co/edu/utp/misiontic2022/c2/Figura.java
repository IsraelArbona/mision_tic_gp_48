package co.edu.utp.misiontic2022.c2;

public abstract class Figura {
    
    private String color;

    // Constructor define atrubitods como color con un This, haciendo las veces de setter
    public Figura(String color){
        this.color = color;
    }

    // Método vacio para ser implementado desde la clase hija
    public abstract double carcularArea();

    // getter, para aceder al valor
    public String getColor(){
        return color;
    }
}
