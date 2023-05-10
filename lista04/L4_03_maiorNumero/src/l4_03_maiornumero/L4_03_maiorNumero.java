package l4_03_maiornumero;

import java.util.Scanner;

public class L4_03_maiorNumero {
 static Scanner input = new Scanner (System.in); 
    
    public static void main(String[] args) {
        
        /*3) Crie uma função que receba dois números reais como parâmetro e retorne o maior
deles. Elabore um programa que leia dois valores e apresente o maior, usando esta
função.*/
        
       float numero1 = leiaNumeros("primeiro"); 
       float numero2 = leiaNumeros("segundo"); 
       verificaMaior(numero1, numero2);  
        
    }
     public static float leiaNumeros(String texto){
        System.out.println("Digite o "+texto+" numero: ");
            return Float.parseFloat(input.nextLine());
     }       
    public static void verificaMaior(float n1, float n2){
        if (n1>n2){
            System.out.println(n1+ " maior que "+n2);
        }
        else if (n2>n1){
            System.out.println(n2+ " maior que "+n1);
        }
        else 
            System.out.println("Os numeros sao iguais");
        
    }    
    
}
