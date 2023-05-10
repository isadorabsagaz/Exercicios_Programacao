package l4_06_notaaluno;

import java.util.Scanner;


public class L4_06_notaAluno {
     static Scanner input = new Scanner (System.in); 
  
    public static void main(String[] args) {
        /*6) Suponha que o conceito de um aluno seja determinado em função da sua nota,
conforme a tabela abaixo. Crie um programa que leia o nome e a nota de um aluno e
passe-a por parâmetro para uma função que deve retornar o seu conceito. Por fim, o
programa deve apresentar o nome, a nota e o conceito do aluno.
    0 a 49 Insuficiente
    50 a 64 Regular
    65 a 84 Bom
    85 a 100 Ótimo*/
        
     String nome = leiaNome(); 
     float nota = leiaNota(nome);
     verificaConceito(nome, nota); 
     
     
     
    }
    public static String leiaNome(){
        System.out.println("Digite seu nome: ");
        return input.nextLine(); 
    }
    public static float leiaNota(String nome){
        System.out.println(nome+", digite sua nota: ");
         return Float.parseFloat(input.nextLine());
    }
    public static void printaNomeENOta (String nome, float nota){
         System.out.println("Aluno: "+nome);  
         System.out.println("Nota: "+nota);  
    } 
    public static void verificaConceito (String nome, float nota){
        if (nota>=0 && nota<=49){
            printaNomeENOta(nome, nota);
            System.out.println("Conceito: Insuficiente!");        
        }   
        else if (nota>49 && nota<=64){
            printaNomeENOta(nome, nota);  
            System.out.println("Conceito: Regular!"); 
        }
        else if (nota>64 && nota<=84){
            printaNomeENOta(nome, nota);   
            System.out.println("Conceito: Bom!");
        }
        else if (nota>84 && nota<=100){
           printaNomeENOta(nome, nota); 
            System.out.println("Conceito: Otimo!"); 
        } 
        else 
            System.out.println("Nota digitada e invalida!");

    }
      
}
