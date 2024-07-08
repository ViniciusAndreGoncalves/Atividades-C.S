import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite três números: ");

        int size = 3;

        int[] numeros = new int [size];

        for(int i = 0 ; i < size; i++){
            numeros[i] = input.nextInt();
        }

        Arrays.sort(numeros);

        for (int i : numeros){
        System.out.print(i + " ");
        }

    }
}
