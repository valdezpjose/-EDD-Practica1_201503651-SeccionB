
package Datos;

public class palabraDiccionario {
    private String palabra;
    private palabraDiccionario siguiente;
    
    public palabraDiccionario(String pal){
        palabra = pal;
        siguiente = null;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the siguiente
     */
    public palabraDiccionario getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(palabraDiccionario siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public String toString(){
        return palabra;
    }
}
