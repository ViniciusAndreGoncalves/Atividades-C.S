//4) Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
//   imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura².
//   Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).

import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua massa corpórea(Kg) e a sua altura(m), de forma espaçada (10 10):");
        double mass = input.nextDouble();
        double height = input.nextDouble();

        input.close();

        double imc = mass / (height * height);
        System.out.println("O seu IMC é de: " + imc);

        if (imc > 25) {
            System.out.println("Seu IMC está acima do valor ideal, definido pelo cálculo: IMC = Peso / Altura². Verifique com mais exatidão sua condição de saúde com um médico nutricionista, já que o IMC é apenas um índice bruto que não apresenta a composição corpórea(massa magra, massa gorda).");
        }
    }

}
