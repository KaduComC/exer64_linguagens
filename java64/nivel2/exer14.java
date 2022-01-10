import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2, diferença;

        System.out.println("Valor 1: ");
        valor1 = ler.nextInt();
        System.out.println("Valor 2: ");
        valor2 = ler.nextInt();

        if (valor1 < valor2) {
            diferença = valor2 - valor1;
            System.out.println(diferença);
        } else if (valor2 < valor1) {
            diferença = valor1 - valor2;
            System.out.println(diferença);
        }
        ler.close();
    }
}