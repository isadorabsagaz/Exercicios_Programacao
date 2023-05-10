
package pkg14_04_habitantes;

import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner (System.in); 
  
    public static void main(String[] args) {
        /*4: Especialistas estimam que a população de uma
cidade fictícia aumenta em 4.000 habitantes por ano. Faça
um programa que leia a população atual desta cidade e
calcule quantos anos ela levará para atingir 500.000
habitantes.*/
        float anos; 
        
      int populacao = leiaPopulacao();   
        if(populacao<500000){
         anos = (500000 - populacao)/4000f; 
         double anoArredondado = Math.ceil(anos); 
         System.out.println("Segundo a estimativa, levarao "+anoArredondado+" anos para que"
                 + " se atinja 500.000 habitantes");
      }
      
        //System.out.println("Segundo a estimativa, levarao "+anos+" para que atinja-se 500.000 habitantes");
        
    }
    public static int leiaPopulacao(){
        System.out.print("\nDigite a populacao atual da cidade: ");
        return Integer.parseInt(input.nextLine()); 
    }
}
