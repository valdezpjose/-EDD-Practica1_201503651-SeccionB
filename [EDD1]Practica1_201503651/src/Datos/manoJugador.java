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
public class manoJugador {
    private String fichaMano;
    private manoJugador siguiente;
    public manoJugador(String fM){
        fichaMano = fM;
        siguiente = null;
    }

    /**
     * @return the fichaMano
     */
    public String getFichaMano() {
        return fichaMano;
    }

    /**
     * @param fichaMano the fichaMano to set
     */
    public void setFichaMano(String fichaMano) {
        this.fichaMano = fichaMano;
    }

    /**
     * @return the siguiente
     */
    public manoJugador getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(manoJugador siguiente) {
        this.siguiente = siguiente;
    }
        @Override
    public String toString(){
        return fichaMano;
    }
}
