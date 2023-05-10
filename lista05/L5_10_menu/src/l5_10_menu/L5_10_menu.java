package l5_10_menu;
 
import java.util.Scanner;

public class L5_10_menu {
    static Scanner input = new Scanner (System.in);
 
    public static void main(String[] args) {
        /*10) Faça um programa que funcione de forma semelhante a um menu. O programa deve
apresentar as opções abaixo na tela e solicitar que o usuário digite a opção desejada:
1 – Inclusão de cliente.
2 – Alteração de cliente.
3 – Exclusão de cliente.
4 – Visualização de cliente.
5 – Sair.
        Quando o usuário digitar um valor entre 1 e 4, o programa deve apresentar uma
mensagem na tela com a função selecionada e apresentar o menu novamente. Se o
usuário digitar 5, o programa deve ser encerrado. Se o usuário digitar qualquer outro
valor, o programa deve mostrar a mensagem "Opção inválida" e apresentar o menu
novamente.*/  
        
      int opcao; 
             
        do{
           opcao= retornaMenu(); 
           String funcaoSelecionada = retornaOpcaoSelecionada(opcao);
           System.out.println(funcaoSelecionada); 
        }while(opcao!=5);     
            
            
        
        
            
    }
    public static int retornaMenu(){
     System.out.println("Selecione uma opcao: ");
        System.out.println("""
                            [1] - Inclusao de cliente
                            [2] - Alteracao de cliente
                            [3] - Exclusao de cliente
                            [4] - Visualisacao de cliente
                            [5] - Sair
                           """);
        System.out.print("\nOpcao selecionada -> ");
    return Integer.parseInt(input.nextLine()); 
    }
    
    public static String retornaOpcaoSelecionada(int opcao){
        switch(opcao){
            case 1: return "\n-> [1] - Inclusao de cliente";
            case 2: return "\n-> [2] - Alteracao de cliente";
            case 3: return "\n-> [3] - Exclusao de cliente";
            case 4: return "\n-> [4] - Visualisacao de cliente"; 
            case 5: return "\n-> [5] - Sair"; 
        }  
        return "Opcao inavalida!";
    }
}
