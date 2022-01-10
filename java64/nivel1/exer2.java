import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        double cotacaoDolar;
        double valorDolar;
        double conversaoReal;

        Scanner input = new Scanner(System.in);
        System.out.println("Cotação do dolar: ");
        cotacaoDolar = input.nextDouble();
        System.out.println("Valor em dolar: ");
        valorDolar = input.nextDouble();

        conversaoReal = valorDolar * cotacaoDolar;

        System.out.println("Valor em real: " + conversaoReal);

        input.close();
    }
}