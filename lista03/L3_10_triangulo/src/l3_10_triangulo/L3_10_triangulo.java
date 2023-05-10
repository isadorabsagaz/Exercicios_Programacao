/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_10_triangulo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_10_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
      /*  10) Faça um programa que leia três valores X, Y e Z e verifique se eles podem ser os
comprimentos dos lados de um triângulo, e se forem, deve verificar se é um triângulo
equilátero, isóscele ou escaleno. Se eles não formarem um triângulo, o programa deve
escrever uma mensagem indicando.
Propriedade – o comprimento de cada lado de um triângulo é menor do que a soma dos
comprimentos dos outros dois lados.*/
      
      
        System.out.println("Lado 1 (x): ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Lado 2 (y): ");
        int y = Integer.parseInt(input.nextLine());
        System.out.println("Lado 3 (z): ");
        int z = Integer.parseInt(input.nextLine());
        
        if (x==y && x==z){
            System.out.println("Equilatero");
        }
            else if(x==y && x!=z || x!=y && x==z
                         && x<z+y && z<x+y)
                System.out.println("Isoceles");
                
            else if(x!=y && x!=z
                    && x<z+y && y<x+z && z<x+y)
                System.out.println("Escaleno");
            
        else 
            System.out.println("Nao e triangulo");
        
    }
    
}