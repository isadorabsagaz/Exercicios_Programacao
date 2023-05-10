/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_16_inflação;

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
        
            /*16) Faça um programa que leia o preço de três mercadorias no dia 01/01/2022 e o no dia
            01/02/2022. Em seguida o programa deve calcular a inflação do período, considerando a
            variação de preço dos três produtos. Mostre uma mensagem se a inflação está acima da
            meta ou não (considere que a meta para o mês é de 0,55%).*/
        
        
            System.out.print("\nValor produto1 em janeiro em R$: ");
            float j1 = Float.parseFloat(input.nextLine());
            System.out.print("Valor produto2 em janeiro: ");
            float j2 = Float.parseFloat(input.nextLine());
            System.out.print("Valor produto3 em janeiro: ");
            float j3 = Float.parseFloat(input.nextLine());
            
            System.out.print("\nValor produto1 em fevereiro: ");
            float f1 = Float.parseFloat(input.nextLine());
            System.out.print("Valor produto2 em fevereiro: ");
            float f2 = Float.parseFloat(input.nextLine());
            System.out.print("Valor produto3 em fevereiro: ");
            float f3 = Float.parseFloat(input.nextLine());
            
            float v1 = (float) (f1-j1)/j1;
            float v2 = (float) (f2-j2)/j2;
            float v3 = (float) (f3-j3)/j3; 
            float mediaV = (v1+v2+v3)/3; 
            float inf = (float) (mediaV/j1)*100; 
            boolean acimaMeta = inf>0.55; 
        
            System.out.print("\nInflacao no periodo: "+inf+ "%");
            System.out.println("\nAcima da meta? "+acimaMeta);
            
    }
    
}
