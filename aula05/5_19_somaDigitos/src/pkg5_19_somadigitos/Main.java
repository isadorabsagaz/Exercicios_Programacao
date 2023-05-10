/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_19_somadigitos;

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
        
        System.out.print("\nNumero entre 0 e 999: ");
        int n = Integer.parseInt(input.nextLine());
        
        int cent = (int) ((float) n/100); 
        int resto1 = (int) (n%100f);
        int dez = (int) (resto1/10f);
        int uni = (int) (resto1%10f); 
        int soma = cent+dez+uni; 
      
        System.out.println("\nSoma dos digitos de "+n+": "+soma);
        
    }
    
}
