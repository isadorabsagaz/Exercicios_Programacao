/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_10_desafio_aviao;

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
        
        
       /* 10) (DESAFIO) Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
     decolar de um aeroporto, várias condições devem ser satisfeitas: 
        caso a pista seja menor que 1,5 Km, o avião deve pesar menos que 40 toneladas, 
        caso a pista possua entre 1,5 e 2 Km, o avião não deve ultrapassar as 60 toneladas. 
        Caso a pista seja superior a 2 Km, qualquer avião pode decolar. 
        Caso a visibilidade seja inferior a 20 metros, apenas aviões com sistema de decolagem computadorizada podem decolar. 
        Se estiver chovendo acima de 5 mm, nenhum avião pode decolar. 
        Se o avião possuir mais de 100 passageiros e estiver chovendo (independente da intensidade),o avião não pode decolar. 
        Escreva um programa que leia o tamanho da pista, o peso do avião, visibilidade, intensidade da chuva
     (o usuário deve digitar 0 caso não esteja chovendo), número de passageiros e se possui
     sistema de decolagem automatizada, e indique se o avião pode decolar ou não.*/
        
        float pista; 
        int peso, vis, chuva, pas; 
        boolean dAut, decolar, c1, c2, c3, c4, c4_1, c5, c6; 
        
        System.out.print("\nTamanho da pista em Km: ");
        pista = Float.parseFloat(input.nextLine());
        System.out.print("Peso aviao em toneladas: ");
        peso = Integer.parseInt(input.nextLine());
        System.out.print("Visibilidade em metros: ");
        vis = Integer.parseInt(input.nextLine());
        System.out.print("Intensidade chuva em mm: ");
        chuva = Integer.parseInt(input.nextLine());
        System.out.print("Numero de passageiros: ");
        pas = Integer.parseInt(input.nextLine());
        System.out.print("Possui decolagem automatizada? ");
        dAut = Boolean.parseBoolean(input.nextLine());
        
        c1 = pista<1.5 && peso<40; 
        c2 = (pista>=1.5 && pista<=2) && (peso<60);
        c3 = pista>2;
        
        c4_1 = vis>=20; 
        c4 = vis<20 && dAut; 
        
        c5 = chuva>5; 
        c6 = chuva>=1 && pas>100; 
        
        decolar = ((c1 || c2 || c3) && (c4_1 || c4)) && !(c5 || c6); 
        
        System.out.println("\nO aviao vai decolar? "+decolar);
        
        
        
        
    }
    
}
