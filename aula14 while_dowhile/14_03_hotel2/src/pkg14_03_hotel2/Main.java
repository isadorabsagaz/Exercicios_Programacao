
package pkg14_03_hotel2;

import java.util.Scanner;

public class Main {
 static Scanner input = new Scanner (System.in); 
    
    public static void main(String[] args) {
        
        /*3: Crie uma nova versão do programa elaborado
na atividade 2. Nesta versão, após ler, calcular e apresentar
os dados de um cliente, o programa deve perguntar se o
usuário deseja continuar calculando a conta de outros
hóspedes ou não. A resposta do usuário deve ser S ou N.*/
        
        double valorHospede; 
        double valorTotal=0; 
        char resposta; 
       
        do{
            
            System.out.print("\nNome do hospede: ");
                String nome = input.nextLine(); 
            System.out.print("Numero de diarias: ");
                int diarias = Integer.parseInt(input.nextLine()); 
            
            double taxa = calculaTaxa(diarias); 
            valorHospede = diarias*150 + taxa; 
            System.out.println("Valor a ser pago por "+nome+": R$ "+valorHospede);
            
            valorTotal += valorHospede; 
            System.out.print("\nDeseja continuar a operacao para mais hospedes? ");
            resposta = input.nextLine().charAt(0); 
            
        } while(resposta!='n');  
        
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