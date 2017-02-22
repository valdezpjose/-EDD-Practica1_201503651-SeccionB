/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import Datos.fichas;
import javax.swing.JOptionPane;


public class colaFichas {
    private fichas primeraFicha;
    private fichas ultimaFicha;
    private fichas colaAuxiliar;
    public colaFichas(){
        primeraFicha = ultimaFicha = null;
    }
    public void insertarFicha(fichas elementoColaFicha){
        if (colaVacia()) {
            primeraFicha = elementoColaFicha;
        }
        else{
            ultimaFicha.setSiguiente(elementoColaFicha);
        }
        ultimaFicha = elementoColaFicha;
    }
    
    public boolean colaVacia(){
        if (primeraFicha==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarElementoCola(){
        fichas fichaAux;
        do {
            fichaAux =  primeraFicha;
            System.out.println(fichaAux.toString());
            fichaAux = fichaAux.getSiguiente();
        } while (primeraFicha !=  null);     
    }
    
    public String eliminarNodo(){
        String Ficha;
        Ficha = primeraFicha.toString();
        primeraFicha = primeraFicha.getSiguiente();
        return Ficha;
    }
    /**
     * @return the primeraFicha
     */
    public fichas getPrimeraFicha() {
        return primeraFicha;
    }

    /**
     * @param primeraFicha the primeraFicha to set
     */
    public void setPrimeraFicha(fichas primeraFicha) {
        this.primeraFicha = primeraFicha;
    }

    /**
     * @return the ultimaFicha
     */
    public fichas getUltimaFicha() {
        return ultimaFicha;
    }

    /**
     * @param ultimaFicha the ultimaFicha to set
     */
    public void setUltimaFicha(fichas ultimaFicha) {
        this.ultimaFicha = ultimaFicha;
    }

    /**
     * @return the colaAuxiliar
     */
    public fichas getColaAuxiliar() {
        return colaAuxiliar;
    }

    /**
     * @param colaAuxiliar the colaAuxiliar to set
     */
    public void setColaAuxiliar(fichas colaAuxiliar) {
        this.colaAuxiliar = colaAuxiliar;
    }
}
