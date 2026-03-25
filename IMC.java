import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baixo = 0;
        int normal = 0;
        int sobrepeso = 0;
        int obeso = 0;
        int total = 0; 

        double peso, altura, imc;
        do{
            System.out.println("Digite seu peso em kg: ");
            peso = scanner.nextDouble();

            if (peso != -1) {
                System.out.println("Digite a altura em m: ");
                altura = scanner.nextDouble();
                imc = peso / (altura* altura); // formula imc = peso/ altura²
                 if ( imc < 18.5) {
                    baixo = baixo+1;
                    System.out.println("Baixo peso");

                 } else if (imc >= 18.5 && imc <= 24.9 ) {
                    normal = normal +1;
                    System.out.println("Peso normal");

                 }else if (imc >=25 && imc <= 29.9) {
                    sobrepeso = sobrepeso +1;
                    System.out.println("Sobrepeso");

                 } else {
                    obeso = obeso+1;
                    System.out.println("Obeso");
                 }

                 total =  total +1;

            }
                                               
    } while (peso != -1);
        
        // agr printa e calcular os bagui
        if (total > 0) {
            System.out.println("Total de voluntários: " + total);
            System.out.println("Baixo peso: " + (baixo * 100.0 / total) + "%");
            System.out.println("Peso normal: " + (normal * 100.0 / total) + "%");
            System.out.println("Sobrepeso: " + (sobrepeso * 100.0 / total) + "%");
            System.out.println("Obeso: " + (obeso * 100.0 / total) + "%");
        } else {
            System.out.println("Nenhum voluntário cadastrado.");
        }
        
        scanner.close();
    }
}

