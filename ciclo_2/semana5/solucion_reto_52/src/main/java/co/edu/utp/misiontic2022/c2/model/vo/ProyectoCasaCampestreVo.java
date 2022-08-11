/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic2022.c2.model.vo;

/**
 *
 * @author israelarbonaguerrero
 */
public class ProyectoCasaCampestreVo {
    
    private Integer idProyecto;
    private String constructora;
    private Double numeroHabitaciones;
    private String ciudad;

    public ProyectoCasaCampestreVo() {
    }

    public ProyectoCasaCampestreVo(Integer idProyecto, String constructora, Double numeroHabitaciones, String ciudad) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Double getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Double numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
