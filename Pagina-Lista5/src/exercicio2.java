import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        while(n1 > n2){
            System.out.println("Digite novamente: ");
            n1 = input.nextInt();
            n2 = input.nextInt();
        }
        System.out.println("A soma dos dois números é: " + (n1 + n2));
    }
}
