//3) Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem
//   indicando se a residência está com consumo elevado de energia. A empresa considera
//   consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.

import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o preço do quilowatt/hora cobrado e a quantidade de quilowatt gasta, de forma espaçada(10 10):");
        double quilowattperhourPrice = input.nextDouble();
        double quilowattAmountexpend = input.nextDouble();
        while (quilowattperhourPrice < 0 && quilowattAmountexpend < 0) {
            System.out.println("Valor inválido, digite um valor positivo.");
            quilowattAmountexpend = input.nextDouble();
            quilowattperhourPrice = input.nextDouble();
        }

        input.close();
        
        double total = quilowattperhourPrice * quilowattAmountexpend;
            System.out.println("O valor a ser pago é de " + total + " reais.");
        
        double totalLatepay = total * 1.1;
            System.out.println("O valor a ser pago, caso a conta seja paga em atraso, é de " + totalLatepay + " reais.");

        if (quilowattAmountexpend > 70) {
            System.out.println("O consumo energético da sua residência está elevado.(Acima de 70Kw/h consideramos um consumo elevado)");
        }         
        
    }

}
