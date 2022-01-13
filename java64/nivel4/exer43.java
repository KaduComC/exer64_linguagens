public class exer43 {
    public static void main(String[] args) {

        long soma = 1, inicio = 1;

        for (int i = 1; i <= 64; i++) {
            inicio *= 2;
            soma += inicio;
            System.out.println("Casa "+i+" tem "+inicio+" de grãos");
        }
        System.out.println(soma);
    }
}