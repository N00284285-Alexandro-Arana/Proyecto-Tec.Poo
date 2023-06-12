/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Piero354
 */
public class Reservacion { 
    private String codigoCancha;
    private int tarifa;
    private int horario;
    private int centro;
    private int formatoPago;
    
    /**
     * @return the codigoCancha
     */
    public String getCodigoCancha() {
        return codigoCancha;
    }

    /**
     * @param codigoCancha the codigoCancha to set
     */
    public void setCodigoCancha(String codigoCancha) {
        this.codigoCancha = codigoCancha;
    }

    /**
     * @return the tarifa
     */
    public int getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return the centro
     */
    public int getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(int centro) {
        this.centro = centro;
    }

    /**
     * @return the formatoPago
     */
    public int getFormatoPago() {
        return formatoPago;
    }

    /**
     * @param formatoPago the formatoPago to set
     */
    public void setFormatoPago(int formatoPago) {
        this.formatoPago = formatoPago;
    }
    
    
    
}
