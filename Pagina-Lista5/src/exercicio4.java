import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#,##0.00");

        String[] itens = {"Cachorro Quente", "X-Salada", "Bauru com Ovo", "Refrigerante"};
        double[] precos = {4.00, 6.00, 6.50, 2.00};

        System.out.println("Cardápio:");

        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 100) + " - " + itens[i] + ": R$" + formatar.format(precos[i]));
        }

        System.out.print("Informe o código do item desejado: ");
        int codigo = input.nextInt();

        System.out.print("Informe a quantidade desejada: ");
        int quantidade = input.nextInt();

        if (codigo >= 100 && codigo <= 103) {
            double valorTotal = precos[codigo - 100] * quantidade;
            System.out.println("Item: " + itens[codigo - 100]);
            System.out.println("Valor a ser pago: R$" + formatar.format(valorTotal));
        } else {
            System.out.println("Código inválido!");
        }
    }
}
