
package l5_09_maiormenor;

import java.util.Scanner;


public class L5_09_maiorMenor {
     static Scanner input = new Scanner (System.in);
     
    public static void main(String[] args) {
        /*9) Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
- O maior número digitado;
- O menor número digitado.*/
        
        int n, x, maior=0, menor=0; 
        
        System.out.println("Caso deseje parar este programa, digite 0"); 
        
        n=leiaNumero(); 
        
        do{
            x = leiaNumero();
                if(x!=0){
                maior = Math.max(n,x); 
                menor = Math.min(n,x);
                }
        }while(x!=0); 
        
        System.out.println("Maior numero digitado: "+maior);
        System.out.println("Menor numero digitado: "+menor);
        
        
    }
     public static int leiaNumero(){
        System.out.print("\nDigite um numero inteiro positivo: ");
        return Integer.parseInt(input.nextLine()); 
    }
    
}
