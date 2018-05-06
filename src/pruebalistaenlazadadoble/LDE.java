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
public class LDE {
    Usuario inicio;
    Usuario fin;
    int size;

    public LDE() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }
    
    public int size() {
        return size;
    }

    //insertar usuarios al inicio de la lista
    public void insertarInicio(Usuario nuevo) {
        if (size == 0) {
            inicio = nuevo;
            fin = nuevo;
            size++;
        } else {
            Usuario temporal = inicio;
            int i = 0;
            boolean bandera = false;
            while (bandera == false && i < size) {
                if (temporal.getID() == nuevo.getID()) {
                    bandera = true;
                } else {
                    temporal = temporal.obtenerSiguiente();
                    i++;
                }
            }
            if (bandera == false) {
                nuevo.enlazarSiguiente(inicio);
                inicio.enlazarAnterior(nuevo);
                inicio = nuevo;
                size++;
            } else {
                System.out.println("Ya existe un usuario con el ID: " + nuevo.getID());
            }
        }
    }

    //insertar usuarios al final de la lista
    public void insertarFinal(Usuario nuevo) {
        if (size == 0) {
            inicio = nuevo;
            fin = nuevo;
            size++;
        } else {
            Usuario temporal = inicio;
            int i = 0;
            boolean bandera = false;
            while (bandera == false && i < size) {
                if (temporal.getID() == nuevo.getID()) {
                    bandera = true;
                } else {
                    temporal = temporal.obtenerSiguiente();
                    i++;
                }
            }
            if (bandera == false) {
                fin.enlazarSiguiente(nuevo);
                nuevo.enlazarAnterior(fin);
                fin = nuevo;
                size++;
            } else {
                System.out.println("Ya existe un usuario con el ID: " + nuevo.getID());
            }
        }
    }
    //imprime en consola todos los elementos
    public void mostrarElementos(){
        Usuario temporal = inicio;
        for(int i = 0 ; i<size; i++){
            if(i>0){
                temporal = temporal.obtenerSiguiente();
            }
            System.out.println("ID: " + temporal.getID() + "\tNombre: " + temporal.getNombre());
        }
    }
    //busca un usuario por id y lo modifica
    public void buscarYModificar(int id, String nombre){
        Usuario temporal = inicio;
        int i = 0;
        while (temporal.getID() != id && i < size - 1) {
            temporal = temporal.obtenerSiguiente();
            i++;
        }
        if (temporal.getID() == id) {
            temporal.setNombre(nombre);
        } else {
            System.out.println("El numero de id " + id + " no existe");
        }
    }
    
    //muestra el ultimo elemento de la lista
    public void mostrarUltimo() {
        System.out.println("ID: " + fin.getID() + "\tNombre: " + fin.getNombre());
    }
    //busca un usuario por id y lo elimina
    public void buscarYEliminar(int id) {
        Usuario temporal = inicio;
        boolean bandera = false;
        int i = 0;

        while (i < size && bandera == false) {
            if (temporal.getID() == id) {
                bandera = true;
            } else {
                temporal = temporal.obtenerSiguiente();
                i++;
            }
        }

        if (bandera == true) {
            if (temporal.getID() == inicio.getID()) {
                inicio = inicio.obtenerSiguiente();
                inicio.obtenerAnterior().enlazarSiguiente(null);
                inicio.enlazarAnterior(null);
                size--;
            } else if (temporal.getID() == fin.getID()) {
                fin = fin.obtenerAnterior();
                fin.obtenerSiguiente().enlazarAnterior(null);
                fin.enlazarSiguiente(null);
                size--;
            } else {
                temporal.obtenerAnterior().enlazarSiguiente(temporal.obtenerSiguiente());
                temporal.obtenerSiguiente().enlazarAnterior(temporal.obtenerAnterior());
                temporal.enlazarAnterior(null);
                temporal.enlazarSiguiente(null);
                size--;
            }

        } else {
            System.out.println("El usuario con ID: " + id + " no existe.");
        }
    }

    
    
    
}
