/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author 
 */
public class LISTA {
    
    private NODO inicio;
    private NODO fin;           //se hacen privados 
    
    //POR DEFAULT LA LISTA ESTA VACIA
    public LISTA() {
        this.inicio=null; //NO HAY NODOS EN LA LISTA
        this.fin=null;
    }
    
    public void imprimir(){
        NODO temp = inicio;
        //COMO MUEVO A TEMP?
            while(temp !=null) {
                System.out.print(temp.getValor() + " - ");
                temp= temp.getSiguiente();
    }
    }
   
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    //SOLUCION 1: O(N)
    public void add(int valor){
        NODO newNODO= new NODO(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if(inicio==null){  //NO HAY NODOS EN LA LISTA
            inicio= newNODO;
            fin =newNODO;
        } else {//HAY NODOS EN LA LISTA
           //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL HASTA EL ULTIMO NODO DE LA LISTA
          /*  NODO temp= inicio;
            //COMO MUEVO A TEMP?
            while(temp.getSiguiente() !=null) {
                temp= temp.getSiguiente();     
            }
            temp.setSiguiente(newNODO); */
            
            fin.setSiguiente(newNODO);
            fin =newNODO;
        }
    }
    public int tamaLISTA(){
        int cont=0;
    
         NODO temp = inicio;
        //COMO MUEVO A TEMP?
            while(temp !=null) {
                cont++;
                temp= temp.getSiguiente();
            }   
            return cont;
    }
    

    public void agregarEn(int valor, int pos){
        //QUE DEBEMOS HACER?  INSERTAR EN UNA POSICION NO VALIDA
        //POSICIONES NEGATIVAS
        //POSICIONES MAYORES A LA CANTIDAD DEL ELEMENTOS
    }
}
