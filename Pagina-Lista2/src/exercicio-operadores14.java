//14) Considere que o último concurso vestibular apresentou três provas: Português,
//    Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
//    contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
//    programa que leia estes dados e apresente:
//    a) o nome e as notas em cada prova do candidato.
//    b) a média do candidato.
//    c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
//    candidato é aprovado se sua média for maior que 7.0 e se não apresentou
//    nenhuma nota abaixo de 5.0.

import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do candidato:");
        char name = input.next().charAt(0);

        System.out.println("Digite as notas das três provas do candidato, separadamente (10 10 10):");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        while (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Valor inválido, digite um número positivo.");                   
        }
        input.close();
        
        float average = (n1 + n2 + n3) / 3;

        boolean approval = true;

        System.out.println("O candidato "+ name +" teve média "+ average +".");

        if (average < 7) {
            approval = true;
        }else if (n1 < 5 || n2 < 5 || n3 < 5) {
            approval = false;
        }

        if (approval) {
            System.out.println("O candidato está aprovado.");
        }else{
            System.out.println("O candidato está reprovado.");
        }
    }

}
