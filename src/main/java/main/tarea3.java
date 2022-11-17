package main;


import java.util.Scanner;

public class tarea3 {
    static Scanner src = new Scanner(System.in); 

    public static void main(String[] args) {
            int opcion;
      
        
        System.out.println("TAREA 3");
        
         
         System.out.println("ejercicio 1");
         System.out.println("ejercicio 2");
         System.out.println("ejercicio 3");
         System.out.println("ejercicio 4");
         System.out.println("ejercicio 5");
         System.out.println("Salir");
         System.out.println("Ingrese el numero de ejercicio:");
         opcion = src.nextInt();
            
         switch (opcion) {
             
             case 1:
                     ejer1.ejercicio1();
                     break;
             case 2:
                    ejer2.ejercicio2();
                    break;
            
            case 3:
                    ejer3.ejercicio3();
                    break;       
            case 4:
                    ejer4.ejercicio4();
                    break;
                    
            case 5:
                    ejer5.ejercicio5();
                    break;
           }               
    }

     
    
    
    
}
