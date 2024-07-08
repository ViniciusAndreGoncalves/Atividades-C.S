//18) Faça um programa que leia o dia, o mês e o ano de nascimento de uma pessoa e o
//    dia, mês e ano atual. Em seguida, o programa deve calcular e apresentar quantos dias a
//    pessoa já viveu (considere que todos os meses têm 30 dias e, por consequência, cada
//    ano tem 360 dias).
// fórmula - ((anoatual - anonasc) * 360) - mesesanteriores = diasvividos | mesesanteriores = (mes * 30) - dia.

import java.util.Scanner;

public class exercicio18 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.println("Digite o seu nome:");
            String name = input.nextLine();
            
            // fórmula - ((anoatual - anonasc) * 360) - mesesanteriores = diasvividos | mesesanteriores = (mes * 30) - dia.
    
            int presentYear = 2024;
            int livedDays = 0;
            
            System.out.println("Digite sua data de nascimento nesse formato -> DD/MM/YYYY:");
            String birth = input.nextLine();
            
            String[] part = birth.split("/");
            
            if (part.length == 3) {
                int day = Integer.parseInt(part[0]);
                while (day < 0 || day > 30) {
                    System.out.println("O valor do dia só pode estar entre 1 e 30. Insira novamente o valor do dia:");
                    day = input.nextInt();
                    input.nextLine();                    
                }
                int month = Integer.parseInt(part[1]);
                while (month < 0 || month > 12) {
                    System.out.println("O Valor do mês só pode estar entre 1 e 12. Insira novamente um mês válido:");
                    month = input.nextInt();
                    input.nextLine();                    
                }
                int year = Integer.parseInt(part[2]);
                while (year < 1890) {
                    System.out.println("Você é um ET? O cálculo é feito apenas para humanos. Insira novamente um ano válido:");
                    year = input.nextInt();
                    input.nextLine();                    
                }
                
                int afterMonths = (month * 30) - day;
                livedDays = ((presentYear - year) * 360) - afterMonths;
    
            }else{
                System.out.println("Formato inválido. Digite novamente:");
            }
            input.close();
    
            System.out.println("Parabéns "+ name +", você já viveu "+ livedDays +" dias. Torço para que tenha vivido intensamente e com muita consciência.");
    
        }
    
}