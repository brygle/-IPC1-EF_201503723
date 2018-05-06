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
public class PruebaListaEnlazadaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         LDE lde = new LDE();
        //ingreso 6 usuarios
        lde.insertarInicio(new Usuario(1,"Juan"));
        lde.insertarInicio(new Usuario(2,"Marta"));
        lde.insertarInicio(new Usuario(3,"Carlos"));
        lde.insertarFinal(new Usuario(4,"Miguel"));
        lde.insertarInicio(new Usuario(5,"Paula"));
        lde.insertarInicio(new Usuario(6,"Angelica"));
        
        //imprimo longitud de la lista
        System.out.println("Size: " + lde.size());
        lde.mostrarElementos();
        
        //modifico usuario con id 1
        System.out.println("");
        lde.buscarYModificar(1, "David");
        lde.mostrarElementos();
        
        //imprimo el ultimo elemento
        System.out.println("ultimo elemento");
        lde.mostrarUltimo();
        System.out.println("");
        //elimino el elemento con id 5
        lde.buscarYEliminar(5);
        lde.mostrarElementos();
        System.out.println("");
         //elimino el elemento con id 4
        lde.buscarYEliminar(4);
        lde.mostrarElementos();
        System.out.println("ultimo elemento");
        //imprimo el ultimo elemento
        lde.mostrarUltimo();
    }
    
}
