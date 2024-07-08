//6) Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.


import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três números diferentes entre si:");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        if (number < number2 && number < number3){
            System.out.println(+ number +" é menor que "+ number2 +" e "+ number3 +".");
        }else if (number2 < number && number2 < number3){
            System.out.println(+ number2 +" é menor que "+ number +" e "+ number3 +".");
        }else if (number3 < number && number3 < number2){
            System.out.println(+ number3 +" é menor que "+ number +" e "+ number2 +".");
        }
        
        input.close();
    }
}
