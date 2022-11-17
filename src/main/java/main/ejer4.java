
package main;

import java.util.Scanner;


public class ejer4 {
     public static void ejercicio4(){
         Scanner src = new Scanner(System.in); 
         int rando, nusuario;
         rando = (short) (10*Math.random()+1);
         System.out.println(" adivina el número que estoy pensando ;D"  );
         nusuario = src.nextInt();
         while ( nusuario<=10){
         if ( nusuario ==rando){
             System.out.println(" GANOOOOOO!");
             break;
         }    
         else if (rando > nusuario  ){
           System.out.println("El numero a adivinar es mayor.");
           System.out.println("ingrese otro numero");
           nusuario = src.nextInt();
         }
         else{
             System.out.println("El numero a adivinar es menor.");
             System.out.println("ingrese otro numero");
             nusuario = src.nextInt();
         }    
             
         }
     }
    
}
