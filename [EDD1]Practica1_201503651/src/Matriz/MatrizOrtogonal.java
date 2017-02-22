/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import Datos.nodoCabeceraMatriz;
import Datos.nodoLateralMatriz;
import Datos.nodoMatriz;


/**
 *
 * @author Valdez
 */
public class MatrizOrtogonal {
    private listaCabeceraMatriz cabecera;
    private listaLateralMatriz lateral;
    private listaLateralMatriz auxLateral;
    private listaCabeceraMatriz auxCabecera;
    
    public MatrizOrtogonal(){
        cabecera = new listaCabeceraMatriz();
        lateral = new listaLateralMatriz();
        
    }
    
    public void insertar(int x, int y, int inserta,String letra){
        nodoMatriz  insercion;
        insercion = new nodoMatriz(letra,inserta,x,y);
        if (getCabecera().existeListaCabecera(x)== false) {
            getCabecera().insertarNodo(new nodoCabeceraMatriz(x));
        }
        if (getLateral().existeListaCabecera(y)== false) {
            getLateral().insertarNodo(new nodoLateralMatriz(y));
        }
        nodoCabeceraMatriz cTemporal;
        nodoLateralMatriz lTemporal;
        cTemporal = getCabecera().busqueda(x);
        lTemporal = getLateral().busqueda(y);
        
        cTemporal.getColumna().insertarNodo(insercion);
        lTemporal.getFila().insertarNodo(insercion);
                
    }
      public String busquedaPalabra(int x, int y){
        String palabra;
        palabra = getLateral().busqueda(y).getFila().busquedaHorizontal(x).getLetra();
      return palabra;
    }
    
    public int busquedaValor (int x, int y){
        int numero;
        numero = getLateral().busqueda(y).getFila().busquedaHorizontal(x).getValorCasilla();
        return numero;
    }
    public void llenar(int x, int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                insertar(i,j,1,"");
            }
        }
    }
    
    

    /**
     * @return the cabecera
     */
    public listaCabeceraMatriz getCabecera() {
        return cabecera;
    }

    /**
     * @return the lateral
     */
    public listaLateralMatriz getLateral() {
        return lateral;
    }

    /**
     * @param cabecera the cabecera to set
     */
    public void setCabecera(listaCabeceraMatriz cabecera) {
        this.cabecera = cabecera;
    }

    /**
     * @param lateral the lateral to set
     */
    public void setLateral(listaLateralMatriz lateral) {
        this.lateral = lateral;
    }

    /**
     * @return the auxLateral
     */
    public listaLateralMatriz getAuxLateral() {
        return auxLateral;
    }

    /**
     * @param auxLateral the auxLateral to set
     */
    public void setAuxLateral(listaLateralMatriz auxLateral) {
        this.auxLateral = auxLateral;
    }

    /**
     * @return the auxCabecera
     */
    public listaCabeceraMatriz getAuxCabecera() {
        return auxCabecera;
    }

    /**
     * @param auxCabecera the auxCabecera to set
     */
    public void setAuxCabecera(listaCabeceraMatriz auxCabecera) {
        this.auxCabecera = auxCabecera;
    }
}
