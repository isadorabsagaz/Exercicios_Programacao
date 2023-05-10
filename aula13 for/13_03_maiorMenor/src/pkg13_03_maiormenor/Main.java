package pkg13_03_maiormenor;

import java.util.Scanner;


public class Main {
  static Scanner input = new Scanner (System.in);
  
    public static void main(String[] args) {
        
      /*  3: Faça um programa que leia um conjunto com n
números inteiros e apresente o maior e o menor número.*/
      
      int n = leiaNumeroElementos();
      int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE; 
      
      for(int i=1; i<=n; i++){
          System.out.println("Digite o elemento "+i);
          int elemento = Integer.parseInt(input.nextLine());
         
          if(elemento>maior){
              maior = elemento; 
          }
          if (elemento<maior){
              menor = elemento; 
          }
      }
      
        System.out.println("Maior elemento: "+maior);
        System.out.println("Menor elemento: "+menor);
    }
     public static int leiaNumeroElementos(){
        System.out.println("Digite o numero de elementos do conjunto: ");
         return Integer.parseInt(input.nextLine());
     }
     
}

