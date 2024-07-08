//4) Faça um programa que leia um número inteiro N e apresente uma mensagem
//   indicando se N é par ou ímpar.

import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       

        System.out.println("Digite um número inteiro(ℤ) e direi se ele é par ou ímpar:");
        double number = input.nextInt();
                
        input.close();
        
        if (number % 2 == 0) {
            System.out.println("O número é par.");
        }else if (number % 2 != 0) {
            System.out.println("O número é ímpar.");
        }
    }
}
