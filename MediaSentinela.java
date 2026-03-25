import java.util.Scanner;

public class MediaSentinela {
    public static void main(String[] args) {
      Scanner scanner  = new Scanner(System.in);

      double nota;
      double soma = 0;
      int quant = 0; 

       do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = scanner.nextDouble();
            
            if (nota != -1) {
                // Verificar se é válida (0 a 10)
                if (nota >= 0 && nota <= 10) { //&& é and
                                               // || pelo menos um tem que ser true
                     soma = soma + nota;
                     quant = quant + 1;   // CONTA AS NOTAS n tava rodando pq esqueci isso
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10");
                }
            }
    } while (nota!=-1);
    //tem qu calular a media
    if(quant >0) {
        double media = soma / quant;  // CALCULA A MÉDIA
        System.out.println("Quantidade de notas válidas: " + quant);
        System.out.println("Média: " + media);

    } else {
        System.out.println("Nenhuma nota válida foi digitada.");
    }
    scanner.close();
    }
}