/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean bandera = true;
        System.out.println("------------------------------------------------");
        System.out.println("            ** Interfaz **");

        do {
            opcion = interfaz();
            switch (opcion) {
                case 1:
                    insertarNodo();
                    break;
                case 2:
                    eliminarNodo();
                    break;
                case 3:
                    mostrarListaOrdenada();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    bandera = false;
                    break;

            }

        } while (bandera);
    }

    public static int interfaz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Insertar un nuevo Nodo:         [1]");
        System.out.println("Para Eliminar un Nodo :         [2]");
        System.out.println("Mostrar La Lista      :         [3]");
        System.out.println("Salir del programa    :         [4]");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static void insertarNodo() {
        Scanner sc = new Scanner(System.in);
        Operaciones insertar = new Operaciones();
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese un valor entero para el nuevo nodo");
        int valor = sc.nextInt();       
        insertar.insertarNodo(valor);
        
    }

    public static void eliminarNodo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el valor que desea eliminar");
        
        
        int valor = sc.nextInt();

    }

    public static void mostrarListaOrdenada() {
        Operaciones mostrar = new Operaciones();
        System.out.println("------------------------------------------------");
        
        mostrar.mostrarListaOrdenada();
        
        
    }

}
