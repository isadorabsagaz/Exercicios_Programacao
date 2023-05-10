/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_07_engenheiros;

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
        
      /*  7) Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
paredes e o volume da sala.   O programa deve mostrar também o tamanho do aparelho de
ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
inferior a 100 m3; um aparelho médio deve ser instalado se o volume da sala estiver entre 100 e 500; 
e um aparelho grande deve ser instalado caso o volume seja superior a 500 m3*/

        
        System.out.print("\nComprimento sala: ");  
        int c = Integer.parseInt(input.nextLine());
        System.out.print("Largura sala: ");  
        int l = Integer.parseInt(input.nextLine());
        System.out.print("Altura sala: ");  
        int h = Integer.parseInt(input.nextLine());
        
        int aPiso = c*l; 
        int aParedes = 2*c*h + 2*l*h; 
        int vol = c*h*l; 
        
        boolean arP = vol<100; 
        boolean arM = vol>=100 && vol<=500; 
        boolean arG = vol>500;
        
        System.out.print("\nArea piso em m²: "+aPiso);
        System.out.print("\nArea paredes em m²: "+aParedes);        
        System.out.print("\nVolume sala em m³: "+vol);
                System.out.print("\nAr pequeno? "+arP);
                System.out.print("\nAr medio? "+arM);
                System.out.println("\nAr grande? "+arG);
    }
    
}
