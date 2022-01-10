public class exer43 {
    public static void main(String[] args) {
        double quantidadeNaCasa = 1, casas = 64;
        int valor = 1;

        for (int i = 1; i <= casas; i++) {
            quantidadeNaCasa = quantidadeNaCasa * 2;
            valor += quantidadeNaCasa;
            
        }
        System.out.println(valor);
    }
}