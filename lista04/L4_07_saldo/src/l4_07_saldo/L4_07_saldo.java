package l4_07_saldo;

import java.util.Scanner;

public class L4_07_saldo {
 static Scanner input = new Scanner (System.in); 
   
    public static void main(String[] args) {
        /*7) Faça um programa que leia o saldo da conta de um cliente e a taxa de juros de um
determinado mês. O programa deve ter uma função que recebe como parâmetro estes
valores, calcula e retorna o novo saldo. Por fim, o programa deve apresentar o novo saldo
da conta após o recebimento do valor correspondente aos juros daquele mês.*/
        
        System.out.print("\nSaldo atual da conta: R$ ");
            float saldoAtual = Float.parseFloat(input.nextLine()); 
        System.out.print("Taxa de juros do mes em %: ");
            float taxaJuros = Float.parseFloat(input.nextLine());
        
        calculaNovoSaldo(saldoAtual, taxaJuros);    
    }
     public static void calculaNovoSaldo(float saldoAtual, float taxaJuros){
         float novoSaldo = saldoAtual + saldoAtual*(taxaJuros/100); 
         System.out.println("O novo saldo e de: R$ "+novoSaldo);
     }

}
