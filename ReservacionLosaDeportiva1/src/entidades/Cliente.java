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
public class Cliente extends Reservacion{  

    private String dni;
    private String nombre;
    private String apellido;  
    private String telefono;
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String mostrarDatosClientes(){
        return this.getDni() +" | "+this.getNombre()+" | "+this.getApellido()+" | "
                +this.getTelefono()+" | "+this.getNombreCentro()+ " | "
                +this.getCodigoCancha()+" | "+this.getHorarioElegido()+" | "+this.getFormaPago()+" | S/."+this.getTarifa(); //+ " | "+this.getCentro;
    }
    
}
