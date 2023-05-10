/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Basico {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
                Scanner input = new Scanner (System.in); 
        
        String name;
       
                System.out.println ("Digite seu nome: ");
                   name = input.nextLine();   
        System.out.println ("Seja bem vindo, " + name);
    
    
       float num1 , num2 , m;
       
               System.out.println ("Faremos a média entre dois números.");
                       System.out.println  ("Para isso, digite o primeiro deles: ");
             num1 = Float.parseFloat (input.nextLine());
             System.out.println ("Agora, digite o segundo número: ");
              num2 = Float.parseFloat (input.nextLine());
              
              m = (num1+num2)/2;
              
            System.out.println ("A média entre eles é igual a " + m); 
    }
}
