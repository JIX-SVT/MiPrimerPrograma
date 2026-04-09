package org.jafethperez.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    //Global 
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);
    
    public void mostrarMenu(){
     //Local
     while (opcionMenu == 0){
         System.out.println("Bienvenido,seleccione una opción:");
         opcionMenu = Integer.parseInt(leer.nextLine());   
     }
    }
    
    public void mostrarMenuMatematica(){
        System.out.println("Menu de operaciones matemáticas");
    }
}
