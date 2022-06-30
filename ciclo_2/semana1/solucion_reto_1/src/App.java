public class App {
    public static void main(String[] args) throws Exception {

        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60, 13000, 1.4));

        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000,2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());

        BecaUniversitaria becaUniversitaria3 = new BecaUniversitaria();
        System.out.println(becaUniversitaria3.calcularInteresSimple());
        System.out.println(becaUniversitaria3.calcularInteresCompuesto());
        System.out.println(becaUniversitaria3.compararInversion());

    }
}


class BecaUniversitaria {

    // -----------------------------------------------------
    // Atributos
    // -----------------------------------------------------

    /**
     * valor del tiempo
     */
    private int tiempo;

    /**
     * valor de la beca universitaria
     */
    private double monto;

    /**
     * valor del interes que se aplica al proyecto
     */
    private double interes;

    // -------------------------------------------------
    // Constructor
    // -------------------------------------------------

    /**
     * Contructor del proyecto
     * Se crea un nuevo proyecto con los valores
     */
    public BecaUniversitaria() {
        tiempo = 0;
        monto = 0;
        interes = 0;
    }

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    // -----------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------

    /**
     * Retornar el interes simple, monto, tiempo.
     * @return El total de interes simple generado en número.
     */
    public double calcularInteresSimple(){
        double interesSimple = monto * (interes / 100) * tiempo;
        return Math.round(interesSimple);
    }


    /**
     * Retornar el interes compuesto, monto, tiempo.
     * @return El total de interes compuesto generado en número.
     */
    public double calcularInteresCompuesto() {
        double interesCompuesto = monto * ( Math.pow(1 + interes / 100, tiempo) -1 );
        return Math.round(interesCompuesto);
    }

    /**
     * Método para comparar la diferencia en el total de intereses generados en el proyecto
     * @param pTiempo
     * @param pMonto
     * @param pInteres
     * @return Respuesta al reto 1.
     */
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;

        // Calcular la diferencia entres el interes compuesto e interes simple
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        if (diferencia != 0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

    public String compararInversion(){
        double diferencia = 0;
        
        // Calcular la diferencia entre las dos tasas de interes.
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        // Revisar la diferencia obtenida.
        if (diferencia != 0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }

    }

}
