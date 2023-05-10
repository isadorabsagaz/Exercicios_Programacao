/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_09_compras;

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
        
        /*9) Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
        programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
        do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
        O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.*/
        
        System.out.print("\nValor compra em R$: ");
        float compra = Float.parseFloat(input.nextLine()); 
        System.out.print("Valor pago cliente em R$: ");
        float cliente = Float.parseFloat(input.nextLine()); 
        
        float troco = cliente - compra; 
        int nota100 = (int) ((float) troco/100);
        int nota10 = (int) ((float) troco % 100)/10; 
        int nota1 = (int) ((float) troco % 100) % 10; 
        
        System.out.print("\nTroco em R$: "+troco);
        System.out.print("\nNotas de R$100: "+nota100);
        System.out.print("\nNotas de R$10: "+nota10);
         System.out.println("\nMoedas de R$1: "+nota1);
        
    }
    
}
