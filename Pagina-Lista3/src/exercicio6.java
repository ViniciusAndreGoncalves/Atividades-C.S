import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite três números aleatórios: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int menor = n1;
        if(n2 < menor){
            menor = n2;
            System.out.println(menor);
        }else if(n3 < menor){
            menor = n3;
            System.out.println(menor);
        }
    }
}
