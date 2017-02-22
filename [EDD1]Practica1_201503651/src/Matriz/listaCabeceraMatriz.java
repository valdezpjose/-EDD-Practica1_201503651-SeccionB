/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import Datos.nodoCabeceraMatriz;
import javax.swing.JOptionPane;

/**
 *
 * @author Valdez
 */
public class listaCabeceraMatriz {

    /**
     * @return the primero
     */
    public nodoCabeceraMatriz getPrimero() {
        return primero;
    }

    /**
     * @return the ultimo
     */
    public nodoCabeceraMatriz getUltimo() {
        return ultimo;
    }
    private nodoCabeceraMatriz primero;
    private nodoCabeceraMatriz ultimo;
    public listaCabeceraMatriz(){
        primero = null;
        ultimo = null;
    }


    
    public void insertarNodo(nodoCabeceraMatriz insertar){
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
    
    public void insertarFrente(nodoCabeceraMatriz insertar){
        getPrimero().setAnterior(insertar);
        insertar.setSiguiente(getPrimero());
        primero = getPrimero().getAnterior();
    }
    public void insertarFinal(nodoCabeceraMatriz insertar){
        getUltimo().setSiguiente(insertar);
        insertar.setAnterior(getUltimo());
        ultimo = getUltimo().getSiguiente();
        
    }
    public void insertarMedio(nodoCabeceraMatriz insertar){
        nodoCabeceraMatriz temporal1;
        nodoCabeceraMatriz temporal2;
        temporal1 = getPrimero();
        while(temporal1.getX()<insertar.getX()){
            temporal1 = temporal1.getSiguiente();           
        }
        temporal2 = temporal1.getAnterior();
        
        temporal2.setSiguiente(insertar);
        temporal1.setAnterior(insertar);    
        insertar.setSiguiente(temporal1);
        insertar.setAnterior(temporal2);
    }
    
    public void mostrarLista(){
        nodoCabeceraMatriz temporal = getPrimero();
        while(temporal!= null){
             JOptionPane.showMessageDialog(null,"X: "+ temporal.getX());
             temporal = temporal.getSiguiente();
        }
    }
    
    public boolean   existeListaCabecera(int x){
            nodoCabeceraMatriz temporal;
            temporal = getPrimero();
            while(temporal!=null){
                if (temporal.getX() == x) {                   
                    return true;
                }else if (temporal.getSiguiente()==null) {
                    return false;
                }
                temporal = temporal.getSiguiente();
            }         
        return false;
    }
    
    public nodoCabeceraMatriz busqueda(int x){
       nodoCabeceraMatriz temporal;
       temporal = getPrimero();
       while(temporal.getX()!= x){
           temporal = temporal.getSiguiente();
           
       }
       return temporal;
    } 
}
