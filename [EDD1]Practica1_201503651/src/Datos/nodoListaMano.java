/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import listasSimples.listaManoJugador;


public class nodoListaMano {
    private listaManoJugador listaMano;
    private nodoListaMano siguiente;
    public nodoListaMano(listaManoJugador lMJ){
        listaMano = lMJ;
        siguiente = this;
    }

    /**
     * @return the listaMano
     */
    public listaManoJugador getListaMano() {
        return listaMano;
    }

    /**
     * @param listaMano the listaMano to set
     */
    public void setListaMano(listaManoJugador listaMano) {
        this.listaMano = listaMano;
    }

    /**
     * @return the siguiente
     */
    public nodoListaMano getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoListaMano siguiente) {
        this.siguiente = siguiente;
    }
}
