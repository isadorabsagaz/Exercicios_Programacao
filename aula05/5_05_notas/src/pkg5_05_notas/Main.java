/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_05_notas;

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
       
       /*exercicios 05 e 06 lista 02*/
       int p1, p2, t, f;
       boolean aprovado; 
       
        System.out.print("\nNota prova 1: ");
       p1 = Integer.parseInt(input.nextLine());
        System.out.print("Nota prova 2: ");
       p2 = Integer.parseInt(input.nextLine());
        System.out.print("Nota trabalho: ");
       t = Integer.parseInt(input.nextLine());
        System.out.print("Frequencia em %: ");
        f = Integer.parseInt(input.nextLine());
        
       
        aprovado = (t>=7 && (p1>=6 || p2>=6) && f>75) || (t==6 && f>=90);                  
                
        
        System.out.println("Aprovado? "+aprovado);
        
    }
    
}
