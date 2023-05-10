/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_08_salario;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_08_salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       /* 8) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários das categorias A e H ganharão 10% de aumento sobre o salário;
• Funcionários das categorias B, D, e E ganharão 15% de aumento sobre o salário;
• Funcionários das categorias C e F ganharão 25% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia o nome do funcionário, sua categoria e salário atual e
imprima o seu nome, categoria e salário reajustado.*/
       
        System.out.print("\nNome do funcionario: ");
        String nome = input.nextLine();
        System.out.println("Categorias: ");
        System.out.println("[A]");
        System.out.println("[B]");
        System.out.println("[C]");
        System.out.println("[D]");
        System.out.println("[E]");
        System.out.println("[F]");
        System.out.println("[G]");
        System.out.println("[H]");
        System.out.print("\nCategoria selecionada -> ");
        char categoria = input.nextLine().charAt(0);
        System.out.print("Salario atual do funcionario em R$: ");
        float salarioAtual = Float.parseFloat(input.nextLine());
        
        
        System.out.println("\nFuncionario "+nome);
        System.out.println("Categoria "+categoria);
        
         if(categoria=='A' || categoria=='H'){
            float salarioNovo = salarioAtual + 10/100f*salarioAtual;
            System.out.println("Novo salario em R$: "+salarioNovo);
        }  
         else if (categoria=='B' || categoria=='D'|| categoria=='E'){
            float salarioNovo = salarioAtual + 15/100f*salarioAtual; 
            System.out.println("Novo salario em R$: "+salarioNovo);
        }  
        else if (categoria=='C' || categoria=='F'){
            float salarioNovo = salarioAtual + 25/100f*salarioAtual;
            System.out.println("Novo salario em R$: "+salarioNovo);
        } 
        else if (categoria=='G'){
            float salarioNovo = salarioAtual + 30/100f*salarioAtual; 
            System.out.println("Novo salario em R$: "+salarioNovo);
        }  
        else 
            System.out.println("Categoria invalida");
         
    }
    
}
