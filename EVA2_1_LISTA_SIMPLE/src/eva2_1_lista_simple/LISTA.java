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
    private NODO fin;  
    private int cont;
//se hacen privados 
    
    //POR DEFAULT LA LISTA ESTA VACIA
    public LISTA() {
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
        //COMO MUEVO A TEMP?
            while(temp !=null) {
                System.out.print(temp.getValor() + " - ");
                temp= temp.getSiguiente();
            }
            System.out.println("");
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
        cont++;
    }
    public int tamaLISTA(){
       /* int cont=0;
    
         NODO temp = inicio;
        //COMO MUEVO A TEMP?
            while(temp !=null) {
                cont++;
                temp= temp.getSiguiente();
            } */  
            return cont;
    }

    public void insertarEn(int valor, int pos) throws Exception{
        int cantNODOS = tamaLISTA();
        //QUE DEBEMOS HACER?  INSERTAR EN UNA POSICION NO VALIDA
        
        if(pos < 0){ //POSICIONES NEGATIVAS
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if(pos>cantNODOS) { //POSICIONES MAYORES A LA CANTIDAD DEL ELEMENTOS
            throw new Exception(pos + " no es una posicion valida en la lista");
            
        } else{
                    NODO nuevoNODO =new NODO(valor);
                 if(pos ==0){ //insertar la inicio de la lista
                    nuevoNODO.setSiguiente(inicio);
                    inicio = nuevoNODO;                  
               }else{
                     NODO temp=inicio;
                     int cont=0;
                     while(cont < (pos - 1)){
                        temp=temp.getSiguiente();
                        cont++;
                     }
                     nuevoNODO.setSiguiente(temp.getSiguiente());
                     temp.setSiguiente(nuevoNODO);
                     }
                 this.cont++;
                 } 
            }
    public void vaciarLISTA(){
        inicio=null;
        fin=null;
        cont = 0;
    }
    public void borrarEn(int pos) throws Exception {
    int cantNODOS = tamaLISTA();
        //QUE DEBEMOS HACER?  INSERTAR EN UNA POSICION NO VALIDA
        
        if(pos < 0){ //POSICIONES NEGATIVAS
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if(pos>=cantNODOS) { //POSICIONES MAYORES A LA CANTIDAD DEL ELEMENTOS
            throw new Exception(pos + " no es una posicion valida en la lista");
            
        } else{
            //PENSAR EN QUE PUEDE SALIR MAL
         if(cantNODOS==1){
             vaciarLISTA();
         } else{
             //borrar el primer nodo
             if(pos==0){
                 inicio = inicio.getSiguiente();
             //borrar el nodo intermedio     
              }else{
                 NODO temp=inicio;
                     int cont=0;
                     while(cont < (pos - 1)){
                        temp=temp.getSiguiente();
                        cont++;     
            }
                     //ya estoy en modo previo
                     NODO objSig=temp.getSiguiente();
                     temp.setSiguiente(temp.getSiguiente().getSiguiente());
                     if(pos== (cantNODOS - 1)){ //RECONECTAR A FIN
                     fin=temp;
            }     
          }
             this.cont--;
        }
      }
    }
    public int obtenerValorEn(int pos) throws Exception{
        int cantNODOS = tamaLISTA();
        int valor = 0;
        //QUE DEBEMOS HACER?  INSERTAR EN UNA POSICION NO VALIDA
        
        if(pos < 0){ //POSICIONES NEGATIVAS
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if(pos>=cantNODOS) { //POSICIONES MAYORES A LA CANTIDAD DEL ELEMENTOS
            throw new Exception(pos + " no es una posicion valida en la lista");
            
        } else{
         NODO temp=inicio;
                     int cont=0;
                     while(cont < (pos)){  //cambio fue quitarle pos-1 en else if
                        temp=temp.getSiguiente();
                        cont++;
             }
               valor=temp.getValor();
         }
        return valor;
      }
    }