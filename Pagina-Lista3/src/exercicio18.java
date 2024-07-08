import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#.00");

        System.out.println("Digite o saldo médio: ");
        float saldoM = input.nextFloat();

        if (saldoM >= 0 && saldoM < 500){
            System.out.println("Nenhum crédito, seu saldo médio é de: " + formatar.format(saldoM));
        }else if (saldoM >= 500.01 && saldoM < 1000){
            System.out.println("30% do valor do saldo médio, seu saldo médio é de: " + formatar.format(saldoM));
        }else if (saldoM >= 1000.01 && saldoM < 3000){
            System.out.println("40% do valor do saldo médio, seu saldo médio é de: " + formatar.format(saldoM));
        }else if(saldoM > 3000){
            System.out.println("50% do valor do saldo médio, seu saldo médio é de: " + formatar.format(saldoM));
        }

    }
}
