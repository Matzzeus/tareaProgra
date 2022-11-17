
package main;

import java.util.Scanner;


public class ejer5 {
 public static void ejercicio5(){
 Scanner src = new Scanner(System.in);     
     
    int suma = 0;
    int num = 0;
    do{
        System.out.println(" ingrese numero ");
        num = src.nextInt();
        suma += num;
        
        
        
        
    } while( num != 0 );
     
     System.out.println(" la suma de todos los numeros es: " + suma);
 }
    
    
    
    
    
}
