package pkg14_01_idades_dowhile;  //DO WHILE 

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner (System.in); 
    
    public static void main(String[] args) {
        /*1: Faça um programa que leia o nome e a
idade de uma pessoa e apresente quantos anos esta
pessoa terá daqui cinco anos. A idade digitada deve
ser um valor entre 0 e 100, caso contrário o programa
deve solicitar que o usuário digite a idade novamente.*/
        
        int idade; 
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine(); 
        
        
        do{
            System.out.println("Digite sua idade " +nome+": ");
            idade = Integer.parseInt(input.nextLine());
        } while(idade<0 || idade>100); 
        
        int novaIdade = idade + 5;
        System.out.println("Idade de "+nome+" em 5 anos = "+novaIdade);
        
    }
   
}

