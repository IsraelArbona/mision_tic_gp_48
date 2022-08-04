package co.edu.utp.misiontic2022.c2.model.vo;

public class DeudasPorProyectoVo {

    private Integer id;
    private Double valor;
    
    public DeudasPorProyectoVo() {
    }

    public DeudasPorProyectoVo(Integer id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return String.format("%3d %,15.1f", this.id, this.valor);
    }

    
}
