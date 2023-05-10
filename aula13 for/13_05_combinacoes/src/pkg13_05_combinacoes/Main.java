package pkg13_05_combinacoes;

import java.util.Scanner;

public class Main {
      static Scanner input = new Scanner (System.in);
      
      
    public static void main(String[] args) {
        /*5: Crie um programa que calcule a quantidade de
combinações que podem ser feitas considerando um
conjunto de n elementos agrupados p a p.*/
        
        //C = n! / p! (n-p)!; 
        
        int n = leiaNumero("Digite a quantidade de elementos (n): ");
        int p = leiaNumero("Digite a quantidade de elementos por grupo (p): ");
        int fatorialN = calculaFatorial(n); 
        int fatorialP = calculaFatorial(p);
        int fatorialNP = calculaFatorial(n-p); 
        
        int combinacoes = fatorialN/(fatorialP*fatorialNP);  //C = n! / p! (n-p)!; 
        System.out.println("Total de combinacoes = "+combinacoes);
        
    }
      public static int leiaNumero(String texto){
        System.out.print(texto);
        return Integer.parseInt(input.nextLine()); 
      }   
      
      public static int calculaFatorial(int x){
       int fat = 1; 
       for (int i=x;i>1; i--){
           fat = fat*i; 
       }
       return fat; 
   }
}

