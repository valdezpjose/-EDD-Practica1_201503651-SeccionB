/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasSimples;
import Datos.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Valdez
 */
public class listaSimpleDobles {
    private casillaDoble primeraCasilla;
    
    public listaSimpleDobles(){       
    }
    public void agregarCasilla(casillaDoble cD){
        if (primeraCasilla == null) {
            primeraCasilla = cD;
        }
        else{
            casillaDoble actual = primeraCasilla;
            while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(cD);
        }
    }
    public void mostrar (){
        casillaDoble actual = primeraCasilla;
        while(actual.getSiguiente()!= null){
        JOptionPane.showMessageDialog(null,actual.toString());
        actual = actual.getSiguiente();
        }
      JOptionPane.showMessageDialog(null,actual.toString() );  
    }
}
