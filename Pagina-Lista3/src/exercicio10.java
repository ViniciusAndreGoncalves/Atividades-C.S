import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite os seguintes valores: ");
        System.out.println("Digite o valor de x: ");
        int x = input.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = input.nextInt();

        System.out.println("Digite o valor de z: ");
        int z = input.nextInt();

        if ((x == y) && z == x){
            System.out.println("Equilátero: " + x + "|" + y+ "|" + z);
        }else if((x==y) || (x==z) ||(y==z)){
            System.out.println("Isóscele: " + x + "|" + y+ "|" + z);
        }

    }
}
