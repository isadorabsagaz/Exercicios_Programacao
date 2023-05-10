/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_08_raio;

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
       Scanner input  = new Scanner (System.in);
        
        /*8) Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
pessoa.     ENTRADA: TEMPO EM SEG   SAÍDAS: DISTANCIA E PERIGO*/
        
        System.out.print("\nTempo entre raio e trovao (em segundos): ");
        float t = Float.parseFloat(input.nextLine());
        
       float  dist = 340*t; 
       boolean p = dist<200;
       
        System.out.print("\nDistancia do raio: "+dist);
        System.out.println("\nApresentou perigo? "+p);
        
       
       
    }
    
}
