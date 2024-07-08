//10) (DESAFIO) Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
//     decolar de um aeroporto, várias condições devem ser satisfeitas: caso a pista seja menor
//     que 1,5 Km, o avião deve pesar menos que 40 toneladas, caso a pista possua entre 1,5 e
//     2 Km, o avião não deve ultrapassar as 60 toneladas. Caso a pista seja superior a 2 Km,
//     qualquer avião pode decolar. Caso a visibilidade seja inferior a 20 metros, apenas aviões
//     com sistema de decolagem computadorizada podem decolar. Se estiver chovendo acima
//     de 5 mm, nenhum avião pode decolar. Se o avião possuir mais de 100 passageiros e
//     estiver chovendo (independente da intensidade), o avião não pode decolar. Escreva um
//     programa que leia o tamanho da pista, o peso do avião, visibilidade, intensidade da chuva
//     (o usuário deve digitar 0 caso não esteja chovendo), número de passageiros e se possui
//     sistema de decolagem automatizada, e indique se o avião pode decolar ou não.

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Digite o tamanho(Km) da pista:");
                double trackdistanceKm = input.nextDouble();
                while (trackdistanceKm < 0) {
                System.out.println("Valor inválido, digite um valor positivo.");
                trackdistanceKm = input.nextDouble();
                }
                
            System.out.println("Digite a massa(Kg) do avião:");
                double airplanemassKg = input.nextDouble();
                while (airplanemassKg < 0) {
                System.out.println("Valor inválido, digite um valor positivo:");
                airplanemassKg = input.nextDouble();
                }

            System.out.println("Digite a distância da visibilidade(metros):");
                double foVm = input.nextDouble();
                while (foVm < 0) {
                System.out.println("Valor inválido, digite um valor positivo:");
                foVm = input.nextDouble();
                }

            System.out.println("Digite a intensidade da chuva(milímetros). Caso não esteja chovendo, digite 0.");
                double rainIntensitymm = input.nextDouble();

            System.out.println("Digite a quantidade de passageiros abordo:");
                double numberPassangers = input.nextDouble();
                while (numberPassangers < 0) {
                System.out.println("Valor inválido, digite um valor positivo:");                
                numberPassangers = input.nextDouble();
            }

            System.out.println("O avião possui decolagem computadorizada(sim/não)?");
                input.nextLine();
                String answer = input.nextLine();
                boolean aiTakeoff = answer.equalsIgnoreCase("sim");                

            input.close();

            boolean takeOff = false;
            
            if (trackdistanceKm < 1.5 && airplanemassKg < 40000){
                takeOff = true;
            }else if (trackdistanceKm >= 1.5 && trackdistanceKm <= 2 && airplanemassKg < 60000){
                takeOff = true; 
            } else if (trackdistanceKm > 2){
                takeOff = true;
            } else if (foVm < 20 && aiTakeoff){
                takeOff = true;
            } else if (rainIntensitymm > 5){
                takeOff = false;
            } else if ((numberPassangers > 100) || (rainIntensitymm > 0)) {
                takeOff = false;
            }
            
            if (takeOff) {
                System.out.println("O avião pode decolar.");
            } else {
                System.out.println("O avião não pode decolar.");
            }
        }
    }


