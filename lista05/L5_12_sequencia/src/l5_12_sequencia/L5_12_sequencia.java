package l5_12_sequencia;

import java.util.Scanner;

public class L5_12_sequencia {
   static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        /*12) Faça um programa que leia um número inteiro positivo (N), calcule e apresente o valor
de A, que é dado pela seguinte fórmula:*/
        
       float a=0, divisao;  
       int n = leiaNumero(); 
       
       for(int i=1; i<=n; i++){
           divisao = (float) 1/i; 
           a+= divisao;  
       }
        System.out.println("Resultado da formula A = "+a);
    }
       public static int leiaNumero(){
        System.out.println("Digite um numero inteiro: ");
         return Integer.parseInt(input.nextLine());
     } 

}


