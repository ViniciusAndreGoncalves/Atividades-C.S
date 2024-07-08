import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String produto1 = input.next();
        String produto2 = input.next();
        String produto3 = input.next();

        int estoque1 = input.nextInt();
        int estoque2 = input.nextInt();
        int estoque3 = input.nextInt();

        if((estoque1 < 30 && estoque2 < 30 && estoque3 < 30)){
            System.out.println("Seu estoque de " + produto1 + ", esta abaixo: "+ estoque1);
        }else if((estoque1 > 30 && estoque2 > 30 && estoque3 < 30)){
            System.out.println("Seu estoque de " + produto2 + ", esta abaixo: "+ estoque2);
        }else if((estoque1 < 30 && estoque2 > 30 && estoque3 > 30)){
            System.out.println("Seu estoque de " + produto3 + ", esta abaixo: "+ estoque3);
        }else{
            System.out.println("Seus estoques estão em dia!");
        }

    }
}
