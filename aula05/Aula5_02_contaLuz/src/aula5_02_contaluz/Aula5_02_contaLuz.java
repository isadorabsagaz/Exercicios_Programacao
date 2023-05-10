/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5_02_contaluz;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula5_02_contaLuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
     float p, conta, atraso; 
     int KW;
     boolean ce; 
     char teste; 
     
     
        System.out.print("\nPreço KWatt hora: ");
        p = Float.parseFloat(input.nextLine());
        System.out.print("Kwatts gastos: ");
        KW = Integer.parseInt(input.nextLine());
        
        /*teste char*/
        System.out.print("Digite uma palavra: ");
        teste = input.nextLine().charAt(2); 
        
        
        conta = p*KW; 
        atraso = (float) ((double) 0.1*conta + conta); 
        ce = KW>70; 
       
        
        System.out.print("\nConta em R$: "+conta);
        System.out.print("\nConta com atraso em R$: "+atraso);
        System.out.println("\nConsumo elevado de energia? "+ce);
        
        /*apenas um teste com char: */
        System.out.println("\nPegar terceira letra da palavra: "+teste);
        
    }
    
}
