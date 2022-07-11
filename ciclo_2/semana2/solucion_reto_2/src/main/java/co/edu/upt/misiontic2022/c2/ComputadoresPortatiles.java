package co.edu.upt.misiontic2022.c2;

public class ComputadoresPortatiles extends Computadores {

    // Atributos constantes
    private final static Integer PULGADAS_BASE = 20;
    // Atributos
    private Integer pulgadas;
    private boolean camaraITG;

    // Constructor
    public ComputadoresPortatiles(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, false);
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso){
        this(precioBase,peso,CONSUMO_W,PULGADAS_BASE,false);
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;    
    }

    // Método
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if(pulgadas > 40){
            adicion += precioBase * 0.3;
        }
        if (camaraITG){
            adicion += 50.0;
        }

        return adicion;
    }
    
}
