import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a lojinha");
        int continuar = 1;

        do{
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de parcelas (1 a 5): ");
        int numeroParcelas = scanner.nextInt();
        
      
        if (numeroParcelas < 1 || numeroParcelas > 5) {
            System.out.println("ERRO! Número de parcelas inválido.");
            System.out.println("O número de parcelas deve estar entre 1 e 5");
        } else {
            double valorFinal;
            double valorParcela;
            
            if (numeroParcelas == 1) {
                valorFinal = valorCompra * 0.9;
                System.out.println("Pagamento à vista - 10% de desconto");
            } else if (numeroParcelas <= 3) {
                valorFinal = valorCompra;
                System.out.println("Pagamento em " + numeroParcelas + "x - Sem juros");
            } else if (numeroParcelas == 4) {
                valorFinal = valorCompra * 1.05;
                System.out.println("Pagamento em 4x - Acréscimo de 5%");
            } else {
                valorFinal = valorCompra * 1.06;
                System.out.println("Pagamento em 5x - Acréscimo de 6%");
            }
            
            valorParcela = valorFinal / numeroParcelas;
            
            System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);  // quando for double (números decimais) que precisam mostrar 2 casas decimais      
        } 
         System.out.print("Deseja cadastrar outro cliente? (1-SIM / 0-NÃO): ");
        continuar = scanner.nextInt();
    }while (continuar == 1);
    System.out.println("Fechando lojinha");      
        scanner.close();
    }
}

