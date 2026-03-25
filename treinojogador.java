
import java.util.Scanner;

public class treinojogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crie um programa que classifique jogadores baseado em pontuação:
                                                //Pontuação < 1000: Iniciante / 1000 a 1999: Bronze / 2000 a 2999: Prata/ 
                                                // 3000 a 3999: Ouro / 4000 a 4999: Platina / 5000+: Diamante

        System.out.println("Bem-vindo jogador!");
        int continuar = 1;

        do { 
        System.out.println("Digite sua pontuação");
        int pontuacao = scanner.nextInt();

        if (pontuacao < 0 ) {
            System.out.println("Pontuação inválida");
            System.out.println("Insira a pontuação correta");
        }
        else {
            String classificacao;
            if (pontuacao < 1000 ) {
                classificacao = "Iniciante";
            }
                else if (pontuacao >= 1000 && pontuacao <= 1999) {
                classificacao = "Bronze";
            }
                else if (pontuacao >=2000 && pontuacao <=2999) {
                classificacao = "Prata";  
            }
                else if (pontuacao >= 3000 && pontuacao <= 3999) {
                classificacao ="Ouro";
            }
                else if (pontuacao >= 4000 && pontuacao <= 4999) {
                classificacao = "Platina";
                }
                else {
                classificacao = "Diamante";
            }

            System.out.println("Sua classificação é:"+ classificacao);
        }
            System.out.println("Deseja ver outra classificação? SIM(1) ou NÃO(0)");
            continuar = scanner.nextInt();
            }while (continuar == 1);

        System.out.println("Fim");
        scanner.close();
    }
}
