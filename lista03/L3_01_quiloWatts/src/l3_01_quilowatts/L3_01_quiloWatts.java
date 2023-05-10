/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_01_quilowatts;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_01_quiloWatts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        
       /* 1) Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. Além disto, o programa deve mostrar uma mensagem indicando se a residência
está com consumo elevado de energia. A empresa considera consumo elevado de
energia, se a residência consumir mais de de 70 quilowatts.
O programa deve apresentar a mensagem “Consumo elevado de energia”, caso o
consumo seja elevado, ou “Você é um consumidor consciente”, caso o consumo não seja
elevado.*/
        
        float precoKw, conta, contaAtraso; 
        int quantKw;
        
        System.out.print("\nPreco do quilowatt em R$: ");
        precoKw = Float.parseFloat(input.nextLine()); 
        System.out.print("Qauntidade consumida de quilowatts: ");
        quantKw = Integer.parseInt(input.nextLine()); 
       
        conta = precoKw * quantKw; 
        contaAtraso = conta + (10/100f)*conta; 
        
        System.out.println("\nValor conta em R$: "+conta);
        System.out.println("Valor conta com atraso em R$: "+contaAtraso);
        
      
        if (quantKw<=70){
            System.out.println("Voce e um consumidor consciente");
       }
        else 
            System.out.println("Consumo elevado de energia");
        
    }
    
}  
   