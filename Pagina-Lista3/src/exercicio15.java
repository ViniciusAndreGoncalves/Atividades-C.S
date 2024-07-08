import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade = input.nextInt();

        if(idade >= 5 && idade < 10){
            System.out.println("Sua categoria é Infatil, você tem: " + idade);
        }else if(idade >= 11 && idade < 17){
            System.out.println("Sua categoria é Juvenil, você tem: " + idade);
        }else if(idade >= 18 && idade < 60){
            System.out.println("Sua categoria é Adulto, você tem: " + idade);
        }else{
            System.out.println("Sua categoria é Senior6, você tem: " + idade);
        }

    }
}
