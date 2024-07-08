import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome, idade e sexo: ");
        String nome = input.next();
        int idade = input.nextInt();
        String sexo = input.next();

        int contador = 0;
        while(idade == 0){
            System.out.println("Digite novamente: ");
            nome = input.next();
            idade = input.nextInt();
            sexo = input.next();

            contador++;
        }
        System.out.println("Você repetiu: "+ contador);
    }
}
