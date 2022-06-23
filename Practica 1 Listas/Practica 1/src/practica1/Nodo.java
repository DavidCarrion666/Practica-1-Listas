/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author SALA A
 */
public class Nodo {

    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int d, Nodo s, Nodo a) {
        dato = d;
        siguiente = s;
        anterior = a;
    }
    
    public Nodo(int d){
        this (d, null, null);
    }

  
}
