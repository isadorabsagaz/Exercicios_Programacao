
package l5_06_aumentosalario;

import java.util.Scanner;

public class L5_06_aumentoSalario {
    static Scanner input = new Scanner (System.in); 

    public static void main(String[] args) {
       /*6) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários da categoria A ganharão 10% de aumento sobre o salário;
• Funcionários da categoria B ganharão 12% de aumento sobre o salário;
• Funcionários da categoria C ganharão 14% de aumento sobre o salário;
• Funcionários da categoria D ganharão 16% de aumento sobre o salário;
• Funcionários da categoria E ganharão 18% de aumento sobre o salário;
• Funcionários da categoria F ganharão 20% de aumento sobre o salário;
• Funcionários da categoria G ganharão 22% de aumento sobre o salário;
• Funcionários da categoria H ganharão 24% de aumento sobre o salário;
• Funcionários da categoria I ganharão 26% de aumento sobre o salário;
• Funcionários da categoria J ganharão 28% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia quantos funcionários a empresa possui, o nome de
cada funcionário, sua categoria e salário atual e imprima, para cada funcionário, o seu
nome, categoria e salário reajustado. O cálculo do reajuste deve ser feito em uma função.*/
       
        char categoria; 
        float salario; 
       
       
        System.out.println("Digite o numero de funcionarios da empresa: ");
            int numFunc = Integer.parseInt(input.nextLine()); 
            
        System.out.println("""
                           Categorias: 
                           [A]
                           [B] 
                           [C]
                           [D]
                           [E]
                           [F]
                           [G]
                           [H]
                           [I]
                           [J] 
                           [DEMAIS]""");    
            
        for(int i=1; i<=numFunc; i++){
            System.out.print("\nDigite o nome do funcionario "+i+": ");
                String nome = input.nextLine();
            System.out.print("Selecione a categoria do funcionario "+i+"-> ");
                categoria = input.nextLine().charAt(0);
            System.out.print("Digite o salario do funcionario "+i+": R$ ");
                salario = Float.parseFloat(input.nextLine()); 
            
            float novoSalario = calculaNovoSalario(categoria, salario); 
                
             
            imprimeResultados(nome, categoria, novoSalario); 
            
        }    
        System.out.println("\nFim do programa");
        
       
        
    }
    public static float calculaNovoSalario(char categoria, float salario){
        switch (categoria){
            case 'a', 'A': 
                return salario+=0.10*salario; 
             case 'b', 'B': 
                return salario+=0.12*salario;
                 case 'c', 'C': 
                return salario+=0.14*salario;
                 case 'd', 'D': 
                return salario+=0.16*salario;
                 case 'e', 'E': 
                return salario+=0.18*salario;
                 case 'f', 'F': 
                return salario+=0.20*salario;
                 case 'g', 'G': 
                return salario+=0.22*salario;
                 case 'h', 'H': 
                return salario+=0.24*salario;
                 case 'i', 'I': 
                return salario+=0.26*salario;
                 case 'j', 'J': 
                return salario+=0.28*salario;
                 default: 
                   return salario+=0.30*salario; 
                
        }
        
    }
    public static void imprimeResultados(String nome, char categoria, float novoSalario){
        System.out.println("\nFuncionario: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Novo salario: R$ "+novoSalario);
    }
}
