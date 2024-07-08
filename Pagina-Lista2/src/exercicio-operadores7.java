//7) Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
//   utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
//   como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
//   largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
//   paredes e o volume da sala. O programa deve mostrar também o tamanho do aparelho de
//   ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
//   inferior a 100 m 3; um aparelho médio deve ser instalado se o volume da sala estiver entre
//   100 e 500 m3; e um aparelho grande deve ser instalado caso o volume seja superior a 500
//   m3.
import java.util.Scanner;
public class exercicio07 {
    public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Digite a altura da sala:");
    double altura = input.nextDouble();
            while (altura <= 0) {
            System.out.println("Valor inválido, digite novamente um valor maior que zero:");
            altura = input.nextDouble();
        }

    System.out.println("Digite o comprimeto da sala:");
    double comprimento = input.nextDouble();
            while (comprimento <= 0) {
            System.out.println("Valor inválido, digite novamente um valor maior que zero:");
            comprimento = input.nextDouble();
        }
        
    System.out.println("Digite a largura da sala:");
    double largura = input.nextDouble();
            while (largura <= 0) {
            System.out.println("Valor inválido, digite novamente um valor maior que zero:");
            largura = input.nextDouble();
        }

input.close();

    double volume = calcularVolume(comprimento, largura, altura);
        System.out.println("O volume da sala é de " + volume + "m³.");

    double areaPiso = calcularAreaPiso(comprimento, largura);
        System.out.println("A área do piso da sala é de " + areaPiso + "m².");
    
    double areaParede = calcularAreaParede(altura, comprimento, largura);
        System.out.println("A área total das paredes da sala é de " + areaParede + " m².");
    
    tamanhoAr(volume);
}    
    
    public static double calcularVolume(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
}

    public static double calcularAreaPiso (double comprimento, double largura) {
        return comprimento * largura;
}

    public static double calcularAreaParede (double altura, double comprimento, double largura) {
        return ((altura * comprimento) * 2) + ((altura * largura) * 2);
}

    public static void tamanhoAr (double volume){
        if (volume < 100){
            System.out.println("O aparelho de ar-condicionado que deve ser instalado é de porte pequeno.");
        }else if (volume >= 100 && volume <=500) {
            System.out.println("O aparelho de ar-condicionado que deve ser instalado é de porte médio.");
        }else {
            System.out.println("O aparelho de ar-condicionado que deve ser instalado é de porte grande.");
        }
    }
}
