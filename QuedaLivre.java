public class QuedaLivre {
    public static void main(String[] args) {
        short t1 = 2;
        short t2 = 20; //numeros inteiros pequenininhos

        int tQuad1 = t1 * t1;  // 2 * 2 = 4  // meu deus do ceu multiplicação de short vira int
        int tQuad2 = t2 * t2;  // 20 * 20 = 400

        // ai aqui eu tive que aplicar a formula la 
        double g = 9.8;  // gravidade
        double s1 = 0.5 * g * tQuad1;  
        double s2 = 0.5 * g * tQuad2; 

        // unica parte que eu sabia oq fazer
        System.out.printf("t1=%d distância =%.1f m%n", t1, s1);
        System.out.printf("t2=%d distância =%.1f m%n", t2, s2);
    }
}
