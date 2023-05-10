/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_03_dobronumeros;

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
        
        /*11.3. Crie um programa que leia três números
inteiros. Este programa deve possuir uma função que recebe
um número inteiro por vez e calcula o dobro do valor. Após
calcular o dobro dos três valores, os resultados devem ser
enviados para uma função responsável por apresentá-los.*/
        
        System.out.print("\nPrimeiro numero: ");
        int numero1 = Integer.parseInt(input.nextLine());
        System.out.print("Segundo numero: ");
        int numero2 = Integer.parseInt(input.nextLine());
        System.out.print("Terceiro numero: ");
        int numero3 = Integer.parseInt(input.nextLine());

        int dobro1 = calculaDobro(numero1);
        int dobro2 = calculaDobro(numero2);
        int dobro3 = calculaDobro(numero3);
        
        imprimeValores (dobro1, dobro2, dobro3);
        
    }
    
    public static int calculaDobro (int numero){
        return numero*2;  
    }
    
    public static void imprimeValores (int dobro1, int dobro2, int dobro3){
        System.out.println("Dobro 1: " +dobro1);
         System.out.println("Dobro 2: "+dobro2);
          System.out.println("Dobro 3: "+dobro3);
    }
    
}
