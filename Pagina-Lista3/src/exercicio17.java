import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu peso na Terra (em kg): ");
        double pesoTerra = input.nextDouble();

        System.out.println("Digite o código do planeta desejado:");
        System.out.println("1. Mercúrio");
        System.out.println("2. Vênus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Netuno");

        int codigoPlaneta = input.nextInt();

        double pesoPlaneta = 0;

        switch (codigoPlaneta) {
            case 1:
                pesoPlaneta = pesoTerra * 0.37; // Mercúrio
                break;
            case 2:
                pesoPlaneta = pesoTerra * 0.88; // Vênus
                break;
            case 3:
                pesoPlaneta = pesoTerra * 0.38; // Marte
                break;
            case 4:
                pesoPlaneta = pesoTerra * 2.64; // Júpiter
                break;
            case 5:
                pesoPlaneta = pesoTerra * 1.15; // Saturno
                break;
            case 6:
                pesoPlaneta = pesoTerra * 1.17; // Urano
                break;
            case 7:
                pesoPlaneta = pesoTerra * 1.18; // Netuno
                break;
            default:
                System.out.println("Código de planeta inválido!");
        }

        System.out.println("Seu peso no planeta escolhido é: " + pesoPlaneta + " kg");

    }

}
