import java.util.Scanner;
public class exercicio08 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int velocidade = 340;
        
        System.out.println("Digite o tempo que levou para você escutar o som do raio que caiu:");
        double tempo = input.nextFloat();
            while (tempo < 0){
            System.out.println("Valor inválido, digite um número positivo:");
            tempo = input.nextDouble();
            }                                
        double distancia = velocidade * tempo;
            System.out.println("A distância do raio até você é de " + distancia + " metros.");
                if (distancia < 200){
                    System.out.println("Cuidado, o raio está muito próximo de você. Procure um lugar seguro imediatamente!");
                }else{}
                input.close();
        }
    }

