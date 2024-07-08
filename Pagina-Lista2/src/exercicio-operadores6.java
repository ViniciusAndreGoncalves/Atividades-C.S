//6) Crie uma nova o programa da questão 5, para que ele considere a frequência do aluno.
//   Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
//   nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou
//   superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele
//   poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.
import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as notas das duas provas, do trabalho e a frequência do aluno, de forma separada(10 10 10 100)");
        
        int prova1 = input.nextInt();
        int prova2 = input.nextInt();
        int trabalho = input.nextInt();
        int freq = input.nextInt();
        
        if(((((prova1 >= 6) || prova2 >= 6) && trabalho >= 7) && freq >= 75) || (trabalho == 6 && freq >= 90)){
            System.out.println("O aluno está aprovado.");
        }else{
            System.out.println("O aluno está reprovado.");
        }
        input.close();        
    }
}    

