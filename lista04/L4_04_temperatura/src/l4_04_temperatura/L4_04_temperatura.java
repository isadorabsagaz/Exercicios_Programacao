
package l4_04_temperatura;

import java.util.Scanner;


public class L4_04_temperatura {
    static Scanner input = new Scanner (System.in); 
    
    public static void main(String[] args) {
     
        
        /*4) Escreva um programa que leia a temperatura em graus Celsius e apresente a
temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo. Crie uma
função para fazer a conversão.*/
        
      float temperaturaCelcius = leiaNumeros(); 
      float temperaturaFahrenheit = fazConversao(temperaturaCelcius); 
        System.out.println("Temperatura convertida para Fahrenheit = "+temperaturaFahrenheit);
        
    }
    public static float leiaNumeros(){
        System.out.println("Digite uma temperatuda em graus celcius: ");
            return Float.parseFloat(input.nextLine());
    }   
    public static float fazConversao (float c){
        return (9*c)/5+32; 
   }
    
    
}
