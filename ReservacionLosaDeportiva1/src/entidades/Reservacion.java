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
    private int formatoPago;
    private int centro;
    
    private final int ocho_9 = 0 ;
    private final int nueve_10= 1 ;
    private final int diez_11 = 2 ;
    private final int once_12 = 3 ;
    private final int doce_1 = 4 ;
    private final int tres_4= 5 ;
    private final int cuatro_5 = 6 ;
    private final int cinco_6 = 7 ;
    
    private final int Efectivo = 0 ;
    private final int Yape_Plin = 1 ;
    private final int Visa = 2 ;
    
    private final int SJL_ZARATE = 0 ;
    private final int SJL_LOS_JARDINES = 1 ;
    private final int SJL_LAS_FLORES = 2 ;
    private final int SJL_SAN_MARTIN = 3 ;
    private final int SJL_SAN_CARLOS = 4 ;
    
    public String getHorarioElegido() {
        String horaElegida = "";
        switch(horario){
            case ocho_9:
                horaElegida="08:00 - 09:00";
                break;
            case nueve_10:
                horaElegida="09:00 - 10:00";
                break;
            case diez_11:
                horaElegida="10:00 - 11:00";
                break;
            case once_12:
                horaElegida="11:00 - 12:00";
                break;
            case doce_1:
                horaElegida="12:00 - 13:00";
                break;
            case tres_4:
                horaElegida="15:00 - 16:00";
                break;
            case cuatro_5:
                horaElegida="16:00 - 17:00";
                break;
            case cinco_6:
                horaElegida="17:00 - 18:00";
                break;
        }
        return "Horario: "+ horaElegida;
    }
      
    public String getFormaPago() {
        String formaPago = "";
        switch(formatoPago){
            case Efectivo:
                formaPago="Efectivo";
                break;
            case Yape_Plin:
                formaPago="Yape o Plin";
                break;
            case Visa:
                formaPago="Visa";
                break;
        }
        return "Pagó: " + formaPago;
    }          
     
    public String getNombreCentro() {
        String nombreCentro = "";
        switch(centro){
            case SJL_ZARATE:
                nombreCentro="SJL ZARATE";
                break;
            case SJL_LOS_JARDINES:
                nombreCentro="SJL LOS JARDINES";
                break;
            case SJL_LAS_FLORES:
                nombreCentro="SJL LAS FLORES";
                break;
            case SJL_SAN_MARTIN:
                nombreCentro="SJL SAN MARTIN";
                break;
            case SJL_SAN_CARLOS:
                nombreCentro="SJL SAN CARLOS";
                break;
        }
        return "Sede: " + nombreCentro;
    }
    
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
