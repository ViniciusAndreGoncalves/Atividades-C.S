//2) Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
//   quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
//   pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
//   em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
//   conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
//   sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
//   decida se vai pagar a conta em dia ou não.

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o preço do quilowatt/hora cobrado e a quantidade de quilowatt gasta, de forma espaçada(10 10):");
        double quilowattperhourPrice = input.nextDouble();
        double quilowattAmountexpend = input.nextDouble();
        while (quilowattperhourPrice < 0 && quilowattAmountexpend < 0) {
            System.out.println("Valor inválido, digite um valor positivo.");
        }
        input.close();
        
        double total = quilowattperhourPrice * quilowattAmountexpend;
            System.out.println("O valor a ser pago é de " + total + " reais.");
        
        double totalLatepay = total * 1.1;
            System.out.println("O valor a ser pago, caso a conta seja paga em atraso, é de " + totalLatepay + " reais.");
    }
}
