/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_17_parcelas;

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
       
        System.out.print("\nNumero parcelas: ");
       int p = Integer.parseInt(input.nextLine());
        System.out.print("Parcelas pagas: ");
       int pg = Integer.parseInt(input.nextLine());
        System.out.print("Valor de cada parcela R$: ");
       float vp = Float.parseFloat (input.nextLine());
       
       float jaPago = pg * vp;
       float total = p*vp; 
       float restante = total - jaPago;
       
        System.out.println("\nValor ja pago em R$: "+jaPago);
        System.out.println("Valor restante a ser pago em R$: "+restante);
        
    }
    
}
