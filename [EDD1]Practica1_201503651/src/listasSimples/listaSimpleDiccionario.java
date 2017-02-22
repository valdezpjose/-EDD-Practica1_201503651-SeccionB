       
package listasSimples;

import Datos.palabraDiccionario;
import javax.swing.JOptionPane;

public class listaSimpleDiccionario {
    private palabraDiccionario primeraPalabra;
    private palabraDiccionario auxiliarDiccionario;
    public listaSimpleDiccionario(){      
    }
    public void agregarPalabra(palabraDiccionario pD){
        if (getPrimeraPalabra() == null) {
            setPrimeraPalabra(pD);
        }
        else{
            palabraDiccionario actual = getPrimeraPalabra();
            while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(pD);
        }
    }
    public void mostrar (){
        palabraDiccionario actual = getPrimeraPalabra();
        while(actual.getSiguiente()!= null){
        JOptionPane.showMessageDialog(null,actual.toString());
        actual = actual.getSiguiente();
        }
      JOptionPane.showMessageDialog(null,actual.toString() );  
    }

    /**
     * @return the primeraPalabra
     */
    public palabraDiccionario getPrimeraPalabra() {
        return primeraPalabra;
    }

    /**
     * @param primeraPalabra the primeraPalabra to set
     */
    public void setPrimeraPalabra(palabraDiccionario primeraPalabra) {
        this.primeraPalabra = primeraPalabra;
    }

    /**
     * @return the auxiliarDiccionario
     */
    public palabraDiccionario getAuxiliarDiccionario() {
        return auxiliarDiccionario;
    }

    /**
     * @param auxiliarDiccionario the auxiliarDiccionario to set
     */
    public void setAuxiliarDiccionario(palabraDiccionario auxiliarDiccionario) {
        this.auxiliarDiccionario = auxiliarDiccionario;
    }
}
