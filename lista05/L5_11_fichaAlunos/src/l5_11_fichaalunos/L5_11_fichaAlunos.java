package l5_11_fichaalunos;

import java.util.Scanner;


public class L5_11_fichaAlunos {
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        /*11) Considere que para cada aluno de uma universidade, tenha-se as seguintes
informações: nome do aluno, renda mensal da família, gasto com alimentação, gasto com
aluguel e outros gastos. Faça um programa que leia estes dados, calcule e apresente:
a) Para cada aluno:
- Seu gasto total;
- A proporção de gastos com alimentação em relação a sua renda;
- A proporção de gastos com aluguel em relação a sua renda;
b) O gasto médio com alguel.
c) O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00.
O programa deve ler e processar a ficha de um aluno e no final perguntar se
deseja-se registrar mais algum aluno (SIM ou NÃO).*/
        
        char continuar=0;
        float gastoMedioTotal=0; 
        
        do{ 
            System.out.print("\nNome aluno: ");
            String nome = input.nextLine(); 
      
        float rendaMensal = leiaGastos("Renda mensal da familia: R$ ");
        float gastoAlimentacao = leiaGastos("Gasto com alimentacao: R$ "); 
        float gastoAluguel = leiaGastos("Gasto com aluguel: R$ ");
        float gastoDiversos = leiaGastos("Gasto diversos: R$ ");
        
        float gastoTotal = calculaGastoTotal(gastoAlimentacao, gastoAluguel, gastoDiversos); //a)
        float proporcaoAlimentacao = calculaProporcao(rendaMensal, gastoAlimentacao); 
        float proporcaoAluguel = calculaProporcao(rendaMensal, gastoAluguel); 
        
        float gastoMedioAluguel = calculaGastoMedioAluguel(gastoTotal, gastoAluguel); //b) 
        
            if(rendaMensal>2000){
            gastoMedioTotal = calculaGastoMedioTotal(rendaMensal, gastoTotal);  //c)   
            }
               
        imprimeResultados(gastoTotal, proporcaoAlimentacao, proporcaoAluguel, gastoMedioAluguel, gastoMedioTotal); 
        
            System.out.println("Deseja registrar mais um aluno? ");
            continuar = input.nextLine().charAt(0); 
        
        }while(continuar!='n');
      
        
        
        
        
        
    }
    public static float leiaGastos(String texto){
        System.out.print("\n"+texto);
        return  Float.parseFloat(input.nextLine()); 
    }
    public static float calculaGastoTotal(float gastoAlim, float gastoAlug, float gastoDiv){
        return gastoAlim + gastoAlug + gastoDiv; 
    }
    public static float calculaProporcao(float renda, float gasto){
        return gasto*100/renda; 
    }
    public static float calculaGastoMedioAluguel(float gastoTotal, float gastoAlug){
        return gastoTotal/gastoAlug;     
    }
    public static float calculaGastoMedioTotal(float rendaMensal, float gastoTotal){
        return rendaMensal/gastoTotal; 
    }
    public static void imprimeResultados(float gastoTotal, float propAlim, float propAlug, float gastoAlug, float gastoMedio){
        System.out.println("Gasto total: R$ "+ gastoTotal);   
        System.out.println("Proporcao alimentacao em relacao a renda: "+ propAlim+"%");   
        System.out.println("Proporcao aluguel em relacao a renda: "+ propAlug+"%");     
        System.out.println("Gasto medio com aluguel: R$ "+gastoAlug);
        System.out.println("Gasto medio total: R$ "+gastoMedio);
    }
}
