/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import Datos.nodoLateralMatriz;
import javax.swing.JOptionPane;


public class listaLateralMatriz {

    /**
     * @return the primero
     */
    public nodoLateralMatriz getPrimero() {
        return primero;
    }

    /**
     * @return the ultimo
     */
    public nodoLateralMatriz getUltimo() {
        return ultimo;
    }
private nodoLateralMatriz primero;
private nodoLateralMatriz ultimo;

    public listaLateralMatriz(){
        primero = null;
        ultimo = null;
    }


    
    public void insertarNodo(nodoLateralMatriz insertar){
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
    
    public void insertarFrente(nodoLateralMatriz insertar){
        getPrimero().setAnterior(insertar);
        insertar.setSiguiente(getPrimero());
        primero = getPrimero().getAnterior();
    }
    public void insertarFinal(nodoLateralMatriz insertar){
        getUltimo().setSiguiente(insertar);
        insertar.setAnterior(getUltimo());
        ultimo = getUltimo().getSiguiente();
        
    }
    public void insertarMedio(nodoLateralMatriz insertar){
        nodoLateralMatriz temporal1;
        nodoLateralMatriz temporal2;
        temporal1 = getPrimero();
        while(temporal1.getY()<insertar.getY()){
            temporal1 = temporal1.getSiguiente();           
        }
        temporal2 = temporal1.getAnterior();
        
        temporal2.setSiguiente(insertar);
        temporal1.setAnterior(insertar);    
        insertar.setSiguiente(temporal1);
        insertar.setAnterior(temporal2);
    }
    
    public void mostrarLista(){
        nodoLateralMatriz temporal = getPrimero();
        while(temporal!= null){
             JOptionPane.showMessageDialog(null,"Y: "+ temporal.getY());
             temporal = temporal.getSiguiente();
        }
    }
    
       public boolean   existeListaCabecera(int y){
            nodoLateralMatriz temporal;
            temporal = getPrimero();
            while(temporal!=null){
                if (temporal.getY() == y) {                   
                    return true;
                }else if (temporal.getSiguiente()==null) {
                    return false;
                }
                temporal = temporal.getSiguiente();
            }         
        return false;
    }
    
    public nodoLateralMatriz busqueda(int y){
       nodoLateralMatriz temporal;
       temporal = getPrimero();
       while(temporal.getY()!= y){
           temporal = temporal.getSiguiente();         
       }
       return temporal;
    } 
}
