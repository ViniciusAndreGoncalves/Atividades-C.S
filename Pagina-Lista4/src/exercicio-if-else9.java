//9) Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
//   o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
//   Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
//   negativo, deve ser mostrada, também, a mensagem “conta estourada”.


import java.util.Scanner;
public class exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        //Database : accountNumber | Bank balance
        //              123-4      |    2000,00
        //              738-9      |    1200,00 
        //              534-8      |    3500,00 
        //              444-9      |    8000,00 
        //              742-1      |    2000,00
        //String[] accountNumberData = {'123-3', '738-9', '534-8', '444-9', '742-1'};
        
        String[] accounts = {"123-4", "738-9", "534-8", "444-9", "742-1"};
        double[] bankBalance = {2000.0, 1200.0, 3500.0, 8000.0, 2000.0};

        System.out.println("Digite o número da sua conta bancária(111-1):");
        String accountNumber = input.nextLine();
        
        
        String[] part = accountNumber.split("-");
        
        if (part.length == 2) {
            int part1 = Integer.parseInt(part[0]);
            int part2 = Integer.parseInt(part[1]);
        }else{

        }
        
        boolean registeredAccount = false;
        int account = -1;
            for (int i = 0; i < accounts.length; i++){
                if (accounts[i].equals(accountNumber)){
                    registeredAccount = true;
                    account = i;
                    break;
                }
                
            }
            if (!registeredAccount) {
                System.out.println("Conta não cadastrada, procure o gerente.");
            }else{
                System.out.println("Digite qual operação você deseja realizar(1-Depósito/2-Saque):");
                int operation = input.nextInt();
                
                if (operation == 1) {
                    deposit(input, bankBalance, account);
                } else if (operation == 2) {
                    cashWithdrawal(input, bankBalance, account);
                }
                
            }
            
            input.close();
            
        } 
        
        public static void deposit(Scanner input, double[] bankBalance, int account) {
            System.out.println("Insira o valor que deseja depositar:");
            int value = input.nextInt();
            
            if (value <= 0) {
                System.out.println("Valor inválido, digite apenas valores inteiros para depósito, que sejam maiores que zero:");
            } else {
                bankBalance[account] += value;
                System.out.println("Você depositou: " + value + " reais.");
                System.out.println("O seu novo saldo é de: R$" + bankBalance[account]);
            }
        }

        
        public static void cashWithdrawal(Scanner input, double[] bankBalance, int account){
            System.out.println("Insira o valor que deseja sacar:");
            int value = input.nextInt();
            
            if (value <= 0) {
                System.out.println("Valor inválido, digite apenas valores inteiros para depósito, que sejam maiores que zero:");
            } else if (value > bankBalance[account]) {
                System.out.println("Saldo insuficiente.");
            } else {
                bankBalance[account] -= value;
                System.out.println("Você sacou: " + value + " reais.");
                System.out.println("O seu novo saldo é de: R$" + bankBalance[account]);
            }
        }

}