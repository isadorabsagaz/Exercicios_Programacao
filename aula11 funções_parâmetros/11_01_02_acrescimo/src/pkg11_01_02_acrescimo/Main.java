/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_01_02_acrescimo;

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
        
        
      /* 11.1. Crie um programa que leia os preços antigo e
atual de um produto e chame uma função que determine o
percentual de acréscimo entre esses valores. O resultado deve
ser mostrado no programa principal.
● Suponha que o usuário sempre digitará um valor maior para o
preço atual do que para o preço antigo.
        
        11.2. Crie uma nova versão do programa anterior,
com uma função que verifique se o preço novo é maior ou
igual ao antigo e retorne um valor lógico. Se o preço novo for
menor, a função deve apresentar uma mensagem de erro e o
programa não deve calcular o valor do acréscimo.
● Nesta versão o valor do acréscimo deve ser apresentado por
uma função.*/
      
        System.out.print("\nDigite preco antigo do produto: R$ ");
        float precoAntigo = Float.parseFloat(input.nextLine());
        System.out.print("Digite preco novo do produto: R$ ");
        float precoNovo = Float.parseFloat(input.nextLine());
        
        if(verificaValor(precoAntigo, precoNovo)){
            float acrescimo = acrescimoPercentual (precoAntigo, precoNovo);
            System.out.println("\nValor do acrescimo percentual: R$ "+acrescimo);
        }
        
        else 
            System.out.println("\n Erro");
      
    }
    
    public static float acrescimoPercentual (float n1, float n2){
        float diferenca = n2-n1; 
        float acrescimo = diferenca*100/n1; 
        return acrescimo;  
    }
    
    public static boolean verificaValor (float precoAntigo, float precoNovo){
        return precoAntigo < precoNovo; 
    }
    
}
