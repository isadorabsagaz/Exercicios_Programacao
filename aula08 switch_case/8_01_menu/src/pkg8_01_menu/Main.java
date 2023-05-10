/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_01_menu;

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
        
         /*8.1: Faça um programa que apresente o menu abaixo e leia o
número correspondente à opção selecionada pelo usuário. Em seguida o
programa deve apresentar uma mensagem indicando qual foi a opção
selecionada.*/
        
        System.out.println("\n1-cadastrar cliente");
        System.out.println("2-editar cliente");
        System.out.println("3-cadastrar produto");
        System.out.println("4-editar produto");
        System.out.println("5-efuetuar venda");
        System.out.println("6-sair");
        System.out.print("Digite a opcao desejada: ");
        int n = Integer.parseInt(input.nextLine());
        
        
        switch (n) {
            case 1: System.out.println("cadastrar cliente");
                break; 
            case 2: System.out.println("editar cliente");
                break;
            case 3: System.out.println("cadastrar produto");
                break; 
            case 4: System.out.println("editar produto");
                break; 
            case 5: System.out.println("efetuar venda");
                break; 
            default: System.out.println("sair");
        }
        
    }
    
}
