/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class fichas {
    private String ficha;
    private fichas siguiente;
    
    public fichas(String fc){
        ficha = fc;
        siguiente = null;
    }

    /**
     * @return the Ficha
     */
    public String getficha() {
        return ficha;
    }

    /**
     * @param Ficha the Ficha to set
     */
    public void setficha(String Ficha) {
        this.ficha = Ficha;
    }

    /**
     * @return the siguiente
     */
    public fichas getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(fichas siguiente) {
        this.siguiente = siguiente;
    }
    
        @Override
    public String toString(){
        return ficha;
    }
}
