/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.listadoblementeenlazada;

/**
 *
 * @author julio.nava
 */
public class NodoDoble {
    
    public int dato;
    public NodoDoble siguiente, anterior;

    public NodoDoble(int el, NodoDoble s, NodoDoble a) {
        this.dato = el;
        this.siguiente = s;
        this.anterior = a;
    }

    public NodoDoble(int el) {
        this(el, null, null);
    }
    
}
