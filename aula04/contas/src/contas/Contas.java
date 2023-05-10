/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Contas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nome;
        int x, y, z, soma, prod;
        float media;
        
        System.out.print("Olá, qual seu nome? ");
        nome = input.nextLine();
        
        System.out.println("Muito prazer " +nome);
        
        System.out.print("\nPor gentileza, digite um numero: ");
        x = Integer.parseInt(input.nextLine());
        
        System.out.print("\nAgora, outro: ");
        y = Integer.parseInt(input.nextLine());
        
        System.out.print("\nPor fim, mais um: ");
        z = Integer.parseInt(input.nextLine());
        
        
       soma = x+y+z;
       prod = x*y*z;
       media = (float)(x+y)/2;
       
        System.out.println("A soma entre " +x+ ", " +y+ " e "+z+ " resulta em: "+soma);
              System.out.println("O produto entre "+x+ ", "+y+ " e "+z+ " resulta em: " +prod); 
               System.out.println("A media entre "+x+ " e "+y+ " resulta em: "+media);
        
    }
    
}
