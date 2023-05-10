/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_02_caminhao;

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
        
        /* 8.2: Faça um programa que leia:
– O peso bruto do caminhão em toneladas (peso do caminhão e da carga).
– A tara do caminhão em toneladas (peso do caminhão vazio).
– O valor pago por tonelada da carga.
– O código da região de origem da carga de um caminhão (1 – Sul; 2 –
Sudeste; 3 – Centro-Oeste; 4 – Nordeste; 5 – Norte).
● O programa deve calcular e apresentar:
– O peso líquido da carga em quilos.
– O valor do imposto (Sul - 10% do valor da carga; Sudeste – 12%; Centro-
Oeste – 9%; Nordeste – 9.5%; Norte – 8%).
– O valor total transportado pelo caminhão, preço da carga mais imposto.*/
        
     float pBruto, pCaminhao, vCarga; 
     int codigo;         
     float v1, pCarga, pLq, vImposto, vTotal; 
    
        System.out.print("\nPeso bruto em T (caminhao e carga): ");
        pBruto = Float.parseFloat(input.nextLine());
        System.out.print("Tara caminhao em T (vazio): ");
        pCaminhao = Float.parseFloat(input.nextLine());
        System.out.print("Valor da tonelada de carga em R$: ");
        vCarga = Float.parseFloat(input.nextLine());
        System.out.println("Codigo da Regiao:  ");
        System.out.println("1-Sul");
        System.out.println("2-Sudeste");
        System.out.println("3-Centro-Oeste");
        System.out.println("4-Nordeste");
        System.out.println("5-Norte");
        System.out.print("Digite o codigo desejado: ");
        codigo = Integer.parseInt(input.nextLine());
        
        pCarga = pBruto - pCaminhao; 
        pLq = pCarga * 1000; 
        v1 = vCarga * pCarga;
        
        switch (codigo){
            case 1-> vImposto = (10/100f) * v1; 
            case 2-> vImposto = (12/100f) * v1;
            case 3-> vImposto = (9/100f) * v1;
            case 4-> vImposto = (float) ((double) (9.5/100f) * v1);
            default-> vImposto = (8/100f) * v1;
        }
        
        vTotal = v1 + vImposto;
        
        System.out.println("Peso liquido carga em quilos: "+pLq);
        System.out.println("Valor imposto em R$: "+vImposto);
        System.out.println("Valor total transportado em R$: "+vTotal);
        
    }
    
}
