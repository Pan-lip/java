
import java.util.Scanner;

public class treino {
    public static void main(String[] args) { //main
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bem-vindo ao caixa");
        int continuar = 1; // n esquece de declarar a variavel antes do "do"  
    
        do { 
        System.out.println("Digite o valor em R$: ");
        int valor = scanner.nextInt(); //nao esquece disso, ele precisa "scanear" tlgd

           if (valor % 10 != 0) { // aqui eu achei que era divisão mas olha: / (divisão) → retorna o QUOCIENTE (quantas vezes cabe)
                                //% (módulo) → retorna o RESTO da divisão

                System.out.println("ERRO! O caixa só trabalha com notas de R$10, R$20, R$50 e R$100");
                System.out.println("Por favor, digite um valor múltiplo de 10");
            } 
            // ai aqui vai calcular o resto sabe?
            else {
                int resto = valor; //no caso aqui declarei depois pq tem que primeiro o rodar o if 
                
                int notas100 = resto / 100; //a gente dividiu aqui primeiro pq vai sobrar tanto
                resto = resto % 100; // aqui calcula quanto foi esse resto
                 //O resto funciona como um valor que ainda falta entrega, ent tipo ele vai passar por tudo até sobrar 0
                // e é ate por isso que começa no valor mais alto
                int notas50 = resto / 50; // e aqui esse resto vem ja calculado e assim por diante ate restar 0
                resto = resto % 50;
                
                int notas20 = resto / 20;
                resto = resto % 20;
                
                int notas10 = resto / 10;

                System.out.println("Notas entregues!!");
                if (notas100 > 0) System.out.println(notas100 + "nota(s) de 100 reais"); 
                if (notas50 > 0) System.out.println(notas50 + "nota(s) de 50 reais");
                if (notas20 > 0) System.out.println(notas20 + "nota(s) de 20 reais");
                if (notas10 > 0) System.out.println(notas10 + "nota(s) de 10 reais");
            }
            System.out.println("Deseja fazer outro saque? SIM(1) ou NÃO(0)");
            continuar = scanner.nextInt();
            } while (continuar == 1); //while é parenteses logo em seguida
            // é tipo do tal tal, ent vai rodar pelo menos uma vez, ai
            // vem o while, que é o normal, enquanto continaur é igual a 1 ele vai ficar em looping
        
        System.out.println("Obrigada por usar meu banco!");
        scanner.close();
    }
}


