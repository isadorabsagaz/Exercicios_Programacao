/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_04_raizimaginaria;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
       /* 11.4. Sabe-se que não existe raiz quadrada de
números negativos no domínio dos números reais. Por isto,
associa-se este valor a um número imaginário. Crie um
programa que leia um número inteiro e calcule a sua raiz
quadrada. Caso o valor digitado seja negativo, o programa deve
imprimir uma mensagem “Imaginário”*/
       
       System.out.println("Digite um numero inteiro");
       int numero = Integer.parseInt(input.nextLine());
       
       if (numero>0){
       double raiz = Math.sqrt(numero); 
           System.out.println("Raiz quadrada de "+numero+" = "+raiz);
       }
       else 
            System.out.println("Imaginario");
       
    }
    
}
