package l4_12_menorNumero;

import java.util.Scanner;

public class L4_12_menorNumero {
    static Scanner input = new Scanner (System.in); 
    
 
    public static void main(String[] args) {
      
       /* 12) Faça um programa que leia 3 números inteiros distintos e envie-os para uma função
que retornará o menor deles.*/
       
       int n1 = leiaNumero(); 
       int n2 = leiaNumero(); 
       int n3 = leiaNumero(); 
       int menor = retorneMenor(n1, n2, n3); 
       int menor2 = retorneMenorPreguicoso(n1, n2, n3); 
       
        System.out.println("O menor numero e "+menor);
        System.out.println("O menor numero e "+menor2);
       
       
    }
    public static int leiaNumero(){
        System.out.println("Digite um numero");
        return Integer.parseInt(input.nextLine()); 
    } 
    public static int retorneMenor(int n1, int n2, int n3){
        
        if (n1<n2 && n1<n2){
            return n1; 
        }
        else if (n2<n3){
        return n2; 
        }
        else return n3; 
    }
    public static int retorneMenorPreguicoso(int n1, int n2, int n3){
        return Math.min(
                Math.min(n1, n2), n3); 
    }
}

