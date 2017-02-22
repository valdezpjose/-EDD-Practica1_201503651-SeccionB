/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import listasSimples.listaManoJugador;


public class jugador {
    private String jugador;
    private jugador siguiente;
    private int punteo;

    public jugador(String jg, int numero){
        jugador = jg;
        siguiente = this;
        punteo = numero;
    }
          

    
    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the siguiente
     */
    public jugador getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(jugador siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public String toString(){
        return jugador;
    }
}
