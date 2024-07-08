import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = input.nextInt();

        if(number > 100){
            System.out.println("F3");
        }else if((number > 10) && (number <= 100)){
            System.out.println("F2");
        }else{
            System.out.println("F1");
        }
    }
}
