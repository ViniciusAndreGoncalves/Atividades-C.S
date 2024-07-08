//11) Elabore um programa que tome como entrada um determinado horário, expresso por
//    hora (valor inteiro de 0 a 23), minuto (valor de 0 a 59) e segundo (valor de 0 a 59) e
//    imprima esse horário acrescido de 1 segundo. Cada hora tem 60 minutos e cada minuto
//    sem 60 segundos. O incremento de um segundo no horário, além de alterar o valor do
//    segundo, pode implicar em alterações no valor do minuto e da hora. Veja que um horário
//    como 13:59:59 acrescido de 1 segundo vai para 14:00:00.

import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora nesse formato -> hh:mm:ss :");
        String time = input.nextLine();

        String[] part = time.split(":");
        int time2 = 0;
        if (part.length == 3) {
            int hour = Integer.parseInt(part[0]);
            while (hour < 0 || hour > 23) {
                System.out.println("Valor inválido, digite novamente:");
                hour = input.nextInt();
                input.nextLine();
            }

            int minutes = Integer.parseInt(part[1]);
            while (minutes < 0 || minutes > 59) {
                System.out.println("Valor inválido, digite novamente:");
                minutes = input.nextInt();
                input.nextLine();
            }

            int seconds = Integer.parseInt(part[2]);
            if (seconds == 59) {
                return ++seconds;
            }
            while (seconds < 0 || seconds > 59) {
                System.out.println("Valor inválido, digite novamente:");
                seconds = input.nextInt();
                input.nextLine();
            }
            time2 = ++time;
        }
        input.close();

        System.out.println(time2);
    }
}
