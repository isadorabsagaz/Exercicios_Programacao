/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_18_diasvida;

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
        
        System.out.print("\nDia aniversario: ");
        int dia1 = Integer.parseInt(input.nextLine());
        System.out.print("Mes aniversario: ");
        int mes1 = Integer.parseInt(input.nextLine());
        System.out.print("Ano aniversario: ");
        int ano1 = Integer.parseInt(input.nextLine());
        
        System.out.print("\nDia atual: ");
        int dia2 = Integer.parseInt(input.nextLine());
        System.out.print("Mes atual: ");
        int mes2 = Integer.parseInt(input.nextLine());
        System.out.print("Ano atual: ");
        int ano2 = Integer.parseInt(input.nextLine());
        
        
        int diasAniver = dia1 + mes1*30 + ano1*360; 
        int diasAtual = dia2 + mes2*30 + ano2*360;
        int diasVida = diasAtual - diasAniver;
        
        
        System.out.println("\nTotal dias vividos: "+diasVida);
       
        
    }
    
}
