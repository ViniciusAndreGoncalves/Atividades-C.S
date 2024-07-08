import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int prova1 = input.nextInt();
        int prova2 = input.nextInt();
        int notaTrabalho = input.nextInt();

        if (((prova1 + prova2)/2 == 6) && (notaTrabalho >=7)){
            System.out.println("Você foi aprovado. \nProva 1: " + prova1 +
                    "\nProva 2: "+prova2 +
                    ("\nTrabalho: " + notaTrabalho));
        }else{
            System.out.println("Infelizmente, você não foi aprovado. \nProva 1: " + prova1 +
                    "\nProva 2: "+prova2 +
                    ("\nTrabalho: " + notaTrabalho));
        }
    }
}
