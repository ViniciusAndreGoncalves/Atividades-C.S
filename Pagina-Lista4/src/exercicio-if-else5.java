//5) Faça um programa que leia um número inteiro N e imprima “F1”, “F2” ou “F3”, 
//   conforme a condição:
//   • “F1”, se N <= 10
//   • “F2”, se N > 10 e N <= 100
//   • “F3”, se n > 100

import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro(1, 2, 3...):");
        int number = input.nextInt();       

        if (number <= 10){
            System.out.println("F1: "+ number);
        } else if (number > 10 && number <= 100){
            System.out.println("F2: "+ number);
        } else if (number > 100){
            System.out.println("F3: "+ number);
        }
        input.close();
    }
    
}

// number % 2 == 0 - par / number  % 1 != 0 