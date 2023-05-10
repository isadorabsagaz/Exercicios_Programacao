
package l4_05_parimpar;

import java.util.Scanner;

public class L4_05_parImpar {
 static Scanner input = new Scanner (System.in); 
 
    public static void main(String[] args) {
        
        /*5) Faça um programa que leia um número inteiro N e passe-o por parâmetro para uma
função que deve apresentar uma mensagem indicando se N é par ou ímpar.*/
        
        int numero = leiaNumeros(); 
        verificaParidade(numero); 
        
    }
     public static int leiaNumeros(){
        System.out.println("Digite um numero: ");
            return Integer.parseInt(input.nextLine());
     }      
      public static void verificaParidade(int n){
          if (n%2==0){
              System.out.println(n+" e um numero par");
          }
          else 
              System.out.println(n+" e um numero impar");
      }
}
