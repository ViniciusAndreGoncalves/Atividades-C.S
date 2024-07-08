import java.util.Scanner;
public class Exercicio09 {

        public static void main (String[] args) {

        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Irei calcular a raiz quadrada de um número real. Por favor, insira um número:");
        double x = scanner.nextDouble();
        scanner.close();

        double calcularRq = Math.sqrt(x);
        double resultado = calcularRq;
        
        System.out.println("O resultado é: "+ resultado +"");
    }
    
}
