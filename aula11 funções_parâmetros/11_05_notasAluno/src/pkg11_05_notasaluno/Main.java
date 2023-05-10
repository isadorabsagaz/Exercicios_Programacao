/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_05_notasaluno;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
      /*  11.5. Elabore um programa que leia as três notas de um
aluno e o tipo de média a ser calculada (A – Aritmética, P –
Ponderada e G – Geométrica). O programa deve conter uma função
que receba as três notas e a letra indicando o tipo de média a ser
calculada. A média calculada deve ser retornada ao programa
principal para, então, ser mostrada. Se o usuário optar por média
ponderada, deve-se usar os pesos: 1, 2 e 2, respectivamente.
● Suponha que o usuário sempre digitará uma das opções corretas
para o tipo de média.
● Crie o conjunto de testes para este programa.*/
      
      
        System.out.print("\nDigite a primeira nota: ");
        float nota1 = Float.parseFloat(input.nextLine());
        System.out.print("Digite a segunda nota: ");
        float nota2 = Float.parseFloat(input.nextLine());
        System.out.print("Digite a terceira nota: ");
        float nota3 = Float.parseFloat(input.nextLine());
        
        System.out.println("\nSelecione tipo de media desejada: ");
        System.out.println("[A] - Aritmetica");
        System.out.println("[P] - Ponderada");
        System.out.println("[G] - Geometrica");
        System.out.print("\nTipo selecionado -> ");
        char tipoMedia = input.nextLine().charAt(0);
        
        
        double media = calculaMedia(nota1, nota2, nota3, tipoMedia);
        System.out.println("Media = "+media);
        
        
    }
    
    public static double calculaMedia (float nota1, float nota2, float nota3, char tipoMedia){
         
        double media = 0; 
        
        switch (tipoMedia) {
            case 'A': 
                 media = (nota1 + nota2 + nota3)/3;
                 break; 
                 
            case 'P': 
                media = (nota1*1 + nota2*2 + nota3*3)/6;    
                break; 
                
            case 'G':
                double produtoG = nota1 * nota2 * nota3; 
                media = Math.cbrt(produtoG);
        }
      
        return media;
         
    }
    
    
}
