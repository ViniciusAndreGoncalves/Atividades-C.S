//1) Apresente os resultados (true ou false) das seguintes expressões:
//   a) 5 + 3 * 6 / 2 >= 10
//   b) 36 / 3 * 2 – 5 +8 == 27
//   c) ! (30 / 4 * 6 == 15)
//   d) (30 % 4 * 6 == 12) || true
//   e) (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)
//   f) (((5 * 7 % 3 + 5) / 2 + 5) <= 14) II (! (12 / 4 < 8 * 2))

public class exercicio01 {
    public static void main (String[] args){
        double calc1 = 5 + 3 * 6 / 2;
            if (calc1 >= 10){
                System.out.println("A expressão (5+3*6/2>=10) é verdadeira.");
            }else{
                System.out.println("A expressão (5+3*6/2>=10) é falsa.");
        }
        double calc2 = 36 / 3 * 2 - 5 + 8;
            if (calc2 == 27){
                System.out.println("A expressão (36/3*2–5+8=27) é verdadeira.");
            }else{
                System.out.println("A expressão (36/3*2–5+8=27) é falsa.");
        }
        double calc3 = 30 / 4 * 6;
            if (calc3 == 15){
                System.out.println("A expressão (!(30/4*6=15)) é verdadeira.");
            }else{
                System.out.println("A expressão (!(30/4*6=15)) é falsa.");
        }
        double calc4 = 30 % 4 * 6;
            if (calc4 == 12){
                System.out.println("A expressão (5+3*6/2>=10) é verdadeira.");
            }else{
                System.out.println("A expressão (5+3*6/2>=10) é falsa.");
        }
        double calc5 = (5 * 7 % 3) + 4 / 2 + 5;
            if (calc5 == 12 && 12 / 4 < 8){
                System.out.println("A expressão (5+3*6/2>=10) é verdadeira.");
            }else{
                System.out.println("A expressão (5+3*6/2>=10) é falsa.");
        }
        double calc6 = (5 * 7 % 3 + 5) / 2 + 5;
        boolean condition = calc6 <= 14 || ! (12 / 4 < 8 * 2);
            if (condition){
                System.out.println("A expressão (((5*7%3+5)/2+5)<=14)ou(!(12/4<8*2)) é verdadeira.");
            }else{
                System.out.println("A expressão (((5*7%3+5)/2+5)<=14)ou(!(12/4<8*2)) é falsa.");
        }
    }
    
}
