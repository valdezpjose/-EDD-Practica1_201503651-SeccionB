/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasSimples;

import Datos.manoJugador;
import javax.swing.JOptionPane;
public class listaManoJugador {
    private manoJugador primeraFichaMano;
    private manoJugador manoAuxiliar;
    
    public listaManoJugador(){
    }
    public void agregarFichaMano(manoJugador pFM){
        if (getPrimeraFichaMano()== null) {
            setPrimeraFichaMano(pFM);
        }else{
            manoJugador actual = getPrimeraFichaMano();
             while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(pFM);
        }
    }
    
     public void mostrar (){
        manoJugador actual = getPrimeraFichaMano();
        while(actual.getSiguiente()!= null){
        JOptionPane.showMessageDialog(null,actual.toString());
        actual = actual.getSiguiente();
        }
      JOptionPane.showMessageDialog(null,actual.toString() );  
    }

    /**
     * @return the primeraFichaMano
     */
    public manoJugador getPrimeraFichaMano() {
        return primeraFichaMano;
    }

    /**
     * @param primeraFichaMano the primeraFichaMano to set
     */
    public void setPrimeraFichaMano(manoJugador primeraFichaMano) {
        this.primeraFichaMano = primeraFichaMano;
    }

    /**
     * @return the manoAuxiliar
     */
    public manoJugador getManoAuxiliar() {
        return manoAuxiliar;
    }

    /**
     * @param manoAuxiliar the manoAuxiliar to set
     */
    public void setManoAuxiliar(manoJugador manoAuxiliar) {
        this.manoAuxiliar = manoAuxiliar;
    }

    /**
     * @return the siguiente


    /**
     * @param siguiente the siguiente to set
     */

}
