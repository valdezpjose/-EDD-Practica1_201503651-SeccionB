/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasSimples;

import Datos.casillaTriples;
import javax.swing.JOptionPane;

public class listaSimpleTriples {
    private casillaTriples primeraCasilla;
    
    public listaSimpleTriples(){       
    }
    
    public void agregarCasillaTriple(casillaTriples cT){
        if (primeraCasilla == null) {
            primeraCasilla = cT;
        }
        else{
            casillaTriples actual = primeraCasilla;
            while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(cT);
        }
    }
     public void mostrar (){
        casillaTriples actual = primeraCasilla;
        while(actual.getSiguiente()!= null){
        JOptionPane.showMessageDialog(null,actual.toString());
        actual = actual.getSiguiente();
        }
      JOptionPane.showMessageDialog(null,actual.toString() );  
    }
}
