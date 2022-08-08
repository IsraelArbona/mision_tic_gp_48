package co.edu.utp.misiontic2022.c2.model.vo;

public class ComprasDeLiderVo {

    private String lider;
    private Double valor;
    
    public ComprasDeLiderVo() {
    }

    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%-25s %,15.1f", this.lider, this.valor);
    }

    
}
