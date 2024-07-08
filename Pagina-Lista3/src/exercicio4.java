import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n = input.nextInt();

        if (n % 2 == 0){
            System.out.println("Número digitado: " + n + ", é par");
        }else{
            System.out.println("Número digitado: " + n + ", é impar");
        }
    }

}
