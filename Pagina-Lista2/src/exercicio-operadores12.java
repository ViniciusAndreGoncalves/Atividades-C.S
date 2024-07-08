//12) Faça um programa que leia dois números A e B e mostre se eles são iguais.

import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite dois números, de forma espaçada(10 5):");
        double A = input.nextDouble();
        double B = input.nextDouble();

        input.close();

        if (A == B) {
            System.out.println("Os números são iguais.");
        }

    }

}