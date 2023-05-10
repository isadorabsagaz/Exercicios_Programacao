/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_17_planetas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_17_planetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
      /*  17) Faça um programa que leia um peso na Terra e o código de um planeta e imprima o
valor do seu peso neste planeta.
1. Mercúrio - 1Kg = 0.37Kg
2. Vênus - 1Kg = 0.88Kg
3. Marte - 1Kg = 0.38Kg
4. Júpiter - 1Kg = 2.64Kg
5. Saturno - 1Kg = 1.15Kg
6. Urano - 1Kg = 1.17Kg
7. Netuno - 1Kg = 1.18Kg 
        peso = massa * gravidade */
      
      
        System.out.print("\nDigite o peso na Terra em kg: ");
        float pesoTerra = Float.parseFloat(input.nextLine());
        System.out.println("Selecione um planeta: ");
        System.out.println("""
                           [1] - Mercurio
                           [2] - Venus
                           [3] - Marte
                           [4] - Jupiter
                           [5] - Saturno
                           [6] - Urano
                           [7] - Netuno""");
        System.out.print("\nNumero escolhido -> ");
       int planeta = Integer.parseInt(input.nextLine());
       
      double pesoPlaneta = calculaPeso(pesoTerra, planeta); 
      
     
    }
    
    static double calculaPeso(float pesoTerra, int planeta){
       double pesoPlaneta = 0; 
        
        switch(planeta) {
            case 1: 
                pesoPlaneta = pesoTerra * 0.37;
                System.out.println("\nO peso em Mercurio e igual a "+pesoPlaneta+ "kg");
                break; 
                
            case 2: 
                pesoPlaneta = pesoTerra * 0.88; 
                System.out.println("\nO peso em Venus e igual a "+pesoPlaneta+ "kg");
                break; 
              
            case 3: 
                pesoPlaneta = pesoTerra * 0.38;
                System.out.println("\nO peso em Marte e igual a "+pesoPlaneta+ "kg");
                break; 
                
            case 4: 
                pesoPlaneta = pesoTerra * 2.64;
                System.out.println("\nO peso em Jupiter e igual a "+pesoPlaneta+ "kg");
                break; 
                
            case 5: 
                pesoPlaneta = pesoTerra * 1.15; 
                System.out.println("\nO peso no Saturno e igual a "+pesoPlaneta+ "kg");
                break; 
                
            case 6: 
                pesoPlaneta = pesoTerra * 1.17;
                System.out.println("\nO peso em Urano e igual a "+pesoPlaneta+ "kg");
                break;
            case 7:
                pesoPlaneta = pesoTerra * 1.18; 
                System.out.println("\nO peso em Netuno e igual a "+pesoPlaneta+ "kg");
                break; 
                
            default: 
                System.out.println("O codigo digitado e invalido! ");
                
             
        }
        
        return pesoPlaneta; 
    }
    
}
