//16) Faça um programa que leia o preço de três mercadorias no dia 01/01/2022 e o no dia
//    01/02/2022. Em seguida o programa deve calcular a inflação do período, considerando a
//    variação de preço dos três produtos. Mostre uma mensagem se a inflação está acima da
//    meta ou não (considere que a meta para o mês é de 0,55%).

import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA DE INFLAÇÃO.");

        System.out.println("Recorde uma mercadoria que você comprou mês passado e digite o nome dela:");
        String grossery1 = input.nextLine();
        System.out.println("Digite o valor dela:");
        double grossery1Price = input.nextDouble();
        input.nextLine();

        System.out.println("Agora digite o nome de outra mercadoria qualquer, que você adquiriu na mesma data:");
        String grossery2 = input.nextLine();
        System.out.println("Digite o valor dela:");
        double grossery2Price = input.nextDouble();
        input.nextLine();

        System.out.println("E por fim, insira mais uma mercadoria:");
        String grossery3 = input.nextLine();
        System.out.println("Digite o valor dela:");
        double grossery3Price = input.nextDouble();
        input.nextLine();

        System.out.println("Agora insira o valor da primeira mercadoria, porém com a compra tendo sido feita um mês após a primeira:");        
        double grossery1_2Price = input.nextDouble();
        input.nextLine();

        System.out.println("Insira novamente a segunda com o preço atualizado:");
        double grossery2_2Price = input.nextDouble();
        input.nextLine();

        System.out.println("Insira novamente a terceira com o preço atualizado:");
        double grossery3_2Price = input.nextDouble();
        input.nextLine();

        input.close();

        double x = grossery1_2Price / grossery1Price;
        double y = grossery2_2Price / grossery2Price;
        double z = grossery3_2Price / grossery3Price;
        double inflationRate = (x + y + z) / 3;

        if (inflationRate > 0.55) {
            System.out.println("A inflação está acima da meta estipulada pelo BCB(0,55%).");
        }

        System.out.println("A variação no preço do(a) "+ grossery1 +" foi de "+ x +"%.");
        System.out.println("A variação no preço do(a) "+ grossery2 +" foi de "+ y +"%.");
        System.out.println("A variação no preço do(a) "+ grossery3 +" foi de "+ z +"%.");
        System.out.println("A inflação média do período foi de aproximadamente "+ inflationRate +"%.");

        // IPCA janeiro 2022 = 9,53% | IPCA fevereiro 2022 = 10,54%

    }

}

