/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_14_vestibular;

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
        
        /*14) Considere que o último concurso vestibular apresentou três provas: Português,
        Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
        contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
        programa que leia estes dados e apresente:
    a) o nome e as notas em cada prova do candidato.
    b) a média do candidato.
    c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
    candidato é aprovado se sua média for maior que 7.0 e se não apresentou
    nenhuma nota abaixo de 5.0*/
        
        String nome; 
        float port, mat, cg, media; 
        boolean aprovado; 
        
        System.out.print("\nNome candidato: ");
        nome = input.nextLine();
        System.out.print("Nota Portugues: ");
        port = Float.parseFloat(input.nextLine());
        System.out.print("Nota Matematica: ");
        mat = Float.parseFloat(input.nextLine());
        System.out.print("Nota Conhecimentos Gerais: ");
        cg = Float.parseFloat(input.nextLine());
        
        media = (float) (port+mat+cg)/3;
        aprovado = media>7 && (port>5 && mat>5 && cg>5); 
        
        System.out.print("\nAluno: "+nome+". Nota "+port+" em Portugues");
        System.out.print("\nNota "+mat+" em Matematica");
        System.out.print("\nNota "+cg+" em Conhecimentos Gerais");
        System.out.print("\nMedia de "+nome+": "+media);
        System.out.println("\n"+nome+ " aprovado? "+aprovado);
        
    }
    
}
