//19) Faça um programa que leia um número inteiro entre 0 e 999 e apresente a soma dos
//    seus dígitos. Por exemplo, se o número digitado por 284 o resultado será igual a 14
//    (2+8+4).

import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        
        System.out.println("Digite um número positivo inteiro entre 0 e 999:");
        
        do{
            while (!input.hasNextInt()) {
                input.next();
            }
            number = input.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Número inválido. Por favor, digite novamente um número entre 0 e 999:");
            }
        } while (number < 0 || number > 999);

        input.close();

        int units = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;

        int calc = units + dozens + hundreds;

        System.out.println("A soma dos algarismos é de: " + calc);
    }
}
