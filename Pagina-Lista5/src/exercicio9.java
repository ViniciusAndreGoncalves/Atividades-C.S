import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cpf;
        do {
            System.out.print("Informe o CPF (ou 00 para sair): ");
            cpf = input.nextLine();

            if (cpf.equals("00")) {
                break; 
            }

            System.out.print("Informe a renda mensal: ");
            double rendaMensal = Double.parseDouble(input.nextLine());

            System.out.print("Informe a classe de renda (A, B, C, D ou E): ");
            char classeRenda = input.nextLine().toUpperCase().charAt(0);

            double aliquota;
            switch (classeRenda) {
                case 'A':
                    aliquota = 0;
                    break;
                case 'B':
                    aliquota = 0.05;
                    break;
                case 'C':
                    aliquota = 0.1;
                    break;
                case 'D':
                    aliquota = 0.15;
                    break;
                case 'E':
                    aliquota = 0.2;
                    break;
                default:
                    System.out.println("Classe de renda inválida. Por favor, tente novamente.");
                    continue;
            }

            double impostoDeRenda = rendaMensal * aliquota;
            System.out.println("Alíquota de desconto aplicada: " + (aliquota * 100) + "%");
            System.out.println("Valor a ser descontado: R$" + impostoDeRenda);

        } while (!cpf.equals("00"));

        System.out.println("Encerrando o programa...");
    }
}
