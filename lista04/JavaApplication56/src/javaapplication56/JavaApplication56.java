package l4_13;

import java.util.Scanner;

public class L4_13_ {
    static Scanner input = new Scanner (System.in); 
    
    
    public static void main(String[] args) {
     
        /*13) Escreva um programa que tome como entradas as coordenadas de um ponto
(abscissa e ordenada) e as envie para uma função que deve imprimir em que quadrante
(1, 2, 3 ou 4) o ponto está localizado.*/
        
        System.out.println("Digite valor de x: ");
        int x = Integer.parseInt(input.nextLine()); 
        System.out.println("Digite valor de y: ");
        int y = Integer.parseInt(input.nextLine()); 
        
       int quadrante = mostraQuadrante(x, y); 
        System.out.println("Quadrante: "+quadrante);
        
    }
    public static int mostraQuadrante(int x, int y){
        if (x>0 && y>0){
            return 1; 
        }
        else if (x<0 && y>0){
            return 2; 
        }
         else if (x<0 && y<0){
            return 3; 
        }
         else if (x>0 && y<0){
            return 4; 
        }
         else return 0; 
    }
}

