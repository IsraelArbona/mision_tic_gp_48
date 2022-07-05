package co.edu.utp.misiontic2022.c2;

public class Triangulo extends Figura{

    // Se definen los atributos "base", "altura"
    private double base;
    private double altura;

    //Atributos - se define los dos atributos "base" y "altura"
    public Triangulo(String color, double base, double altura){
        // Toma de la clase abstracta "Figura" (super)
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double carcularArea() {
        // TODO Auto-generated method stub
        return (base * altura)/ 2;
    }
    
}
