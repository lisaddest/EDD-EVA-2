package eva2_3_lista_doble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class NODO {
    private int valor;
    private NODO siguiente;
    private NODO previo;

    // POR DEFAULT, UN NUEVO NODO VA AL FINAL DE LA LISTA
    // EL FINAL DE LA LISTA SE INDICA CON UN NULL
    //SIGUIENTE SIEMPRE VA A SER NULL
    
    public NODO() {
        this.siguiente = null;
        this.previo = null;
    }

    public NODO(int valor) {
        this.valor = valor;
        this.siguiente = null; 
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }

    public NODO getPrevio() {
        return previo;
    }

    public void setPrevio(NODO previo) {
        this.previo = previo;
    }
}