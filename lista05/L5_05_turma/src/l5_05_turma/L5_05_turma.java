
package l5_05_turma;

import java.util.Scanner;


public class L5_05_turma {
     static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*5) Para uma turma de 45 alunos, construa um programa que leia a idade e a altura de
cada aluno e determine:
a) Quanto alunos tem menos de 18 anos.
b) A idade média dos alunos com menos de 1,70m de altura.
c) A altura média dos alunos com mais de 20 anos.*/
        
            int countIdade=0; 
            int somaIdade=0, countIdadeMedia=0; 
            float somaAltura=0, countAlturaMedia=0; 
        
         for(int i=0; i<45; i++){  //MUDAR PARA 45 DEPOIS!!!    
            float idade = leiaValores("idade"); 
            float altura = leiaValores("altura"); 
            
            if (idade<18){
                countIdade++; 
            }
            if (altura<1.7){
                somaIdade += idade;
                countIdadeMedia++; 
            }
            if (idade>=20){
                somaAltura += altura; 
                countAlturaMedia++; 
            }
         }
        int mediaIdade = somaIdade/countIdadeMedia; 
        float mediaAltura = (float) somaAltura/countAlturaMedia; 
        
        mostraResultados(countIdade, mediaIdade, mediaAltura); 
            
    }
  public static float leiaValores(String texto){ 
    System.out.println("Digite a "+texto+" do aluno: ");
         return Float.parseFloat(input.nextLine()); 
  }
  public static void mostraResultados(int countIdade, int mediaIdade, float mediaAltura){
      System.out.println("Quantidade de alunos com menos de 18 anos: "+countIdade);
      System.out.println("Idade media dos alunos com menos de 1,70m de altura: "+mediaIdade);
      System.out.println("A altura media dos alunos com mais de 20 anos: "+mediaAltura);
  }
  
}
