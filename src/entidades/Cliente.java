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
public class Cliente extends DatosPersona{
    
    private String dni;
 
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
        return this.getDni()+" | "+this.getNombre()+" | "
                +this.getApellido()+" | "+this.getTelefono(); //+ " | "+this.getCentro;
    }
    
}
