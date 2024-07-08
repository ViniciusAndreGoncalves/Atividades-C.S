import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();

        System.out.print("Digite o gênero (M/F): ");
        char genero = input.next().charAt(0);

        double pesoIdeal;
        if (genero == 'M') {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("O peso ideal para um homem com essa altura é: " + pesoIdeal + " kg");
        } else if (genero == 'F') {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("O peso ideal para uma mulher com essa altura é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Erro: Gênero inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        input.close();
    }
}
