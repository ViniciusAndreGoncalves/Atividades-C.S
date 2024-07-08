//10) Faça um programa que leia três valores X, Y e Z e verifique se eles podem ser os
//    comprimentos dos lados de um triângulo, e se forem, deve verificar se é um triângulo
//    equilátero, isóscele ou escaleno. Se eles não formarem um triângulo, o programa deve
//    escrever uma mensagem indicando.

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores dos lados do triângulo(lado 1, lado 2, base):");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int base = input.nextInt();

        while (side1 + side2 < base) { //  || side1 + base < side2 || side2 + base < side1
                System.out.println("Esse triângulo não pode ser formado, pois a base é maior que os dois lados.");
                System.out.println("Por favor, insira novamente os três valores:");
                input.nextInt();
                input.nextInt();
                input.nextInt();
                input.nextLine();
        }


        while (side1 < 0 && side2 < 0 && base < 0) {
            System.out.println("Valor inválido, por favor digite um valor válido:");
            input.nextInt();
            input.nextInt();
            input.nextInt();
            input.nextLine();
        }

        

        input.close();
        
        if (side1 > side2 && base > side2 && side1 == base || base > side1 && side2 > side1 && base == side2 || side1 > base && side2 > base && side1 == side2) {
            System.out.println("O triângulo é isóceles.");
        } else if (side1 == side2 && side1 == base && side2 == base) {
            System.out.println("O triângulo é equilátero.");
        } else if (side1 != side2 && side1 != base) {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
