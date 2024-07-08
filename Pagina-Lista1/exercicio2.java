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
public class exerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    
        int numero;
    
        Scanner entrada= new Scanner(System.in);
    
        System.out.println("Digite um numero de sua escolha:");
        numero=entrada.nextInt();
        
        System.out.print("O numero escolhido foi: "+numero+" ");
    }
}
