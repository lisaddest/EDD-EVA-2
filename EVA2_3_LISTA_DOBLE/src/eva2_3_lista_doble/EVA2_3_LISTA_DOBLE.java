/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LISTADOBLE LISTADOBLE =new LISTADOBLE();
        LISTADOBLE.add(10); //0
        LISTADOBLE.add(20); //1
        LISTADOBLE.add(30); //2
        LISTADOBLE.add(40); //3
        LISTADOBLE.add(50); //4
        LISTADOBLE.imprimir();
        try {
            LISTADOBLE.insertarEn(5, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        LISTADOBLE.imprimir();
    }
}