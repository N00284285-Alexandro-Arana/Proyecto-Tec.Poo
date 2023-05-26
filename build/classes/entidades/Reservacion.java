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

     private int Hora;
    private int Fecha;
    private String Centro;
    /**
     * @return the Hora
     */
    public int getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the Fecha
     */
    public int getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Centro
     */
    public String getCentro() {
        return Centro;
    }

    /**
     * @param Centro the Centro to set
     */
    public void setCentro(String Centro) {
        this.Centro = Centro;
    }
   
}
