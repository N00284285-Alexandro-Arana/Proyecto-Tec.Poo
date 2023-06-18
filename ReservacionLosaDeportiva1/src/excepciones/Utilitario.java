/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
import ExcepcionesPersonalizadas.ExcepcionGenerica;
import ExcepcionesPersonalizadas.ExcepcionNumerica;

/**
 *
 * @author GIAN
 */
public class Utilitario {
    
    public static int convertir(String numeroEnTexto)
            throws ExcepcionNumerica,
            ExcepcionGenerica {
        try{
        return Integer.parseInt(numeroEnTexto);
        }catch (NumberFormatException s){
            throw new ExcepcionNumerica();
        }catch(Exception ex){
            throw new ExcepcionGenerica();
       }
        
    }
}
