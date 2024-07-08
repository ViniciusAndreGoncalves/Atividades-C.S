//8) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
//   categoria de cada empregado. O aumento seguirá a seguinte regra:
//   • Funcionários das categorias A e H ganharão 10% de aumento sobre o salário;
//   • Funcionários das categorias B, D, e E ganharão 15% de aumento sobre o salário;
//   • Funcionários das categorias C e F ganharão 25% de aumento sobre o salário;
//   • Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
//   Faça um programa que leia o nome do funcionário, sua categoria e salário atual e 
//   imprima o seu nome, categoria e salário reajustado.

import java.util.Scanner;
public class exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char category;
        char A = 0;
        char H = 0;
        char B = 0;
        char C = 0;
        char D = 0;
        char E = 0;
        char F = 0;
        
        System.out.println("Digite o seu nome:");
        String name = input.next();
        
        System.out.println("Digite a sua categoria(A, B, C, D, E ou F):");
        category = input.next().charAt(0);
        
        System.out.println("Digite o seu salário atual:");
        double salary = input.nextDouble();
        
        
        if (category == A || category == H){
            double newsalary = salary * 1.1;
            System.out.println("O seu salário "+ name +" será reajustado em 10% pois faz parte da categoria "+ category +". O seu novo salário será de:"+ newsalary);
        } else if (category == B || category == D ||category == E) {
            double newsalary2 = salary * 1.15;
            System.out.println("O seu salário "+ name +" será reajustado em 15% pois faz parte da categoria "+ category +". O seu novo salário será de:"+ newsalary2);
        } else if (category == C || category == F) {
            double newsalary3 = salary * 1.25;
            System.out.println("O seu salário "+ name +" será reajustado em 25%, pois faz parte da categoria "+ category +". O seu novo salário será de:"+ newsalary3);
        } else {
            double newsalary4 = salary * 1.3;
            System.out.println("O seu salário "+ name +" será reajustado em 30%, pois faz parte da categoria "+ category +". O seu novo salário será de:"+ newsalary4);
        }
        
        input.close();
    }
}
