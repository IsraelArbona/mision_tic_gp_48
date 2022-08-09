package co.edu.utp.misiontic2022.c2.model.vo;

public class AsesorPorCiudadVo {
    
    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public AsesorPorCiudadVo(){

    }

    public AsesorPorCiudadVo(Integer idLider, String nombre, String primerApellido, String ciudadResidencia){
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.ciudadResidencia = ciudadResidencia;
    }
    
    public Integer getIdLider() {
        return idLider;
    }
    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    } 
  
}
