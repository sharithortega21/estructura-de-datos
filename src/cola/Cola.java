/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author USUARIO
 */
public class Cola {
    ///VARIABLES DE INICIALIZACION
    private Object [ ] colaArr; /// arreglo que contiene los elementos 
    private int tamanioMax; ///guarda tamañao maxiimo
    private int frente;
    private int fin;
    private int numElems;
    
    //constructor - inicializacion los valores de la cola 
    public Cola(int tamanio){
        tamanioMax=tamanio;
        colaArr= new Object[tamanioMax];
        fin = -1;
        frente= 0;
        numElems= 0;
    }
    ////////////insertar//////////////////
    ///////////////////////////inserta el eelemnto al final de la cola 
    public void insertar (Object elemento){
        if (fin ==tamanioMax-1){
            fin= -1;
        }
        fin++;
        colaArr[fin]=elemento;
        numElems++;
    }
    //////retira el elemento que se encuentra al frnete de la cola 
    public Object quitar(){
        Object temp= colaArr [frente];
        frente+=1;
        if (frente == tamanioMax){
            frente =0;
        }
        numElems--;
        return temp;
    }
    ////////////////// devuelve el elemento que esta al frente de la cola 
    public Object frenteCola(){
        return colaArr[frente];
    }
    //////////cola vacia/////////////////////////////////////////////////////////
    ////////// devuekve true  si la cola esta vacia 
    
    public boolean colaVacia(){
        return (numElems==0);
    }
    ////////////77cola llena 
    /////// devuelve true si la cola esta llena 
    public boolean colaLlena(){
        return (numElems==tamanioMax);
    }
    //////////////////7tamaño de la cola 
    ///////devuelve el numero de elementos que tiene la cola 
    
   public int tamanioCola(){
       return numElems;
   }
       
        
}


