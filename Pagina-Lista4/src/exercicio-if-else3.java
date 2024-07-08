//3) Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
//   imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura 2.
//   Além do IMC, o programa deve mostrar a situação da pessoa, de acordo com o seu IMC:
//   • Abaixo de 20 – magro;
//   • Entre 20 e 24,99 – normal;
//   • Entre 25 e 30 – sobrepeso;
//   • Acima de 30 – obeso.

import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua massa corpórea(Kg) e a sua altura(m), de forma espaçada (10 10):");
        double mass = input.nextDouble();
        while (mass < 0 || mass > 400) {
            System.out.println("Valor inválido. Digite novamente um valor válido para sua massa corpórea:");
            mass = input.nextDouble();
            input.nextLine();
        }
        double height = input.nextDouble();
        while (height <= 0 || height >=2.8) {
            System.out.println("Valor inválido de altura. Por favor, digite novmanete um valor válido:");
            height = input.nextDouble();
            input.nextLine();
        }

        input.close();

        double imc = mass / (height * height);
        System.out.println("O seu IMC é de: " + imc);

        if (imc == 20 || imc < 25) {
            System.out.println("Seu IMC está com o valor ideal.");
        } else if (imc < 20) {
            System.out.println("Seu IMC está abaixo do valor ideal.");
        }else if (imc == 25 || imc <= 30) {
            System.out.println("Você está com sobrepeso.");
        }else if (imc > 30) {
            System.out.println("Você está com obesidade.");
        }
    }

}