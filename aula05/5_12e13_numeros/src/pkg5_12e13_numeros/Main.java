/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_12e13_numeros;

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
        
        /*12) Faça um programa que leia dois números A e B e mostre se eles são iguais.
            13) Faça um programa que leia os valores A, B e C e informe se a soma de A com B é
            menor ou igual a C.*/
        
        System.out.print("\nPrimeiro numero: ");
        int A = Integer.parseInt(input.nextLine());
        System.out.print("Segundo numero: ");
        int B = Integer.parseInt(input.nextLine());
        System.out.print("Terceiro numrero: ");
        int C = Integer.parseInt(input.nextLine());
        
        boolean iguais = A==B; 
        boolean somaIgual = A+B<=C; 
        
        
        System.out.print("\nOs numeros " +A+" e " +B+ " sao iguais? "+iguais);
        System.out.println("\nA soma entre "+A+" e "+B+" e igual a "+C+"? "+somaIgual);
        
    }
    
}
