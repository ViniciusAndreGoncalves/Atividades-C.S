import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#.00");

        System.out.println("Digite o seu peso e sua altura: ");

        float peso = input.nextFloat();
        float altura = input.nextFloat();

        float imc = peso /(altura * altura);
        //System.out.printf("%.2f",imc);
        if (peso < 20){
            System.out.println("Peso: "+peso+
                    "\nAltura: "+altura+
                    "\nIMC: "+ formatar.format(imc)+
                    "\nSituação: Magro");
        }else if (imc >= 20 && imc <= 24.99){
            System.out.println("Peso: "+peso+
                    "\nAltura: "+altura+
                    "\nIMC: "+ formatar.format(imc)+
                    "\nSituação: Normal");
        }else if(imc >= 25 && imc <= 30){
            System.out.println("Peso: "+peso+
                    "\nAltura: "+altura+
                    "\nIMC: "+ formatar.format(imc)+
                    "\nSituação: Sobrepeso");
        }else if (imc >= 30){
            System.out.println("Peso: "+peso+
                    "\nAltura: "+altura+
                    "\nIMC: "+ formatar.format(imc)+
                    "\nSituação: Obeso");
        }
    }
}
