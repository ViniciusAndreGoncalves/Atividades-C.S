//13) Faça um programa que leia os valores A, B e C e informe se a soma de A com B é
//    menor ou igual a C.

import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três números, de forma espaçada(10 5 9):");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        input.close();

        double calc = A + B;

        if (calc < C) {
            System.out.println("A soma de "+ A +" e "+ B +" resulta em um número menor que "+ C +".");
        }

    }

}