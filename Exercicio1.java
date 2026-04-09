import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;

        System.out.println("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();
        double media = media_com_pesos(nota1, nota2);
        System.out.println("Média = " + media);
        System.out.println("Conceito = " +conceito(media));
    }
    public static char conceito(double media) {
        if (media>=8.5) {
            return 'E';
        } else if (media<=5) {
                return 'B';
        } else {
            return  'R';
        }

    }
    public static double media_com_pesos(double nota1, double nota2) {
        return ((4*nota1 + 6*nota2) /10);
    }
}
