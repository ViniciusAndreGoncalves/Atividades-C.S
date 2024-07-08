//5) O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
//   Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
//   igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
//   calcular a média das notas. Faça um programa que leia as três notas do aluno e
//   apresente se ele deve ser aprovado ou não.
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as notas das duas provas e do trabalho, separadamente, por exemplo: 10 10 10");
        
        int prova1 = input.nextInt();
        int prova2 = input.nextInt();
        int trabalho = input.nextInt();

        input.close();
        
        if(((prova1 >= 6) || prova2 >= 6) && trabalho >= 7){
            System.out.println("O aluno está aprovado.");
        }else{
            System.out.println("O aluno está reprovado.");
        }

    }

}
