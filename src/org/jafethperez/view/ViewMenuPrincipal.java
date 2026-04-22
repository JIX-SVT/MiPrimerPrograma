package org.jafethperez.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    //Global
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);

    public void mostrarMenu() {
        while (opcionMenu == 0) {
            System.out.println("Bienvenido al: ");
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones de texto");
            System.out.println("3. Operaciones de lógica");
            System.out.println("4. Salir");
            System.out.print("Ingresa la opción: ");
            
            opcionMenu = Integer.parseInt(leer.nextLine());

            switch (opcionMenu) {
                case 1:
                    mostrarMenuMatematica(); 
                    break; 
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4: System.out.println("Saliendo..");
                    opcionMenu = 4;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}