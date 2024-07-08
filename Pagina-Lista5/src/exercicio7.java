import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Digite o nome do hóspede:");
            String nome = input.nextLine();

            System.out.println("Digite o tipo do apartamento utilizado (A, B ou C):");
            char tipoApartamento = input.next().charAt(0);

            System.out.println("Digite o número de diárias utilizadas pelo hóspede:");
            int numeroDiarias = input.nextInt();

            double valorDiaria = 0;

            switch (tipoApartamento) {
                case 'A':
                    valorDiaria = 150.00;
                    break;
                case 'B':
                    valorDiaria = 100.00;
                    break;
                case 'C':
                    valorDiaria = 75.00;
                    break;
                default:
                    System.out.println("Tipo de apartamento inválido!");
                    System.exit(1);
            }

            double totalPagar = valorDiaria * numeroDiarias;

            System.out.println("\nNome do hóspede: " + nome);
            System.out.println("Tipo do apartamento: " + tipoApartamento);
            System.out.println("Valor total das diárias: R$" + totalPagar);

            System.out.println("\nDeseja continuar? (S/N)");
            continuar = input.next().charAt(0);

            input.nextLine();
        } while (continuar == 'S' || continuar == 's');

    }
}
