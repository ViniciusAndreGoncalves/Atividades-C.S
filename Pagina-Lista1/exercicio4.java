import java.util.Scanner;
public class exerc05 {
    // Definir fun��o
    public static double calcularY(double x){
        // y = (3*x) + 2
        return (3*x) + 2;
    } 

    public static void main(String[] args) {
       // Criar um objeto scanner para ler os dados de entrada do usu�rio
        Scanner scanner = new Scanner(System.in);
       // Entrada de dados do usuário
        System.out.println ("Para calcular a função y(x)=3x+2 insira um valor, real, para x:");
        double x = scanner.nextDouble();
        scanner.close();
       // Calcular o valor de y para o valor de x inserido
        double resultado = calcularY(x);
        System.out.println("O resultado da operação é: y equivalente a "+ resultado);        
        
    }
    
}
