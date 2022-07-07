package co.edu.utp.misiontic2022.c2;

public class Cuadrado extends Figura {

    // se define un atributo: "lado" (variable de clase)
    private double lado;

    // Constructor de la clase "Cuadrado"
    public Cuadrado(String color, double lado){
        // Toma de la clase abstracta "Figura" (super) el (método constructor) "color"
        super(color);
        this.lado = lado;
    }

    // Método que fue definido en la clase abstracta "Figura"
    public double carcularArea(){
        return lado * lado;
    }
    
}
