//9) Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
//   programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
//   do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
//   O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.

import java.util.Scanner;
public class exercicio09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra:");
        double vC = input.nextDouble();
        while (vC < 0) {
            System.out.println("Valor inválido, digite um número positivo:");
            input.nextDouble();
        }

        System.out.println("Digite o valor pago:");
        double vP = input.nextDouble();
        while (vP < 0) {
            System.out.println("Valor inválido, digite um número positivo:");
            input.nextDouble();
        }

        input.close();

        double troco = calcT(vP, vC);
        System.out.println("O troco é de " + troco + " reais.");
        
        int nC = (int) (troco / 100);
        int resto = (int) (troco % 100);
        int nD = resto / 10;
        resto %= 10;
        int nU = resto;

        System.out.println("Será(ão) dada(os) " + nC +" cédula(s) de cem," + nD + " em cédula(s) de dez e " + nU + " cédula(s) de um real(ais) de troco.");
    }
        public static double calcT(double vP, double vC){
            return vP - vC;
        }

}
