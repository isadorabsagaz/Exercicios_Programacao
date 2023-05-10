/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_16_quadrantes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_16_quadrantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        
       // 16) Escreva um programa que tome como entradas as coordenadas de um ponto
//(abscissa e ordenada) e imprima em que quadrante (1, 2, 3 ou 4) o ponto está localizado
   
        System.out.println("Abscissa (x): ");
        int x = Integer.parseInt(input.nextLine());
         System.out.println("Ordenada (y): ");
        int y = Integer.parseInt(input.nextLine());
        
        if (x>0 && y>0){
            System.out.println("Primeiro quadrante");
        }
        else if (x<0 && y>0)
            System.out.println("Segundo quadrante");
        
        else if (x<0 && y<0)
            System.out.println("Terceiro quadrante");
        
        else if (x>0 && y<0)
            System.out.println("Quarto quadrante");
        
        else if (x==0 && y!=0)
            System.out.println("Ponto sob o eixo y");
        
        else if (x!=0 && y==0)
            System.out.println("Ponto sob o eixo x");
        
        else 
            System.out.println("Origem do plano");
    }
    
}
