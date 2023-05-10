/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_01_true_false;


/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        boolean a = 5+3*6/2>=10; 
        boolean b = 36/3*2-5+8 == 27;
        boolean c = !(30/4*6==15);
        boolean d = (30%4*6==10) || true; 
        boolean e = (5*7%3)+4/2+5 == 12 && (12/4<8);
        boolean f = (((5*7%3+5)/2+5)<=14)||(!(12/4<8*2));
        
        System.out.print("\nResposta a: "+a);
        System.out.print("\nResposta b: "+b);
        System.out.print("\nResposta c: "+c);
        System.out.print("\nResposta d: "+d);
        System.out.print("\nResposta e: "+e);
        System.out.println("\nResposta f: "+f);
      
    }
    
}
