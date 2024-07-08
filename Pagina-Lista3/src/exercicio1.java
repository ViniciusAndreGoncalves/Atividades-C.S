import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite o preço do Quilowatt, e a quantidade: ");

        float preco = input.nextFloat();
        float quiloW = input.nextFloat();

        float conta = preco * quiloW;
        float contaAtrasada = ((conta* 10)/100)+conta;

        if (quiloW > 70){
            System.out.println("Consumo elevado de energia\nSua conta é: R$"+ conta +"\nSua conta atrasada é: R$" +contaAtrasada);
        }else{
            System.out.println("Você é um consumidor consciente\nSua conta é: R$"+ conta +"\nSua conta atrasada é: R$" +contaAtrasada);
        }
    }
}
