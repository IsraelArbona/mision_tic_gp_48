package co.edu.utp.misiontic2022.c2.model.vo;

public class CompraPorProveedorVo {

    private Integer idCompra;
    private String constructora;
    private String bancoVinculado;

    public CompraPorProveedorVo() {
    }

    public CompraPorProveedorVo(Integer idCompra, String constructora, String bancoVinculado) {
        this.idCompra = idCompra;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
  
}
