
package l5_04_tabuada;

import java.util.Scanner;

public class L5_04_tabuada {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 4) Faça um programa que leia um número inteiro e apresente a sua tabuada.
         
       int n = leiaNumero(); 
        System.out.println("Tabuada de "+n+":");
        for(int i=1; i<=10; i++){
            int tabuada = i*n; 
            System.out.println(tabuada);
        }
        
    }
    public static int leiaNumero(){
    System.out.println("Digite um numero inteiro entre 1 e 100: ");
        return Integer.parseInt(input.nextLine());
    }
}
