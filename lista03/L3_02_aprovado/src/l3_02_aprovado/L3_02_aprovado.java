/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_02_aprovado;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_02_aprovado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
 Scanner input = new Scanner (System.in);
        
       /* 2) O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter 
nota igual ou superior a sete no trabalho e nota igual ou superior a seis em pelo menos uma das provas. 
Observe que não se deve calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
O programa deve apresentar a mensagem “Parabéns, você foi aprovado” ou
“Infelizmente, você não foi aprovado”, de acordo com as notas do aluno.*/
        
        System.out.print("\nNota prova 1: ");
       int nota1 = Integer.parseInt(input.nextLine()); 
        System.out.print("Nota prova 2: ");
       int nota2 = Integer.parseInt(input.nextLine()); 
        System.out.print("Nota trabalho: ");
       int trabalho = Integer.parseInt(input.nextLine()); 
       
       if (trabalho>=7 && (nota1>=6|| nota2>=6 )){
           System.out.println("Parabens, voce foi aprovado");
        }
       else 
            System.out.println("Infelizmente, voce nao foi aprovado");
    }
}
