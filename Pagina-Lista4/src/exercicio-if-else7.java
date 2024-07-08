//7) Faça um programa que leia três valores inteiros e os imprima em ordem crescente
import java.util.Scanner;
public class exercicio07 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três números diferentes entre si:");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        if (number < number2 && number < number3 && number2 > number && number2 < number3){
            System.out.println(+ number +", "+ number2 +", "+ number3 +".");
        }else if (number < number3 && number3 < number2 && number2 > number3){
            System.out.println(+ number +", "+ number3 +", "+ number2 +".");
        } else if (number2 < number && number2 < number3 && number < number3){
            System.out.println(+ number2 +", "+ number +", "+ number3 +".");
        }else if (number2 < number && number2 < number3 && number > number3){
            System.out.println(+ number2 +", "+ number3 +", "+ number +".");
        } else if (number3 < number && number3 < number2 && number2 < number){
            System.out.println(+ number3 +", "+ number2 +", "+ number +".");
        } else if (number3 < number && number3 < number2 && number < number2){
            System.out.println(+ number3 +", "+ number +", "+ number2 +".");
        }
        
        input.close();
    }
}


