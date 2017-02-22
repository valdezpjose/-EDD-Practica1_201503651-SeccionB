/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Datos.*;
import Matriz.MatrizOrtogonal;
import colas.colaFichas;
import listasSimples.*;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author Valdez
 */
public class baseNodoXML {
    private static int dimensionTablero;
    private static String aux;
    private static listaSimpleDiccionario listaSimpleD = new listaSimpleDiccionario();
    private static listaSimpleDobles listaSimpleDB = new listaSimpleDobles();
    private static listaSimpleTriples listaSimpleT = new listaSimpleTriples();
    private static MatrizOrtogonal matriz = new MatrizOrtogonal();
    private static colaFichas colaF = new colaFichas();
    
    
    
    public baseNodoXML(){ 
                
        
}
    public void obtenerDatosXML(String ruta){
        char[] chr={'A','A','A','A','A','A','A','A','A','A','A','A','E','E','E','E','E','E','E','E','E','E','E','E','O','O','O','O','O','O','O','O','O','I','I','I','I','I','I','S','S','S','S','S','S','N','N','N','N','N','L','L','L','L','R','R','R','R','R','U','U','U','U','U','T','T','T','T','D','D','D','D','D','G','G','C','C','C','C','B','B','M','M','P','P','H','H','F','V','Y','Q','J','Ñ','X','Z'};		
        char[] aleatorio=new char[95];
        Random rnd = new Random();
        int k=95;
        int pos;
        for (int i = 0; i < 95; i++) {
            pos = rnd.nextInt(k);
            aleatorio[i] = chr[pos];
            chr[pos] = chr[k-1];
            k--;
        }
        for (int i = 0; i < 95; i++) {
            fichas ficha = new fichas(aleatorio[i]+"");
            colaF.insertarFicha(ficha);
        }

        File rutaXml = new File(ruta);
        DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBR = dBF.newDocumentBuilder();
            Document dT = dBR.parse(rutaXml);
            dT.normalize();
            
            NodeList etiquetaScrabble = dT.getElementsByTagName("scrabble");
            Node nodoScrabble = etiquetaScrabble.item(0);
            Element elementoScrabble = (Element) nodoScrabble;
            
            NodeList etiquetaDimension = elementoScrabble.getElementsByTagName("dimension");
            Node nodoDimension = etiquetaDimension.item(0);
            Element elementoDimension = (Element) nodoDimension;
            setDimensionTablero(Integer.parseInt(elementoDimension.getTextContent()));
            getMatriz().llenar(getDimensionTablero(), getDimensionTablero());
            
            NodeList etiquetaDobles = elementoScrabble.getElementsByTagName("dobles");
            Node nodoDobles = etiquetaDobles.item(0);
            Element elementoDobles = (Element) nodoDobles;            
            NodeList etiquetaCasillaDobles = elementoDobles.getElementsByTagName("casilla");
            for (int i = 0; i < etiquetaCasillaDobles.getLength(); i++) {
                Node nodoCasillaDobles = etiquetaCasillaDobles.item(i);
                Element elementoCasillaDobles =(Element) nodoCasillaDobles;
                
                NodeList etiquetaXDobles = elementoCasillaDobles.getElementsByTagName("x");
                Node nodoXDobles = etiquetaXDobles.item(0);
                Element elementoXDobles = (Element) nodoXDobles;
                
                NodeList etiquetaYDobles = elementoCasillaDobles.getElementsByTagName("y");
                Node nodoYDobles = etiquetaYDobles.item(0);
                Element elementoYDobles = (Element) nodoYDobles;
                
                getMatriz().insertar(Integer.parseInt(elementoXDobles.getTextContent()),Integer.parseInt(elementoYDobles.getTextContent()),2,"");
                
                casillaDoble cD = new casillaDoble(elementoXDobles.getTextContent(), elementoYDobles.getTextContent());
                getListaSimpleDB().agregarCasilla(cD);
            }
            NodeList etiquetaTriples = elementoScrabble.getElementsByTagName("triples");
            Node nodoTriples = etiquetaTriples.item(0);
            Element elementoTriples = (Element) nodoTriples;            
            NodeList etiquetaCasillaTriples = elementoTriples.getElementsByTagName("casilla");
            for (int i = 0; i < etiquetaCasillaTriples.getLength(); i++) {
                Node nodoCasillaTriples = etiquetaCasillaTriples.item(i);
                Element elementoCasillaTriples =(Element) nodoCasillaTriples;
                
                NodeList etiquetaXTriples = elementoCasillaTriples.getElementsByTagName("x");
                Node nodoXTriples = etiquetaXTriples.item(0);
                Element elementoXTriples = (Element) nodoXTriples;
                
                NodeList etiquetaYTriples = elementoCasillaTriples.getElementsByTagName("y");
                Node nodoYTriples = etiquetaYTriples.item(0);
                Element elementoYTriples = (Element) nodoYTriples;
                
                 getMatriz().insertar(Integer.parseInt(elementoXTriples.getTextContent()),Integer.parseInt(elementoYTriples.getTextContent()),3,"");
                
                casillaTriples cT = new casillaTriples(elementoXTriples.getTextContent(), elementoYTriples.getTextContent());
                getListaSimpleT().agregarCasillaTriple(cT);
            }
            NodeList etiquetaDiccionario = elementoScrabble.getElementsByTagName("diccionario");
            Node nodoDiccionario = etiquetaDiccionario.item(0);
            Element elementoDiccionario = (Element) nodoDiccionario;
            
            NodeList etiquetaPalabra = elementoDiccionario.getElementsByTagName("palabra");
            for (int i = 0; i < etiquetaPalabra.getLength(); i++) {
                Node nodoPalabra = etiquetaPalabra.item(i);
                Element elementoPalabra = (Element) nodoPalabra;
                aux = elementoPalabra.getTextContent();
                palabraDiccionario palabraD = new palabraDiccionario(getAux());
                getListaSimpleD().agregarPalabra(palabraD);
            } 
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(baseNodoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(baseNodoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(baseNodoXML.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }

    public int getDimensionTablero() {
        return dimensionTablero;
    }

    public void setDimensionTablero(int dimensionTablero) {
        this.dimensionTablero = dimensionTablero;
    }

    /**
     * @return the aux
     */
    public String getAux() {
        return aux;
    }

    /**
     * @return the listaSimpleD
     */
    public listaSimpleDiccionario getListaSimpleD() {
        return listaSimpleD;
    }

    /**
     * @return the listaSimpleDB
     */
    public listaSimpleDobles getListaSimpleDB() {
        return listaSimpleDB;
    }

    /**
     * @return the listaSimpleT
     */
    public listaSimpleTriples getListaSimpleT() {
        return listaSimpleT;
    }

    /**
     * @return the matriz
     */
    public MatrizOrtogonal getMatriz() {
        return matriz;
    }

    /**
     * @return the colaF
     */
    public colaFichas getColaF() {
        return colaF;
    }
}
