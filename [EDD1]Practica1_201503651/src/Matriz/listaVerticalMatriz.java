/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import Datos.nodoMatriz;
import javax.swing.JOptionPane;

/**
 *
 * @author Valdez
 */
public class listaVerticalMatriz {

    /**
     * @return the primero
     */
    public nodoMatriz getPrimero() {
        return primero;
    }

    /**
     * @return the ultimo
     */
    public nodoMatriz getUltimo() {
        return ultimo;
    }
    private nodoMatriz primero;
    private nodoMatriz ultimo;
    
    public listaVerticalMatriz(){
        primero = null;
        ultimo = null;
    }
    
   
    
    public void insertarNodo(nodoMatriz insertar){
        if (getPrimero()==null) {
            primero = ultimo = insertar;
        }else{
            if (insertar.getY()<getPrimero().getY()) {
                insertarFrente(insertar);
            }else if (insertar.getY()>getUltimo().getY()) {
                insertarFinal(insertar);
            }else{
                insertarMedio(insertar);
            }
        }
    }
    
    public void insertarFrente(nodoMatriz insertar){
        getPrimero().setArriba(insertar);
        insertar.setAbajo(getPrimero());
        primero = getPrimero().getArriba();
    }
    public void insertarFinal(nodoMatriz insertar){
        getUltimo().setAbajo(insertar);
        insertar.setArriba(getUltimo());
        ultimo = getUltimo().getAbajo();
        
    }
    public void insertarMedio(nodoMatriz insertar){
        nodoMatriz temporal1;
        nodoMatriz temporal2;
        temporal1 = getPrimero();
        while(temporal1.getY()<insertar.getY()){
            temporal1 = temporal1.getAbajo();           
        }
        temporal2 = temporal1.getArriba();
        temporal2.setAbajo(insertar);
        temporal1.setArriba(insertar);
        insertar.setAbajo(temporal1);
        insertar.setArriba(temporal2);
    }
    
    public void mostrarLista(){
        nodoMatriz temporal = getPrimero();
        while(temporal!= null){
             JOptionPane.showMessageDialog(null,"Y: "+ temporal.getY());
             temporal = temporal.getAbajo();
        }
    }
}
