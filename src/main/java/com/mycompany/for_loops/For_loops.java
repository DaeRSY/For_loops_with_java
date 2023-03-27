/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for_loops;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author aadiy
 */
public class For_loops{

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
      /*  int i;
        for(i = 0;i<5;i++){
            System.out.println(i);
        }*/
      
      /* for(int i = 0; i<5 ; i++){
          System.out.println(i);
      }*/
      
     /* for(int i = 10;i >=0;i--){
          System.out.println("i = "+i);
      }*/
      
    /* int i = 0;
     int j = 10;
     
     for(; i<=10 & j>=0; i++,j-- ){
         System.out.println("i = "+i+" j = "+j);
     }*/
     
   /* int i = 2;
     
    for(; i<100 ;i *=2){
        System.out.println(i);
    }*/
    
        System.out.println("Please enter a number for calculate factorial (maks:12)");
    
        int factorial = 1;
        
        int number = scanner.nextInt();
        
        if(number <13){
            for(int i = 1; i<=number;i++){
            factorial *=i;
            System.out.println("Number "+ i +" Factorial is = "+factorial);
        }
        System.out.println("Factorial is = "+factorial);
        
        }
        else{
            System.out.println("wrong number");
        }
        
        
    }
}
