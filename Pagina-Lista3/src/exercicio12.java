import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite o valor do ângulo: ");
        int angulo = input.nextInt();

        if (angulo < 90){
            System.out.println("É um ângulo agudo!");
        }else if(angulo == 90){
            System.out.println("É um ângulo reto!");
        }else {
            System.out.println("É um ângulo obtuso!");
        }

    }
}
