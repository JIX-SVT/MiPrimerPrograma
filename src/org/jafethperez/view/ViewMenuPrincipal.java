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
            System.out.println("1. Operaciones matemáticas (1-10)");
            System.out.println("2. Operaciones de texto (11-20)");
            System.out.println("3. Operaciones de lógica (21-30)");
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
    public void mostrarMenuMatematica() {
        System.out.println("Menú Matemática");
        System.out.println("1.calculadora salario");
        System.out.println("2.Área de un triangulo");
        System.out.println("3.Promedio Académico");
        System.out.println("4.Convertidor de Temperatura");
        System.out.println("5.Perímetro de circulo");        
        System.out.println("6.Volumen de un Cilindro");
        System.out.println("7.Hipotenusa");
        System.out.println("8.Días a Minutos");
        System.out.println("9.Resto de División");
        System.out.println("10.Potencia al Cubo");
    }
    public void mostrarMenuTexto() {
        System.out.println("Menú de Texto ");
        System.out.println("1.Concatenador de Nombre");
        System.out.println("2.Contador de Longitud");
        System.out.println("3.Inversor de Texto");
        System.out.println("4.Detector de Vocales");
        System.out.println("5.Extractor de Iniciales");
        System.out.println("6.Normalizador a Mayúsculas");
        System.out.println("7.Conversor Binario");
        System.out.println("8Repetidor de Palabras");
        System.out.println("Validador de Password");
        System.out.println("Generador de Email");
    }
}