/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_09_contaestourada;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_09_contaEstourada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        /*9) Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
negativo, deve ser mostrada, também, a mensagem “conta estourada”*/
        
        System.out.print("\nNumero da conta: ");
        String numero = input.nextLine();
        System.out.print("Saldo atual: R$");
        float saldoAtual = Float.parseFloat(input.nextLine());
        System.out.println("Operacao a ser realizada: ");
        System.out.println("[1] - Deposito");
        System.out.println("[2] - Saque");
        System.out.print("\nSelecione uma operacao -> ");
        int operacao = Integer.parseInt(input.nextLine());
        System.out.print("Valor para a operacao: R$");
        float valor = Float.parseFloat(input.nextLine());
        
        float saldoNovo;
        
        switch (operacao){
            case 1: saldoNovo=saldoAtual + valor; 
                System.out.println("\nNovo saldo: R$"+saldoNovo);
                 break; 
            case 2: saldoNovo=saldoAtual - valor;
            
                if (saldoNovo>=0){
                System.out.println("\nNovo saldo: R$"+saldoNovo);
                }
                else {
                System.out.println("\nNovo saldo: R$"+saldoNovo);
                System.out.println("Conta estourada");
                }
                break; 
            default: 
                System.out.println("\nOperacao invalida");   
                 
        }
        
    }
    
}
