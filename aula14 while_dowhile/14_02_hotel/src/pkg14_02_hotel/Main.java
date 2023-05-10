
package pkg14_02_hotel;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner (System.in); 
   
    public static void main(String[] args) {
       /*2: Um hotel cobra R$ 150,00 por diária e mais uma
taxa de serviços, que é de:
● R$ 45,00 por diária, se o número de diárias for < 10.
● R$ 25,50 por diária, se o número de diárias for de 10 a 15.
● R$ 10,00 por diária, se o número de diárias for > 15.
Faça um programa que leia o nome e a quantidade de diárias
dos hóspedes que estão saindo do hotel em um dia. Este
programa deve calcular e imprimir o nome e o valor da conta de
cada hóspede, bem como o total a ser recebido pelo hotel neste
dia. O programa deve ser terminado quando o usuário digitar 0
para a quantidade de diárias.*/
       
       
        double valorHospede; 
        double valorTotal=0; 
       
        System.out.println("Nome do hospede: ");
            String nome = input.nextLine(); 
        System.out.println("Numero de diarias: ");
            int diarias = Integer.parseInt(input.nextLine()); 
       
            
        while(diarias !=0){
            double taxa = calculaTaxa(diarias); 
           valorHospede = diarias*150 + taxa; 
            System.out.println("Valor a ser pago por "+nome+": R$ "+valorHospede);
            System.out.println("Nome do hospede: ");
                nome = input.nextLine(); 
            System.out.println("Numero de diarias: ");
                diarias = Integer.parseInt(input.nextLine());
           valorTotal += valorHospede; 
        }
        
        System.out.println("Valor a ser recebido pelo hotel: R$"+valorTotal);
        
    }
    public static double calculaTaxa(int diarias){
        if(diarias<10){
            return 45*diarias; 
        }
        else if (diarias>=10 && diarias<=15){
            return 25.5*diarias; 
        }
        else 
            return 10*diarias; 
    }
     
}
