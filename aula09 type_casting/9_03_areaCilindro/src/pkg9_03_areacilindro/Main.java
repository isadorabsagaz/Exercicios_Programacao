/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_03_areacilindro;

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
        
       /* 9.3: Faça um programa que leia o valor da lata de
tinta, o raio e a altura de um tanque cilíndrico e calcule o custo
para pintar este tanque. Considere que cada lata de tinta pinta
12 metros quadrados. O programa deve apresentar a área a ser
pintada, a quantidade de latas necessárias e o valor gasto.*/
       
        System.out.print("\nValor por lata em R$: ");
        float valorLata = Float.parseFloat (input.nextLine());
        System.out.print("Raio do tanque cilindrico em m: ");
        float raioTanque = Float.parseFloat (input.nextLine());
        System.out.print("Altura do tanque cilindrico em m: ");
        float alturaTanque = Float.parseFloat (input.nextLine());
        
        
        double areaBase = Math.PI*raioTanque*raioTanque;
        double areaLateral = 2*Math.PI*raioTanque*alturaTanque; 
        double areaTanque = 2*areaBase + areaLateral;
        
       double quantLatas = areaTanque/12f; 
      
       double valorGasto = Math.ceil(quantLatas) * valorLata; 
       
        System.out.println("\nArea pintada em metros quadrados: "+areaTanque);
        System.out.println("Quantidade de latas necessarias: "+Math.ceil(quantLatas));       
        System.out.println("Valor total gasto em R$: "+valorGasto);
        
    }
    
}
