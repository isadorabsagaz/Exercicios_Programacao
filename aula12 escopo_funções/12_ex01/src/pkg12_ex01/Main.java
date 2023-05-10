/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_ex01;

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
       
        int a, b, c, d; 
        
        a = leiaNumero ("primeiro"); 
        b = leiaNumero("segundo"); 
        c = fazContas(a,b); 
        d = fazContas(a,c); 
        mostraResultado(c,d); 
        
    }   
   public static int fazContas (int n1, int n2){
       
        if (n1%2==0 && n2%2==0){
            return n1+n2;
        }
        else if (n1%2!=0 && n2%2!=0){
            return n1-n2; 
        }
        else 
           return n1*n2; 
          
    }
    
    public static int leiaNumero(String texto){
        Scanner input = new Scanner (System.in);
        
    System.out.println("Digite o "+texto+" valor: ");
        return Integer.parseInt(input.nextLine());
    }
 
    public static void mostraResultado(int c, int d){
        System.out.println("O valor de c e igual a "+c);
        System.out.println("O valor de d e igual a "+d);
    }
    
}

