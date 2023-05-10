/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ponderada;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ponderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        
        float x, y, z, media; 
        int p1, p2, p3; 
        
        System.out.print("\nDigite a primeira nota: ");
        x = Float.parseFloat(input.nextLine());
        System.out.print("\nE seu peso: ");
        p1 = Integer.parseInt (input.nextLine());
        
        System.out.print("\nDigite a segunda nota: ");
        y = Float.parseFloat (input.nextLine());
        System.out.print("\nE seu peso: ");
        p2 = Integer.parseInt(input.nextLine());
      
        System.out.print("\nDigite a terceira nota: ");
        z = Float.parseFloat( input.nextLine());
        System.out.print("\nE seu peso: ");
        p3 = Integer.parseInt(input.nextLine());
        
        
        media = (float)(x*p1+y*p2+z*p3)/(p1+p2+p3);
        
        System.out.println("A media ponderada resulta em: "+ media);
        
    
        
    }
    
}
