//11) Faça um programa que calcule os gastos com combustível em uma viagem. O
//    programa deve solicitar ao usuário a distância a ser percorrida em Km, o consumo médio
//    do carro (quantos quilômetros o carro percorre com um litro de combustível) em Km/litro e
//    o preço do litro do combustível. O programa deve calcular e apresentar o valor em R$ a
//    ser gasto com combustível na viagem.

import java.util.Scanner;
public class exercicio11 {
    
    public static void main(String[] args) {
        
        System.out.println("Calculadora de gastos de combustível.");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância ser percorrida(Km) pelo seu veículo:");
        double distance = input.nextDouble();
        while (distance < 0) {
            System.out.println("Valor inválido, digite um valor positivo:");
        }

        System.out.println("Quantos quilometros o seu veículo percorre com apenas um litro de combustível?");
        System.out.println("Digite o consumo médio do seu veículo(Km/1L):");
        double averageConsume = input.nextDouble();
        while (averageConsume < 0) {
            System.out.println("Valor inválido, digite um valor positivo.");            
        }

        System.out.println("Digite o valor, em reais, do litro da gasolina:");
        double gasPrice = input.nextDouble();
        while (gasPrice < 0) {
            System.out.println("Valor inválido, digite um valor positivo.");            
        }
        
    input.close();

        double expenses = totalPrice(distance, gasPrice, averageConsume);
            System.out.println("O valor total gasto de combustível foi de " + expenses + " reais.");            
    }
        
    public static double totalPrice(double gasPrice, double distance, double averageConsume){
        return (gasPrice * distance) / averageConsume;
    }
        // valortotal=(gasp*dist)/average

}
