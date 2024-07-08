/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg19.pkg03;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class exerc02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaração de variáveis
        int numero;
               
        Scanner entrada= new Scanner(System.in);
                
        // Leitura de dados
        System.out.println("Digite um numero:");
        numero=entrada.nextInt();
        
        
        // Impressão de dados
        System.out.println("O numero informado e: "+numero+" e o seu antecessor e "+(numero-1)+" , ja o seu sucessor e " +(numero+1));
        
        
    }
    
}
