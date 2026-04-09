package org.jafethperez.main;
import org.jafethperez.view.ViewMenuPrincipal;

/**
 *
 * @autor Jafeth Perez
 */
public class Main {
    public static void main(String[] args) {
        // Tipo de dato,nombre,valores
        //instanciar <- new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        
        System.out.print("Mi primer programa");
       menu.mostrarMenu();
    }
    
}
