/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.listadoblementeenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author julio.nava
 */
public class Main {
    
    public static void main(String args[]) {
        ListaDoble listaDoble = new ListaDoble();
        int opcion = 0, elemento;
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un Nodo al Inicio\n" + 
                        "2. Agregar un Nodo al Final\n" +
                        "3. Mostrar la Lista de Inicio a Fin\n" + 
                        "4. Mostrar la lista de Fin a Inicio\n" + 
                        "5. Eliminar un Nodo del Inicio\n" + 
                        "6. Eliminar un Nodo del Final\n" + 
                        "7. Salir\n" + 
                        "¿Que deseas hacer?", "Menú de opciones", JOptionPane.INFORMATION_MESSAGE));
                
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo", 
                                "Agregar nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo", 
                                "Agregar nodo al final", JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if(!listaDoble.estaVacia()) {
                            listaDoble.mostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listaDoble.estaVacia()) {
                            listaDoble.mostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!listaDoble.estaVacia()) {
                            elemento = listaDoble.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento, "Eliminando Nodo del Inicio", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!listaDoble.estaVacia()) {
                            elemento = listaDoble.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento, "Eliminando Nodo del Final", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;    
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no está en el menú", "Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
            }
        }while(opcion != 7);
    }
    
}
