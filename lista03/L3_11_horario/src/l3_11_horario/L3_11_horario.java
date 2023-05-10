/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_11_horario;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_11_horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        
        /*11) Elabore um programa que tome como entrada um determinado horário, expresso por
hora (valor inteiro de 0 a 23), minuto (valor de 0 a 59) e segundo (valor de 0 a 59) e
imprima esse horário acrescido de 1 segundo. Cada hora tem 60 minutos e cada minuto
sem 60 segundos. O incremento de um segundo no horário, além de alterar o valor do
segundo, pode implicar em alterações no valor do minuto e da hora. Veja que um horário
como 13:59:59 acrescido de 1 segundo vai para 14:00:00.*/
        
        System.out.println("Hora atual (0 a 23): ");
        int hora = Integer.parseInt(input.nextLine());
        System.out.println("Minuto atual (0 a 59): ");
        int minuto = Integer.parseInt(input.nextLine());
        System.out.println("Segundo atual (0 a 59): ");
        int segundo = Integer.parseInt(input.nextLine());
        
        if(hora==23 && minuto==59 && segundo==59){
            System.out.println("Horario + 1 segundo = 00:00:00");  
        }
            else if (hora!=23 && minuto==59 && segundo==59){
            hora+=1;
        System.out.println("Horario + 1 segundo = "+hora+":00:00");
            }
            else if (hora!=23 && minuto!=59 && segundo==59){
            minuto+=1;
        System.out.println("Horario + 1 segundo = " +hora+ ":" +minuto+":00");
            }
        else 
            segundo+=1;
        System.out.println("Horario + 1 segundo = " +hora+ ":" +minuto+":"+segundo);
        
        
    }
    
}
