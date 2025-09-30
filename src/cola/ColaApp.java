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
public class ColaApp {
    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insertar(10);
        cola.insertar(15);
        cola.insertar(20);
        cola.insertar(25);
while(!cola.colaVacia()){
    Object n=cola.quitar();
    System.out.print("Elemento retirado: "+ n);
    System.out.println("");
}

cola.insertar("carlos");
cola.insertar("amiguito");
cola.insertar("Miguel");
cola.insertar("Yeison");

        System.out.println("");
        System.out.println("Elemento en la cabeza de la cola");
        System.out.println( cola.frenteCola());
        System.out.println("");
        
        System.out.println("La cola esta vacia? ");
        System.out.println(cola.colaVacia());
        
        System.out.println("La cola esta llena?");
        System.out.println(cola.colaLlena());
        
        while(!cola.colaVacia()){
    Object n=cola.quitar();
    System.out.print("Elemento retirado: "+ n);
    System.out.println("");
        }
    }
}