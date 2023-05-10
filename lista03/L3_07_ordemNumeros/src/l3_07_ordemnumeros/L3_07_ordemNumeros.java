/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_07_ordemnumeros;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class L3_07_ordemNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       // 7) Faça um programa que leia três valores inteiros e os imprima em ordem crescente.
   
        System.out.println("Primeiro numero: ");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.println("Segundo numero: ");
        int n2 = Integer.parseInt(input.nextLine());
        System.out.println("Terceiro numero: ");
        int n3 = Integer.parseInt(input.nextLine());
        
            if(n1<=n2 && n1<=n3 && n2<=n3){
                    System.out.println("Numeros em ordem: "+n1+" "+n2+" "+n3);
            }        
            else if (n1<=n2 && n1<=n3 && n2<=n3){
                    System.out.println("Numeros em ordem: "+n1+" "+n3+" "+n2);
            }        
             else if (n2<=n1 && n2<=n3 && n1<=n3){
                    System.out.println("Numeros em ordem: "+n2+" "+n1+" "+n3);
            }        
             else if (n2<=n1 && n2<=n3 && n3<=n1){
                    System.out.println("Numeros em ordem: "+n2+" "+n3+" "+n1);
            }
             else if (n3<=n1 && n3<=n1 && n1<=n2){
                    System.out.println("Numeros em ordem: "+n3+" "+n1+" "+n2);
            }
             else
                 System.out.println("Numeros em ordem: "+n3+" "+n2+" "+n1);
            }
}
