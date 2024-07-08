
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class exerc03 {
    
    public static void main(String[] args) {
        
        String nome;
        String endereco;
        int telefone;
                        
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Digite o seu nome:");
        nome=entrada.nextLine();
        
                  
        System.out.println("Digite o seu endereco:");
        endereco=entrada.nextLine();
        
        
        System.out.println("Digite o seu telefone:");
        telefone=entrada.nextInt();
        
        
        System.out.println("O seus dados sao os seguintes: Nome = "+nome+", endereco = "+endereco+" e telefone = "+telefone+"");
        
    }
    
}
