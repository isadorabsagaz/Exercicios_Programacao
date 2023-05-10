/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_04_imc;

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
        
        float p, h, IMC; 
        boolean acima_p; 
        
        System.out.print("\nPeso: ");
        p = Float.parseFloat(input.nextLine());
        System.out.print("Altura: ");
        h = Float.parseFloat(input.nextLine());
       
        IMC = p / (h*h); 
        acima_p = IMC>25; 
        
        System.out.print("\nIMC= "+IMC);
        System.out.println("\nAcima do peso ideal? "+acima_p);
        
    }
    
}
