import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int quantidadeRuim = 0;
        int idadeMinima = Integer.MAX_VALUE;
        int idadeMaxima = Integer.MIN_VALUE;

        for (int i = 0; i < 20; i++) {
            System.out.println("Resposta do espectador " + (i + 1) + ":");

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Opinião (A, B, C ou D): ");
            char opiniao = input.next().charAt(0);

            if (opiniao == 'A') {
                quantidadeOtimo++;
            }

            if (opiniao == 'D') {
                somaIdadeRuim += idade;
                quantidadeRuim++;
            }

            if (idade < idadeMinima) {
                idadeMinima = idade;
            }
            if (idade > idadeMaxima) {
                idadeMaxima = idade;
            }
        }

        double mediaIdadeRuim = quantidadeRuim > 0 ? (double) somaIdadeRuim / quantidadeRuim : 0;

        int diferencaIdade = idadeMaxima - idadeMinima;

        System.out.println("Quantidade de respostas 'Ótimo': " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam 'Ruim': " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa mais velha e a mais nova: " + diferencaIdade);

    }
}
