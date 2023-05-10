package pkg13_ex_for;  //FOR

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner (System.in); 
    
    
    public static void main(String[] args) {
        // soma = somatorio total dos digitados
        // cont Positivo = quantos positivos foram digitados
        // cont Negativo = quantos negativos foram digitados 
        
       int i, num, quadrado, soma=0, contPositivo=0, contNegativo=0;  
        
        // leia 10 numeros e apresente o resultado ao quadrado; 
          System.out.print("Quantos numeros voce quer digitar:  ");
            int n = Integer.parseInt(input.nextLine());
            
        for (i=0; i<n; i++){
             num = leiaNumero();
             soma = soma + num;  // soma = somatorio total dos digitados
             if(num>=0){
                 contPositivo = contPositivo +1;  // cont Positivo = quantos positivos foram digitados
             }
             else 
                 contNegativo++;  // cont Negativo = quantos negativos foram digitados 

             quadrado = num*num;
        System.out.println("Quadrado de " +num+" = "+quadrado);
        }
        
        System.out.println("\nSoma final = "+soma);
        System.out.println("Cont Positivo = "+contPositivo);
        System.out.println("Cont Negativo = "+contNegativo);
    }
    public static int leiaNumero(){
        System.out.print("Digite um numero: ");
        return Integer.parseInt(input.nextLine()); 
    }
}

