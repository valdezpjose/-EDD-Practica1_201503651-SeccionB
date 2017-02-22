/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCirculares;

import Datos.jugador;
import Datos.nodoListaMano;
import javax.swing.JOptionPane;
import listasSimples.listaManoJugador;

public class listaCircularJugadores {

    /**
     * @return the ultimoJugador
     */
    public jugador getUltimoJugador() {
        return ultimoJugador;
    }

    /**
     * @param ultimoJugador the ultimoJugador to set
     */
    public void setUltimoJugador(jugador ultimoJugador) {
        this.ultimoJugador = ultimoJugador;
    }

    /**
     * @return the primeraMano
     */
    public nodoListaMano getPrimeraMano() {
        return primeraMano;
    }
    private jugador ultimoJugador;
    private jugador jugadorAuxiliar;
    private nodoListaMano primeraMano;
    public boolean validarJugador = true;

    public listaCircularJugadores(){
        ultimoJugador = null;
        primeraMano = null;
    }
    public boolean listaCircularVacia(){
        return getUltimoJugador() == null;
    }
    
    public void insertarJugador(jugador nuevoJugador, nodoListaMano nuevaMano){
        if (getUltimoJugador() != null) {
            validarJugador(nuevoJugador);
            if (validarJugador == false) {
                JOptionPane.showMessageDialog(null,"NOMBRE DE USUARIO YA EXISTENTE");
                validarJugador = true;
            }
            else{
            JOptionPane.showMessageDialog(null,"NOMBRE DE USUARIO: "+ nuevoJugador.toString()+" AGREGADO");
            nuevoJugador.setSiguiente(getUltimoJugador().getSiguiente());
            getUltimoJugador().setSiguiente(nuevoJugador);
            
            nuevaMano.setSiguiente(primeraMano.getSiguiente());
            primeraMano.setSiguiente(nuevaMano);
            
            
            }
        }
        else{     
        primeraMano = nuevaMano;                
            setUltimoJugador(nuevoJugador);
        JOptionPane.showMessageDialog(null,"NOMBRE DE USUARIO: "+ nuevoJugador.toString()+" AGREGADO");
        }
    }
    public void mostrarListaCircularJugador(){
        jugador actual = getUltimoJugador().getSiguiente();
        do {
        JOptionPane.showMessageDialog(null,actual.toString());
        actual = actual.getSiguiente();
        } while (actual != getUltimoJugador().getSiguiente());      
    }

    public void mostrarCadaListaMano(){
        nodoListaMano actual = getPrimeraMano();
        while(actual.getSiguiente()!= null){
        actual.getListaMano().mostrar();
        actual = actual.getSiguiente();
        }
       actual.getListaMano().mostrar();
    }
    
    public void validarJugador(jugador auxiliar){
        jugador actual = getUltimoJugador().getSiguiente();
        do {
            if (auxiliar.toString().equals(actual.toString())) {
                validarJugador = false;                
            }
            actual = actual.getSiguiente();
        } while (actual != getUltimoJugador().getSiguiente());
               
    }
    public void siguiente(){
        primeraMano = primeraMano.getSiguiente();
        ultimoJugador = ultimoJugador.getSiguiente();
    }

    /**
     * @return the jugadorAuxiliar
     */
    public jugador getJugadorAuxiliar() {
        return jugadorAuxiliar;
    }

    /**
     * @param jugadorAuxiliar the jugadorAuxiliar to set
     */
    public void setJugadorAuxiliar(jugador jugadorAuxiliar) {
        this.jugadorAuxiliar = jugadorAuxiliar;
    }
    
}
