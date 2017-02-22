/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Matriz.listaHorizontalMatriz;


public class nodoLateralMatriz {
    private int y;
    private nodoLateralMatriz siguiente;
    private nodoLateralMatriz anterior;
    private listaHorizontalMatriz fila;
    
    public nodoLateralMatriz(int posY){
        y = posY;
        fila = new listaHorizontalMatriz();
        siguiente = null;
        anterior = null;
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
    public nodoLateralMatriz getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoLateralMatriz siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public nodoLateralMatriz getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodoLateralMatriz anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the fila
     */
    public listaHorizontalMatriz getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(listaHorizontalMatriz fila) {
        this.fila = fila;
    }
}
