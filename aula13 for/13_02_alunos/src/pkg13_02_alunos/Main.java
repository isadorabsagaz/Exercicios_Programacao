package pkg13_02_alunos;

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        /*2: Faça um programa que leia a quantidade de
alunos de uma turma e idade de cada aluno. Por fim, o
programa deve calcular a idade média da turma, que deve
ser passada para uma função que imprimirá a idade média e
a seguinte mensagem:
– Turma de adultos, se a idade média for igual ou maior que 18
anos.
– Turma de jovens, se a idade média estiver entre 15 e 17 anos.
– Turma de adolescentes, se a idade média estiver entre 12 e
14 anos.
– Turma de crianças, se a idade média for menor que 12 anos.*/
        
      int alunos = leiaNumeroAlunos();
      int soma=0; 
      
        for(int i=1; i<=alunos; i++){
            System.out.println("Idade do aluno "+i+":");
            int idade = Integer.parseInt(input.nextLine());
            soma += idade; 
        }
      float media = calculaMedia(soma, alunos); 
      mostraTipoTurma(media);   
      
      
      
    }
     public static int leiaNumeroAlunos(){
        System.out.println("Digite o numero de alunos da turma: ");
         return Integer.parseInt(input.nextLine());
         
     } 
    public static float calculaMedia(int soma, int alunos){
        return (float) soma/alunos; 
       
    } 
    public static void mostraTipoTurma(float media){
         System.out.println("Idade media: "+media);
    if(media>=18){
            System.out.println("Turma de adultos");
        }    
        else if(media>=15 && media<=17){
            System.out.println("Turma de jovens");
        }
        else if(media>=12 && media<=14){
            System.out.println("Turma de adolescentes");
        }
        else
            System.out.println("Turma de criancas");
    }        
}

