/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

/**
 *
 * @author moviles
 */
public class LISTADOBLE {
    private NODO inicio;
    private NODO fin;
    private int cont;
    
    public LISTADOBLE() {
        this.inicio=null; //NO HAY NODOS EN LA LISTA
        this.fin=null;
        this.cont=0;
    }
    public boolean listaVacia(){
       if(inicio==null)
           return true;
         else
           return false;
    }
    
    public void imprimir(){ 
        if(listaVacia())
            System.out.println("LISTA VACIA");
        else{
        NODO temp = inicio;
            while(temp !=null) {
                System.out.print(temp.getValor() + " - ");
                temp= temp.getSiguiente();
            }
            System.out.println("");
        } 
    }
      public int tamaLISTA(){
            return cont;
    }
      public void add(int valor){
        NODO newNODO= new NODO(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if(inicio==null){  //NO HAY NODOS EN LA LISTA
            inicio= newNODO;
            fin =newNODO;
        } else {   
            fin.setSiguiente(newNODO);
            newNODO.setPrevio(fin);
            fin =newNODO;
        }
        cont++;
    }
      
    public void vaciarLISTA(){
        inicio=null;
        fin=null;
        cont = 0;
    }
    public void insertarEn(int valor, int pos) throws Exception{
        int cantNODOS = tamaLISTA();
        
        if(pos < 0){ 
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if(pos>cantNODOS) { 
            throw new Exception(pos + " no es una posicion valida en la lista");
            
        } else{
                    NODO nuevoNODO =new NODO(valor);
                 if(pos ==0){ 
                    nuevoNODO.setSiguiente(inicio);
                    inicio.setPrevio(nuevoNODO);
                    inicio = nuevoNODO;                  
               }else{
                     NODO temp=inicio;
                     int cont=0;
                     while(cont < pos){
                        temp=temp.getSiguiente();
                        cont++;
                     }
                     nuevoNODO.setSiguiente(temp);
                     nuevoNODO.setPrevio(temp.getPrevio());
                     temp.getPrevio().setSiguiente(nuevoNODO);
                     temp.setPrevio(nuevoNODO);
                     }
                 this.cont++;
                 } 
            }
}