import java.util.Scanner;

public class TemposCiclistas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tempo;
        int minimo = 0;
        int maximo = 0;
        int primeiro = 1;
        
        do {
            System.out.print("Digite o tempo (minutos): ");
            tempo = scanner.nextInt();
            
            if (tempo != -1) {
                if (tempo >= 0) {  // Só aceita positivos
                    if (primeiro == 1) {
                        minimo = tempo;
                        maximo = tempo;
                        primeiro = 0;
                    } else {
                        if (tempo < minimo) {
                            minimo = tempo;
                        }
                        if (tempo > maximo) {
                            maximo = tempo;
                        }
                    }
                } else {
                    System.out.println("ERRO! Digite um tempo positivo");
                }
            }
            
        } while (tempo != -1);
        
        int amplitude = maximo - minimo;
        
        System.out.println("Tempo mínimo: " + minimo + " minutos");
        System.out.println("Tempo máximo: " + maximo + " minutos");
        System.out.println("Amplitude: " + amplitude + " minutos");

        scanner.close();
    }
}