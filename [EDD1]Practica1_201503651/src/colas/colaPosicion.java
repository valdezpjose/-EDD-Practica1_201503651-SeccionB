/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import Datos.nodoPosicion;

/**
 *
 * @author Valdez
 */
public class colaPosicion {

      private nodoPosicion primeraFicha;
       private nodoPosicion ultimaFicha;
    
    public colaPosicion(){
        primeraFicha = ultimaFicha = null;
    }
    public void insertarFicha(nodoPosicion elementoColaFicha){
        if (colaVacia()) {
            primeraFicha = elementoColaFicha;
        }
        else{
            ultimaFicha.setSiguiente(elementoColaFicha);
        }
        ultimaFicha = elementoColaFicha;
    }
    
     public String eliminarNodo(){
        String Ficha;
        Ficha = primeraFicha.toString();
        primeraFicha = primeraFicha.getSiguiente();
        return Ficha;
    }
    
    public boolean colaVacia(){
        if (primeraFicha==null) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the primero
     */
    public nodoPosicion getPrimero() {
        return primeraFicha;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(nodoPosicion primero) {
        this.primeraFicha = primero;
    }

    /**
     * @return the ultimo
     */
    public nodoPosicion getUltimo() {
        return ultimaFicha;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(nodoPosicion ultimo) {
        this.ultimaFicha = ultimo;
    }
    /**
     * @return the x
     */
   
    
}
