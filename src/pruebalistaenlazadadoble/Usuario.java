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
        siguiente = null;
    }

    //devuelve el usuario anterior a el en la lista
    public Usuario obtenerAnterior() {
        return anterior;
    }
    //crea el enlace anterior
    public void enlazarAnterior(Usuario anterior) {
        this.anterior = anterior;
    }
    
    //devuelve el usuario siguiente a el en la lista
    public Usuario obtenerSiguiente() {
        return siguiente;
    }
    //crea el enlace siguiente
    public void enlazarSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }
    //obtener el id
    public int getID() {
        return id;
    }
    //obtener el nombre
    public String getNombre() {
        return nombre;
    }
    //establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
