
package pkg12_05_raiz;

import java.util.Scanner;

public class Main {
    
   static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        
      /*  12.4: Elabore um programa que leia um número
inteiro e passe-o para uma função que calculará a sua raiz
quadrada. A função deve retornar true se a raiz for um
número inteiro e false se o resultado não for inteiro. Em
seguida, o programa deve apresentar uma mensagem
indicando se o valor da raiz é um número inteiro ou não.*/
      
        System.out.println("Digite um numero inteiro: ");
        int n = Integer.parseInt(input.nextLine());
        
        boolean inteiro = verificaRaiz(n); 
        
        if (inteiro == true){
            System.out.println("O valor da raiz e inteiro");
        }
        else 
            System.out.println("A raiz e decimal");
       
    }
    public static boolean verificaRaiz (int n){
        
        double raiz = Math.sqrt(n); 
        boolean numeroInteiro = n%raiz==0;
        return numeroInteiro; 
    }
    
}
