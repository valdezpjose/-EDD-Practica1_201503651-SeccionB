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
public class listaHorizontalMatriz {
    private nodoMatriz primero;
    private nodoMatriz ultimo;
   
    public listaHorizontalMatriz(){
        primero = null;
        ultimo = null;
    }

    public void insertarNodo(nodoMatriz insertar){
        if (getPrimero()==null) {
            primero = ultimo = insertar;
        }else{
            if (insertar.getX()<getPrimero().getX()) {
                insertarFrente(insertar);
            }else if (insertar.getX()>getUltimo().getX()) {
                insertarFinal(insertar);
            }else{
                insertarMedio(insertar);
            }
        }
    }
    
    public void insertarFrente(nodoMatriz insertar){
        getPrimero().setIzquierda(insertar);
        insertar.setDerecha(getPrimero());
        primero = getPrimero().getIzquierda();
    }
    public void insertarFinal(nodoMatriz insertar){
        getUltimo().setDerecha(insertar);
        insertar.setIzquierda(getUltimo());
        ultimo = getUltimo().getDerecha();
        
    }
    public void insertarMedio(nodoMatriz insertar){
        nodoMatriz temporal1;
        nodoMatriz temporal2;
        temporal1 = getPrimero();
        while(temporal1.getX()<insertar.getX()){
            temporal1 = temporal1.getDerecha();           
        }
        temporal2 = temporal1.getIzquierda();
        
        temporal2.setDerecha(insertar);
        temporal1.setIzquierda(insertar);
        insertar.setDerecha(temporal1);
        insertar.setIzquierda(temporal2);
    }
    public nodoMatriz busquedaHorizontal(int x){
        nodoMatriz auxiliar;
        auxiliar = getPrimero();
        while(auxiliar.getX()!= x){
            auxiliar = auxiliar.getDerecha();
        }
        return auxiliar;
    }
    
    public void mostrarLista(){
        nodoMatriz temporal = getPrimero();
        while(temporal!= null){
             JOptionPane.showMessageDialog(null,"X: "+ temporal.getX());
             temporal = temporal.getDerecha();
        }
    }

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
}
