//15) Faça um programa leia o salário bruto e o número de dependentes de um funcionário
//    e calcule o seu salário líquido. Para calcular o salário líquido, deve-se descontar:
//    - 11% de INSS;
//    - 15% de Imposto de renda.
//    Após os descontos, deve-se adicionar um auxílio de R$ 150,00 por dependente.

import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu salário mensal bruto(antes de descontar os benefícios, vr e etc):");
        double grossSalary = input.nextDouble();

        System.out.println("Digite a quantidade de pessoas que você sustenta:");
        int people = input.nextInt();

        input.close();

        double netSalary = ((grossSalary - people) * 0.89) * 0.85;

        System.out.println("O seu salário líquido é de "+ netSalary +" reais mensais.");

    }

}
