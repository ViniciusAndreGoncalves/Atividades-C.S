import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        int contadorMulheres = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura (em metros) da pessoa " + (i+1) + ":");
            double altura = input.nextDouble();

            System.out.println("Digite o código do sexo (1 para masculino, 2 para feminino) da pessoa " + (i+1) + ":");
            int codigoSexo = input.nextInt();

            somaAlturaTurma += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (codigoSexo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
        double mediaAlturaTurma = somaAlturaTurma / 10;

        System.out.println("A maior altura da turma é: " + maiorAltura + " metros.");
        System.out.println("A média de altura das mulheres é: " + mediaAlturaMulheres + " metros.");
        System.out.println("A média de altura da turma é: " + mediaAlturaTurma + " metros.");

    }
}
