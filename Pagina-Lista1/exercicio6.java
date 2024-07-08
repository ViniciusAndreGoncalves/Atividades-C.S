import java.util.Scanner;
public class Exercicio07 {

    public static double calcularQu(double x){
        return x * x;
    }

        public static void main (String[] args) {

        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Irei calcular o quadrado de um número real. Por favor, insira um número:");
        double x = scanner.nextDouble();
        scanner.close();

        double resultado = calcularQu(x);
        System.out.println("O resultado é: "+ resultado +"");
    }
    
}
