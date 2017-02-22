/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Valdez
 */
public class casillaTriples {
    private String casillaTriplesX;
    private String casillaTriplesY;
    private casillaTriples siguiente;
    
    public casillaTriples(String cTX, String cTY){
        casillaTriplesX = cTX;
        casillaTriplesY = cTY;
        siguiente = null;
    }

    /**
     * @return the casillaTriplesX
     */
    public String getCasillaTriplesX() {
        return casillaTriplesX;
    }

    /**
     * @param casillaTriplesX the casillaTriplesX to set
     */
    public void setCasillaTriplesX(String casillaTriplesX) {
        this.casillaTriplesX = casillaTriplesX;
    }

    /**
     * @return the casillaTriplesY
     */
    public String getCasillaTriplesY() {
        return casillaTriplesY;
    }

    /**
     * @param casillaTriplesY the casillaTriplesY to set
     */
    public void setCasillaTriplesY(String casillaTriplesY) {
        this.casillaTriplesY = casillaTriplesY;
    }

    /**
     * @return the siguiente
     */

    
    
    @Override
      public String toString(){
        return casillaTriplesX+","+casillaTriplesY;
    }

    /**
     * @return the siguiente
     */
    public casillaTriples getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(casillaTriples siguiente) {
        this.siguiente = siguiente;
    }
}
