package L4_02_continhas;

import java.util.Scanner;

public class L4_02_continhas {
    static Scanner input = new Scanner (System.in); 

    public static void main(String[] args) {
       
      /*  2) Faça um programa que leia dois números inteiros, calcule e apresente:
- Soma dos números.
- Subtração do primeiro pelo segundo.
- Multiplicação dos números.
- Divisão do primeiro pelo segundo.
Elabore uma função para efetuar cada operação. As funções devem receber por
parâmetro os dois números e retornar o resultado usando o comando return.*/
      
       int n1 = leiaNumero("primeiro"); 
       int n2 = leiaNumero("segundo");
       int soma = calculaSoma(n1, n2); 
       int sub = calculaSubtracao(n1, n2); 
       int mult = calculaMultiplicacao(n1, n2); 
       float div = calculaDivisao(n1, n2); 
       mostraResultados(soma, sub, mult, div);
       
       
    }
    public static int calculaSoma (int n1, int n2){
        return n1+n2; 
    }
     public static int calculaSubtracao (int n1, int n2){
        return n1-n2; 
     }
      public static int calculaMultiplicacao (int n1, int n2){
        return n1*n2; 
      }  
       public static float calculaDivisao (int n1, int n2){
        return (float) n1/n2; 
       }
       public static void mostraResultados(int soma, int sub, int mult, float div){
           System.out.println("Soma = "+soma);
           System.out.println("Subtracao = "+sub);
           System.out.println("Multiplicacao = "+mult);
           System.out.println("Divisao = "+div);
       }
       public static int leiaNumero(String texto){
           System.out.println("Digite o " +texto+ " numero: ");
           return Integer.parseInt(input.nextLine());
           
       }
}
