package l5_13_fibinacci;   // fazer ainda 

import java.util.Scanner;

public class L5_13_fibinacci {
   static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
      /*13) A série de Fibinacci é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13 ...
Crie um programa que leia um número inteiro N (entre 3 e 20) e apresente a série de
Fibonacci até o enésimo termo. Se o número digitado pelo usuário não estiver entre o
intervalo 3 e 20 (inclusive), o programa deve solicitar que ele digite outro número.*/
      
      int n = leiaNumero(); 
      int fibinacci=0;  //sequencia 
      
       System.out.println(fibinacci);
       
        for (int i=1; i<=(n-1); i++){
           fibinacci = (i-1)+(i);
            System.out.println(fibinacci);
        }
        
    }
     public static int leiaNumero(){
        System.out.println("Digite um numero inteiro entre 3 e 20: ");
         return Integer.parseInt(input.nextLine());
     } 
}


