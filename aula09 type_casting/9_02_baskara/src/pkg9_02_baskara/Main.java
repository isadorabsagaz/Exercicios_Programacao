/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_02_baskara;

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
       
     /* 9.2: Faça um programa que
leia os coeficientes de uma equação do
segundo grau e calcule as suas raízes
usando a fórmula de Bhaskara.*/
       
       
        System.out.println("Eq do 2 grau: ax²+bx+c");
        System.out.print("\nValor de a: ");
        float a = Float.parseFloat(input.nextLine());
        System.out.print("Valor de b: ");
        float b = Float.parseFloat(input.nextLine());
        System.out.print("Valor de c: ");
        float c = Float.parseFloat(input.nextLine());
        
        double delta = Math.pow(b,2)-4*a*c;
        double x1, x2; 
        
        if (delta>0){
              x1 = (-b + Math.sqrt(delta))/(2*a); 
              x2 = (-b - Math.sqrt(delta))/(2*a);
              System.out.println("\nx1 = "+x1);
                System.out.println("x2 = "+x2);
        }
        else if (delta==0){   
            double x3 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("x1 = x2 = "+x3 );
        }
            
        else 
           System.out.println("Nao existem valores reais para x");
      
    }
    
}
