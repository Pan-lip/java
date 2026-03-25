import java.util.Scanner;

public class ConversorEngenharia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double valor;
        double resultado;
        
        do {
            System.out.println("CONVERSOR DE ENGENHARIA");
            System.out.println("1 - Newton (N) → kgf");
            System.out.println("2 - kPa → bar");
            System.out.println("3 - PSI → bar");
            System.out.println("4 - cm² → m²");
            
            System.out.print("Escolha a conversão de 1 a 4: ");
            opcao = scanner.nextInt();
            
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o valor: ");
                valor = scanner.nextDouble();
                                
                 if (opcao == 1) {
                    // N → kgf
                    resultado = valor / 9.80665;
                    System.out.printf(valor + " N = %.4f kgf%n", resultado);
                    
                } else if (opcao == 2) {
                    // kPa → bar
                    resultado = valor / 100;
                    System.out.printf(valor + " kPa = %.4f bar%n", resultado);
                    
                } else if (opcao == 3) {
                    // PSI → bar
                    resultado = valor / 14.5038;
                    System.out.printf(valor + " PSI = %.4f bar%n", resultado);
                    
                } else if (opcao == 4) {
                    // cm² → m²
                    resultado = valor / 10000;
                    System.out.printf(valor + " cm² = %.4f m²%n", resultado);
                }
                
            } else {
                System.out.println("Opção inválida! Escolha 1, 2, 3 ou 4");
            }
            
            System.out.print("Outra conversão? (1 - SIM / 2 - NÃO): ");
            opcao = scanner.nextInt();
            
        } while (opcao == 1);
        
        System.out.println("FIM!");
        
        scanner.close();
    }

    }
