/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

public class nodoMatriz {
    private int valorCasilla;
    private int x;
    private int y;
    private nodoMatriz auxiliar;
    private nodoMatriz arriba;
    private nodoMatriz abajo;
    private nodoMatriz derecha;
    private nodoMatriz izquierda;
    private String letra;
    public nodoMatriz(String l, int dato, int posX, int posY){
        valorCasilla = dato;
        x = posX;
        y = posY;
        arriba = null;
        abajo = null;
        izquierda = null;
        derecha = null;
        letra = l;
    }

    /**
     * @return the valorCasilla
     */
    public int getValorCasilla() {
        return valorCasilla;
    }

    /**
     * @param valorCasilla the valorCasilla to set
     */
    public void setValorCasilla(int valorCasilla) {
        this.valorCasilla = valorCasilla;
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
     * @return the arriba
     */
    public nodoMatriz getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(nodoMatriz arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public nodoMatriz getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(nodoMatriz abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the derecha
     */
    public nodoMatriz getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(nodoMatriz derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public nodoMatriz getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(nodoMatriz izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     * @return the auxiliar
     */
    public nodoMatriz getAuxiliar() {
        return auxiliar;
    }

    /**
     * @param auxiliar the auxiliar to set
     */
    public void setAuxiliar(nodoMatriz auxiliar) {
        this.auxiliar = auxiliar;
    }
}
