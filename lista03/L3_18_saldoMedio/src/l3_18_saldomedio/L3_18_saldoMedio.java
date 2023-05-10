/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_18_saldomedio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_18_saldoMedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
      /*  Um banco concederá um crédito especial aos seus clientes de acordo com o saldo
médio no último ano. Faça um programa que leia o saldo médio de um cliente e calcule o
valor do crédito de acordo com a tabela a seguir e imprima uma mensagem informando o
saldo médio e o valor do crédito.
  Saldo Médio         Crédito
0 a 500,00        nenhum crédito
500,01 a 1000     30% do valor do saldo médio
1000,01 a 3000    40% do valor do saldo médio
acima de 3000     50% do valor do saldo médio*/
      
      /* funçao lerValorSaldo; float
        funcao calculaCredito; float 
        funcao apresentaCredito; void
      */
        
        float saldo = leValorSaldo();
        double credito = calculaCredito(saldo);
        apresentaCredito(credito);
        
    }
       public static float leValorSaldo(){
         Scanner input = new Scanner (System.in);
         
         System.out.print("\nDigite o valor do saldo medio do ultimo ano -> R$ ");
          return Float.parseFloat(input.nextLine());
          
    } 
       
    public static double calculaCredito(double x){
        
        if (x>=0 && x<=500){
           return 0;
        }
        else if (x>500 && x<=1000){
            return 0.3*x;
        }
        else if (x>1000 && x<=3000){
            return 0.4*x; 
        }
        else 
            return 0.5*x; 
    }
    
    public static void apresentaCredito(double credito){
        System.out.println("\nO valor total do credito e de R$ "+credito);
    }
    
}
