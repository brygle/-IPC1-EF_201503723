/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalistaenlazadadoble;

/**
 *
 * @author Bryan
 */
public class Usuario {
    Usuario anterior;
    Usuario siguiente;
    int id;
    String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        anterior = null;
        siguiente =null;
    }

    public Usuario getAnterior() {
        return anterior;
    }

    public void setAnterior(Usuario anterior) {
        this.anterior = anterior;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
