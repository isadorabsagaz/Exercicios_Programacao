/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_ex01_numeros;

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
        
        System.out.print("\nDigite um numero de 0 a 9: ");
        int n = Integer.parseInt(input.nextLine());
        
        switch (n){
            case 1 -> System.out.println("Um"); 
            case 2 -> System.out.println("Dois");
            case 3 -> System.out.println("Tres");
            case 4 -> System.out.println("Quatro");
            case 5 -> System.out.println("Cinco");
            case 6 -> System.out.println("Seis");
            case 7 -> System.out.println("Sete");
            case 8 -> System.out.println("Oito");
            case 9 -> System.out.println("Nove");
            default -> System.out.println("Erro");
    }
    
        
 }
}
