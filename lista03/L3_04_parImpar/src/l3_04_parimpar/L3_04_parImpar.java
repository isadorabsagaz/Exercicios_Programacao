/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_04_parimpar;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_04_parImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
      //  4) Faça um programa que leia um número inteiro N e apresente uma mensagem
      //      indicando se N é par ou ímpar.
        
        
        System.out.print("\nDigite um numero inteiro: ");
        int n = Integer.parseInt(input.nextLine());
        
        if (n%2==0){
            System.out.println("O numero "+n+" e par");
    }
        else 
            System.out.println("O numero "+n+ " e impar");
}
}