import java.util.Scanner;   
public class Exercicio10 {
    
    public static double converterTemperatura(double y){
        double resultado = ( 9 * y + 160 ) / 5;
        return resultado;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Celsius para Fahreheit. Insira o valor da temperatura:");
        double y = scanner.nextDouble();
        scanner.close();
        
        double resultado = converterTemperatura(y);
        System.out.println("O resultado é: "+ resultado + " Fahreheit.");
    }


}
