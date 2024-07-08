import java.util.Scanner;

public class Exercicio08 {
    
    public static double calcularQ(double x, double y, double z, double a) {
        double resultado = x * x + y * y + z * z + a * a;
        return resultado;
    }
    public static void main(String[] args){        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Irei calcular a soma dos quadrado dos números inseridos. Por favor, insira quatro números:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double a = scanner.nextDouble();
        scanner.close();

        double resultado = calcularQ(x, y, z, a);
        System.out.println("O resultado é: " + resultado);
    }
}
