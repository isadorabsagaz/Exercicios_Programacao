/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosaula4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExerciciosAula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*03 e 04*/
        int x, y, sq; 
        int qs; 
        /*05*/
        int b, h, area, per; 
        /*06*/
        float C, F; 
        /*07*/
        int p1, p2, p3; 
        double v1, v2, v3, total; 
        /*08*/
        double salM, vendas, salT; 
        int carros; 
        /*09*/
        int Q, L, B; 
        float X, Y, Z, cafe, leite, bolacha, totalCompra; 
        /*10*/
        int numero;
        float quo, resto; 
        /*11*/
        int tempoS;
        float hora, resto1, min, segundo; 
        /*12*/
        double peso, valorPrato; 
       /*13*/
        int hora2, min2, seg2, segDia; 
        /*14*/
        int hora3, min3, seg3, segDia3, segPacabar; 
        /*15*/
        double pesoPessoa, engordar, emagrecer; 
        /*16*/
        String Ok; 
        double C1, C2, salJoao; 
        
        /*exercicios 03-soma dos quadrados - e 04 - quadrado da soma*/
        System.out.print("\nDigite um numero: ");
        x = Integer.parseInt(input.nextLine());
     
        System.out.print("Digite outro numero: ");
        y = Integer.parseInt(input.nextLine());
        
       
        /*exercicio 05-area e perimetro retangulo*/
        System.out.print("\nDigite a base do retangulo: ");
        b = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite a altura do retangulo: ");
        h = Integer.parseInt(input.nextLine());
        
        
        /*exercicio 06-conversao temp*/
        System.out.print("\nDigite a temperatura em Celsius: ");
        C = Float.parseFloat(input.nextLine());
        
      
        /*exercicio 07-picoles*/
        System.out.print("\nQuantos picoles do tipo1? ");
        p1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Quantos picoles do tipo2? ");
        p2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Quantos picoles do tipo3? ");
        p3 = Integer.parseInt(input.nextLine());
        
        
        /*exercicio 08-venda carros*/
        System.out.print("\nValor salario minimo em R$: ");
        salM = Float.parseFloat(input.nextLine());
        
        System.out.print("Quantos carros foram vendidos? ");
        carros = Integer.parseInt(input.nextLine());
        
        System.out.print("Valor das vendas em R$: ");
        vendas = Float.parseFloat(input.nextLine());
       
        
        
        /*exercicio 09-compras mercado*/
        System.out.print("\nValor do quilo de cafe: ");
        X = Float.parseFloat(input.nextLine());
        System.out.print("Quantos quilos de cafe? ");
        Q = Integer.parseInt(input.nextLine()); 
        
        System.out.print("Valor do litro de leite: ");
        Y = Float.parseFloat(input.nextLine());
        System.out.print("Quantos litros de leite? ");
        L = Integer.parseInt(input.nextLine());
        
        System.out.print("Valor pacotes de bolacha: ");
        Z = Float.parseFloat(input.nextLine());
        System.out.print("Quantos pacotes de bolacha? ");
        B = Integer.parseInt(input.nextLine()); 
            
        
        /*exercicio 10-quociente e resto*/
        System.out.print("\nDigite um numero inteiro: ");
        numero = Integer.parseInt(input.nextLine());
        
        
        /*exercicio 11-tempo*/
        System.out.print("\nTempo em segundos: ");
        tempoS = Integer.parseInt(input.nextLine());
        
        
        /*exercicio 12-restaurante quilo*/
        System.out.print("\nDigite o peso total do prato em Kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        /*exercicio 13-segundos em um dia*/
        System.out.print("\nSegundos em um dia - Horas: ");
        hora2 = Integer.parseInt(input.nextLine());
        System.out.print("Minutos: ");
        min2 = Integer.parseInt(input.nextLine());
        System.out.print("Segundos: ");
        seg2 = Integer.parseInt(input.nextLine());
       
        /*exercicio 14-segundos para acabar o dia*/
        System.out.print("\nSegundos para acabar o dia - Horas: ");
        hora3 = Integer.parseInt(input.nextLine());
        System.out.print("Minutos: ");
        min3 = Integer.parseInt(input.nextLine());
        System.out.print("Segundos: ");
        seg3 = Integer.parseInt(input.nextLine());
        
        /*exercicio 15-novo peso corporal*/
        System.out.print("\nPeso da pessoa agora, em Kg: ");
        pesoPessoa = Double.parseDouble(input.nextLine());
        
        /*exercicio 16-salário João*/
        System.out.print("\nJoao recebeu R$1500.00, porem tem duas contas a pagar com multas, logo seu montante diminuiu.");
        Ok = input.nextLine();
        
       /*03*/
        sq = x*x + y*y;
        /*04*/
        qs = (x+y)*(x+y); 
        /*05*/
        area = (b*h);
        per = b*2 + h*2; 
        /*06*/
        F = (9*C)/5+32;
        /*07*/
        v1 = p1*1.50;
        v2 = p2*2;
        v3 = p3*0.75;   
        total = v1+v2+v3; 
        /*08*/
        salT = 2*salM +(150*carros)+(0.05*vendas); 
        /*09*/
        cafe = Q*X;
        leite = L*Y;
        bolacha = B*Z;
        totalCompra = cafe+leite+bolacha; 
        /*10*/
        quo = numero/2;
        resto = numero%2;
        /*11*/
        hora = (int) tempoS/3600;
        resto1 = (int) tempoS%3600;
        min = (int) resto1/60;
        segundo = (int)resto1%60;
        /*12*/
        valorPrato = peso*39 - 17.55;
        /*13*/
        segDia = hora2*3600 + min2*60 + seg2; 
        /*14*/
        segDia3 = hora3*3600 + min3*60 + seg3;
        segPacabar = 86400- segDia3; 
        /*15*/
        engordar = pesoPessoa + 0.15*pesoPessoa; 
        emagrecer = pesoPessoa - 0.2*pesoPessoa; 
        /*16*/
        C1 = 200;
        C2 = 120;
        salJoao = 1500 - (0.02*C1 + 0.02*C2); 
        
        
        System.out.print("\n03. A soma entre os quadrados de "+x+ " e " +y+ " e igual a "+sq);
        System.out.print("\n04. O quadadro da soma entre "+x+ " e "+y+" e igual a "+qs);
        System.out.print("\n05. A area do retangulo e "+area+ " e seu perimetro "+per);
        System.out.print("\n06. A temperatura em Celsius "+C+" vale "+F+" em Fahrenheit");
        
        System.out.print("\n07. O picole1 vendeu R$"+v1);
        System.out.print("\nO picole2 vendeu R$"+v2);
        System.out.print("\nO picole3 vendeu R$"+v3);
        System.out.println("\nO total arrecadado pelos picoles e de R$"+total);
        
        System.out.println("\n08. O valor do total do salario e de R$"+salT);
        
        System.out.print("\n09. Custo de R$"+cafe+" com o cafe");
        System.out.print("\nCusto de R$"+leite+ " com o leite");
        System.out.print("\nCusto de R$"+bolacha+" com a bolacha");
        System.out.println("\nTotal gasto na compra: R$"+totalCompra);
        
        System.out.print("\n10. O quociente da divisao de "+numero+" por 2 e igual a "+quo);
        System.out.println("\nO resto da divisao de "+numero+" por 2 e igual a "+resto);
        
        System.out.println("\n11. O tempo em horas e de "+hora+"h "+min+"min e "+segundo+"s");

        System.out.println("\n12. O valor a ser pago pela comida e de R$"+valorPrato);
        
        System.out.println("\n13. Ja se passaram "+segDia+" segundos nesse dia");
        
        System.out.println("\n14. Faltam "+segPacabar+" para este dia acabar");
        
        System.out.print("\n15. Ao engordar 15%, a pessoa esta com "+engordar+" Kg");
        System.out.println("\nAo emagrecer 20%, a pessoa esta com "+emagrecer+" Kg");
        
        System.out.println("\n16. O novo salario de Joao sera de R$"+salJoao);
        
        
    }
   
    
}
