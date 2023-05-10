
package l4_01_retangulo;

import java.util.Scanner;


public class L4_01_retangulo {
    static Scanner input = new Scanner (System.in); 
    
    public static void main(String[] args) {
        
      /*  1) Crie um programa que leia as medidas da base e altura de um retângulo, calcule e
apresente a área e o perímetro deste retângulo. Crie uma função para calcular a área e
outra para calcular o perímetro.*/
        
      int base = leiaNumeros("base"); 
      int altura = leiaNumeros("altura"); 
      int area = calculaArea(base, altura); 
      int perimetro = calculaPerimetro(base, altura); 
      
      mostraResultados(area, perimetro); 
        
    }
    public static int leiaNumeros(String texto){
        System.out.println("Digite a "+texto+" do retangulo: ");
            return Integer.parseInt(input.nextLine());
    } 
    
    public static int calculaArea(int base, int altura){
        return base*altura; 
        
    } 
    public static int calculaPerimetro(int base, int altura){
         return 2*base+2*altura; 
         
    }
    public static void mostraResultados(int area, int perimetro){
          System.out.println("Area = "+area);
          System.out.println("Perimetro = "+perimetro);
    }    
}
