package main;


import java.util.Scanner;


public class ejer1 {
     
     public static void ejercicio1(){
     Scanner src = new Scanner(System.in); 
     int cuadrado, n1;
         System.out.println("ingrese numero");
     n1 = src.nextInt();
     while (n1  >=  0){
         cuadrado = n1*n1;
         System.out.println("el cuadrado del numero " + n1 +" es: " + cuadrado);
         System.out.println("ingrese numero");
     n1 = src.nextInt();
         
     }
     
  }
   
}
