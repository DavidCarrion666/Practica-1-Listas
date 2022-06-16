/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author SALA A
 */
public class Operaciones {
    
    Nodo head, tail = null;
    

    public void insertarNodo(int data) {
        Nodo newNodo = new Nodo(data);

        if (head == null) {
            head = tail = newNodo;
            head.previous = null;
            tail.next = null;

        }else{
            tail.next = newNodo;
            newNodo.previous = tail;
            tail = newNodo;
            tail.next = null;

        }
    }
    
    public void eliminarNodo(){
    
    
    }
    
    
    public void mostrarListaOrdenada(){
        
    }
}
