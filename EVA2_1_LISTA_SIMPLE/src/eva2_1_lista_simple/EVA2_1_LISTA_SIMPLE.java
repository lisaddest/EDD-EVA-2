/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author Ana Paulina villegas
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LISTA miLISTA = new LISTA();
        //int[] arreglo= new int[1000000];
        
        /*for (int i = 0; i < 1000000; i++) {  //O(N^2)
            miLISTA.add(1000);
        }
        System.out.println("CONTEO DE NODOS: " + miLISTA.tamaLISTA());
        */
        
        miLISTA.add(10); //0
        miLISTA.add(20); //1
        miLISTA.add(30); //2
        miLISTA.add(40); //3
        miLISTA.add(50); //4
        miLISTA.add(60); //5
         miLISTA.imprimir();
        try{
        miLISTA.insertarEn(70, 3);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
       
     //   miLISTA.imprimir();  
    }
}
