/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class casillaDoble {
    private String casillaDoblesX;
    private String casillaDoblesY;
    private casillaDoble siguiente;
    
    public casillaDoble(String cDX,String cDY){
        casillaDoblesX = cDX;
        casillaDoblesY = cDY;
        siguiente = null;
    }

    /**
     * @return the casillaDobles
     */
    public String getCasillaDobles() {
        return casillaDoblesX;
    }

    /**
     * @param casillaDobles the casillaDobles to set
     */
    public void setCasillaDobles(String casillaDobles) {
        this.casillaDoblesX = casillaDobles;
    }

    /**
     * @return the siguiente
     */
    public casillaDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(casillaDoble siguiente) {
        this.siguiente = siguiente;
    }
        @Override
    public String toString(){
        return casillaDoblesX+","+casillaDoblesY;
    }

    /**
     * @return the casillaDoblesY
     */
    public String getCasillaDoblesY() {
        return casillaDoblesY;
    }

    /**
     * @param casillaDoblesY the casillaDoblesY to set
     */
    public void setCasillaDoblesY(String casillaDoblesY) {
        this.casillaDoblesY = casillaDoblesY;
    }
}
