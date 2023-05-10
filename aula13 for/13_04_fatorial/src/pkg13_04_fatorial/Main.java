package pkg13_04_fatorial;

import java.util.Scanner;


public class Main {
     static Scanner input = new Scanner (System.in);
  
    public static void main(String[] args) {
       /*Crie um programa que calcule o fatorial de dois
números inteiros positivos e apresente a soma destes
valores.*/
       
      int num1= leiaNumero(); 
      int num2 = leiaNumero(); 
      int fatorial1= calculaFatorial(num1); 
      int fatorial2= calculaFatorial(num2); 
      int soma = fatorial1 + fatorial2; 
        System.out.println("Soma fatoriais = "+soma);
       
    }
   public static int leiaNumero(){
        System.out.print("Digite um numero: ");
        return Integer.parseInt(input.nextLine()); 
   }
   public static int calculaFatorial(int n){
       int fat = 1; 
       for (int i=n;i>1; i--){
           fat = fat*i; 
       }
       return fat; 
   }
}
