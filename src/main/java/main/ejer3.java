
package main;

import java.util.Scanner;


public class ejer3 {
     public static void ejercicio3(){
     Scanner src = new Scanner(System.in); 
     int n1;
         System.out.println("ingrese numero entero");  
         n1 = src.nextInt();
         while (n1 != 0){
             if ( n1 % 2 == 0 ){
                 System.out.println(" el numero " + n1 + " es par");
                 System.out.println("ingrese numero entero");  
                n1 = src.nextInt();
             }
             else{
                 System.out.println(" el numero " + n1 + " es inpar");
                 System.out.println("ingrese numero entero");  
                n1 = src.nextInt();
             }
             
         }
         
     }
    
}
