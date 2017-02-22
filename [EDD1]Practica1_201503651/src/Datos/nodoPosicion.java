/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class nodoPosicion {
    private int x;
    private int y;
    private nodoPosicion siguiente;
    
    public nodoPosicion(int posX, int posY){
        x = posX;
        y = posY;
        siguiente = null;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the siguiente
     */
    public nodoPosicion getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoPosicion siguiente) {
        this.siguiente = siguiente;
    }
}
