import java.util.Scanner;
public class Exercicio06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular o consumo médio do automóvel, por favor insira a Quilometragem(Km) percorrida pelo veículo:");
        double x = scanner.nextDouble();

        System.out.println("Por favor, insira a quatidade de combustível(L) existente no tanque:");
        double z = scanner.nextDouble();

        scanner.close();

        double y = x / z;

        System.out.println("O consumo médio do veículo foi de: "+ y +" Km/L");
    }
}
