//17) Faça um programa que leia a quantidade total de parcelas de um consórcio, a
//    quantidade de parcelas já pagas e o valor de cada parcela (considere que todas as
//    parcelas tem o mesmo valor). O programa deve calcular e apresentar o total já pago pelo
//    cliente e qual é o seu saldo devedor.

import java.util.Scanner;
public class exercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de parcelas pagas:");
        int amountofpaidParcels = input.nextInt();

        System.out.println("Quantas parcelas existem no total?(Digite a quantidade total de parcelas, mesmo as já pagas):");
        int parcels = input.nextInt();

        System.out.println("Digite o valor das parcelas:");
        double parcelPrice = input.nextDouble();

        input.close();

        double totalamoutPaid = amountofpaidParcels * parcelPrice;
        System.out.println("O total já pago por você é de "+ totalamoutPaid +" reais.");

        double outstandingBalance = (parcels - amountofpaidParcels) * parcelPrice;
        System.out.println("O seu saldo devedor é de "+ outstandingBalance +" reais.");
    }

}
