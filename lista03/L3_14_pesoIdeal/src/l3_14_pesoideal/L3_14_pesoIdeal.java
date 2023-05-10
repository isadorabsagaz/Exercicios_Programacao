/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_14_pesoideal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_14_pesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
       /* 14) Faça um algoritmo que, tendo como dados de entrada a altura (h) em metros e o gênero de uma
pessoa (M ou F), calcule seu peso ideal utilizando as seguintes fórmulas: Masculino: Peso
ideal = 72.7 * h - 58; Feminino: Peso ideal = 62.1 * h - 44.7. Caso o usuário digite uma
letra inválida para o gênero, o programa deve apresentar uma mensagem de erro*/
       
       
        System.out.println("Digite seu genero: ");
        char genero = input.nextLine().charAt(0); 
        System.out.println("Digite sua altura em metros: ");
        float h = Float.parseFloat(input.nextLine());
        
        switch (genero){
            case 'm', 'M': 
                double pesoM = 72.7 * h - 58; 
                System.out.println("Peso ideal (masculino): "+pesoM);
                break;  
            case 'f', 'F': 
                double pesoF = 62.1 * h - 44.7;
                System.out.println("Peso ideal (feminino): "+pesoF);
                break; 
            default: 
               System.out.println("ERRO: Genero incorreto");     
                
        }
    }
    
}
