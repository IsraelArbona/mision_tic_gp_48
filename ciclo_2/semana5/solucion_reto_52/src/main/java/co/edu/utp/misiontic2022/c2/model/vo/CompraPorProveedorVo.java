/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic2022.c2.model.vo;

/**
 *
 * @author israelarbonaguerrero
 */
public class CompraPorProveedorVo {
    
    private Integer idCompra;
    private String contructora;
    private String bancoVinculado;

    public CompraPorProveedorVo() {
    }

    public CompraPorProveedorVo(Integer idCompra, String contructora, String bancoVinculado) {
        this.idCompra = idCompra;
        this.contructora = contructora;
        this.bancoVinculado = bancoVinculado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getContructora() {
        return contructora;
    }

    public void setContructora(String contructora) {
        this.contructora = contructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
    
}

