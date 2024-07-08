import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        String numero = input.nextLine();

        System.out.println("Informe o saldo atual:");
        double saldoAtual = input.nextDouble();

        System.out.println("Informe o tipo de operação (1 - depósito, 2 - saque):");
        int tipoOperacao = input.nextInt();

        System.out.println("Informe o valor da operação:");
        double valorOperacao = input.nextDouble();

        double novoSaldo;

        if (tipoOperacao == 1) {
            novoSaldo = saldoAtual + valorOperacao;
        } else if (tipoOperacao == 2) {
            novoSaldo = saldoAtual - valorOperacao;
        } else {
            System.out.println("Tipo de operação inválido");
            return;
        }

        System.out.println("Novo saldo: " + novoSaldo);

        if (novoSaldo < 0) {
            System.out.println("Conta estourada");
        }
    }
}
