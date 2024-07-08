
public class Ex11 {
    public static void main(String[] args) {
        int hora = 13;
        int minuto = 59;
        int segundo = 59;

        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.println("Horário acrescido de 1 segundo: " + hora + ":" + minuto + ":" + segundo);

    }
}
