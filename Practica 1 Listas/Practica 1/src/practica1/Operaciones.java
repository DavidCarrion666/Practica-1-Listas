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

    Nodo inicio, fin = null;

    public boolean vacio() {
        return inicio == null;
    }

    public void insertarNodo(int data) {
        Nodo newNodo = new Nodo(data);

        if (inicio == null) {
            inicio = fin = newNodo;
            inicio.anterior = null;
            fin.siguiente = null;

        } else {
            fin.siguiente = newNodo;
            newNodo.anterior = fin;
            fin = newNodo;
            fin.siguiente = null;

        }
    }

    public void eliminarNodo() {

    }

    public void mostrarListaOrdenada() {
        if (!vacio()) {
            String puntero = "";
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                puntero = puntero + "(" + auxiliar.dato + ") <==>";
                auxiliar = auxiliar.siguiente;
            }
            System.out.println(puntero + null + "Mostrando lista de inicio a fin");
        }
    }
}
