package co.edu.upt.misiontic2022.c2;

public class Computadores {

    // Atributos constantes
    protected final static char CONSUMO_W = 'F';
    protected final static Double PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE = 5;

    // Atributos
    protected Double precioBase;
    protected char consumoW;
    protected Integer peso;

    // Constructores
    public Computadores(){
        this(PRECIO_BASE,PESO_BASE,CONSUMO_W);

        /*
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        */
    }

    public Computadores(Double precioBase, Integer peso){
        this(precioBase,peso,CONSUMO_W);

        /*
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W;
        */
    }

    public Computadores(Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    //Métodos
    public Double calcularPrecio(){

        Double adicion = 0.0;
        switch(consumoW){
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }

        if ((peso >= 0) && (peso < 19)){
            adicion += 10.0;
        } else if ((peso >= 20) && (peso < 49)){
            adicion += 50.0;
        } else if ((peso >= 50) && (peso <= 79)){
            adicion += 80.0;
        } else if (peso >= 80){
            adicion += 100.0;
        }

        return precioBase + adicion;
    }

    public Double getPrecioBase(){
        return precioBase;
    }

    public char getConsumoW(){
        return consumoW;
    }

    public Integer getPeso(){
        return peso;
    }
   
}
