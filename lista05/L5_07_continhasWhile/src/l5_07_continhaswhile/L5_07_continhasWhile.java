
package l5_07_continhaswhile;

import java.util.Scanner;


public class L5_07_continhasWhile {
      static Scanner input = new Scanner (System.in); 
  
    public static void main(String[] args) {
        /*7) Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
• Quantos números foram digitados (exceto o 0).
• A soma de todos os números.
• A média de todos os números.
        
        8) Melhore o programa da questão 7 para que ele não aceite que o usuário digite números
menores que 0. Quando isto acontecer, o programa deve solicitar que o usuário digite
novamente o valor e não deve considerar o número negativo nos cálculos.*/
       
       System.out.println("Caso deseje parar este programa, digite 0"); 
       
       int n; 
       int countPositivo=0;
       int somaPositiva=0;  
       
       
       do{
           n = leiaNumero(""); 
           
            if(n<0){
              n = leiaNumero("novamente");
            }
            else
                countPositivo++; 
                somaPositiva +=n;  
            
        } while(n!=0); 
       
        
       float media = (float) somaPositiva/(countPositivo); 
       mostraResultados(countPositivo, somaPositiva, media); 
       
       
    }
    public static int leiaNumero(String texto){
        System.out.print("\nDigite um numero inteiro positivo "+texto+": ");
        return Integer.parseInt(input.nextLine()); 
    }
    public static void mostraResultados(int count, int soma, float media){
        System.out.println("Contador: "+count);
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);
    } 
   
}
