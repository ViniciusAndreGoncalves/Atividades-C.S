import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#.00");

        String nome = input.next();
        char categoria = input.next().charAt(0);
        float salario = input.nextFloat();

        if ((categoria == 'A' || categoria == 'H') || (categoria == 'a' || categoria == 'h')){
            salario = (salario * 10)/100 + salario;
            System.out.println("Nome: " + nome +
                    "\nCategoria: " + categoria +
                    "\nNovo Salário: R$" + formatar.format(salario));
        }else if((categoria == 'B' || categoria == 'D') || (categoria == 'b' || categoria == 'd')) {
            salario = (salario * 15) / 100 + salario;
            System.out.println("Nome: " + nome +
                    "\nCategoria: " + categoria +
                    "\nNovo Salário: R$" + formatar.format(salario));
        }else if((categoria == 'C' || categoria == 'F') || (categoria == 'c' || categoria == 'f')) {
            salario = (salario * 25) / 100 + salario;
            System.out.println("Nome: " + nome +
                    "\nCategoria: " + categoria +
                    "\nNovo Salário: R$" + formatar.format(salario));
        }else {
            salario = (salario * 30) / 100 + salario;
            System.out.println("Nome: " + nome +
                    "\nCategoria: " + categoria +
                    "\nNovo Salário: R$" + formatar.format(salario));
        }
    }
}
