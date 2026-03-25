public class PotenciaLampada {
    public static void main(String[] args) {
        //ja declara os bagui
        //é double 
        double tensao = 2.2e2;
        double corrente = 1.5e-1;
        //agr calcula a potencia
        double potencia = tensao * corrente; // so segue a formula

        System.out.println("P = "+potencia + "W");

    }
}
