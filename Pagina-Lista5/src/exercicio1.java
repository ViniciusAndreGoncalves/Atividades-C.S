import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;

        int n1;
        int n2;
        System.out.println("Digite dois números: ");
        while(contador <= 0){
            n1 = input.nextInt();
            n2 = input.nextInt();



            contador++;
            System.out.println(n1 + " e " + n2);
        }

    }
}
