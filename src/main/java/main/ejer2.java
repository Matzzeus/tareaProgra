
package main;

import java.util.Scanner;

public class ejer2 {
    public static void ejercicio2(){
         Scanner src = new Scanner(System.in); 
          int  n1;
         System.out.println("ingrese numero");
     n1 = src.nextInt();
     
     
     while (n1 != 0){
         
         if (n1 > 0){
             System.out.println("el numero ingresado: " + n1 +" es postivo");
             System.out.println("ingrese numero");
            n1 = src.nextInt();
         }
         else if (n1<0){
             System.out.println("el numero ingresado: " + n1 +" es negativo");
             System.out.println("ingrese numero");
            n1 = src.nextInt();
         }
         
         
     }

    
    
}
    
}
