/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Matriz.listaVerticalMatriz;

public class nodoCabeceraMatriz {
    private int x;
    
    private nodoCabeceraMatriz siguiente;
    private nodoCabeceraMatriz anterior;
    private listaVerticalMatriz columna;
 
    
    public nodoCabeceraMatriz(int posX){
        x = posX;
        columna = new listaVerticalMatriz();
        siguiente = null;
        anterior = null;
        
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
     * @return the siguiente
     */
    public nodoCabeceraMatriz getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoCabeceraMatriz siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public nodoCabeceraMatriz getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodoCabeceraMatriz anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the columna
     */
    public listaVerticalMatriz getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(listaVerticalMatriz columna) {
        this.columna = columna;
    }
}
