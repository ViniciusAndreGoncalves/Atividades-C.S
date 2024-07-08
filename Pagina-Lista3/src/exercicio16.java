import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a abscissa do ponto:");
        double x = input.nextDouble();

        System.out.println("Digite a ordenada do ponto:");
        double y = input.nextDouble();

        int quadrante;

        if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else if (x > 0 && y < 0) {
            quadrante = 4;
        } else {
            quadrante = 0;
        }

        if (quadrante != 0) {
            System.out.println("O ponto está localizado no quadrante " + quadrante + ".");
        } else {
            System.out.println("O ponto está na origem.");
        }
    }

}
