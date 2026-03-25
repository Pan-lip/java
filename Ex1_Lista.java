import java.util.Scanner;

public class Ex1_Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância: ");
        double distancia = scanner.nextDouble();

        System.out.print("Unidade (1-km / 2-metros): ");
        int unidDist = scanner.nextInt();

        System.out.print("Digite o tempo: ");
        double tempo = scanner.nextDouble();

        System.out.print("Unidade (1-minutos / 2-segundos): ");
        int unidTempo = scanner.nextInt();

        if (unidDist == 1 ) {
            distancia = distancia * 1000;
        }

        if (unidTempo == 1) {
            tempo = tempo * 60;
        }
        
        double velocidade = distancia / tempo;
        
        System.out.printf("Velocidade média: %.2f m/s%n", velocidade);
        
        scanner.close();
    }

}
