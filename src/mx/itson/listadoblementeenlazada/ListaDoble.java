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
public class ListaDoble {
    
    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }
    
    public boolean estaVacia() {
        return inicio == null;
    }
    
    public void agregarAlFinal(int el) {
        if(!estaVacia()) {
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void agregarAlInicio(int el) {
        if(!estaVacia()) {
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void mostrarListaInicioFin() {
        if(!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrarListaFinInicio() {
        if(!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando lista de Fin a Inicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public int eliminarDelInicio() {
        int elemento = inicio.dato;
        if(inicio == fin) {
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    public int eliminarDelFinal() {
        int elemento = fin.dato;
        if(inicio == fin) {
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }
    
}
