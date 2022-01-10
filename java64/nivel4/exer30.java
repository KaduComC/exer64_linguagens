import java.util.Scanner;

public class exer30 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tabuada, resultado;

        System.out.println("Informe o valor do número para a tabuada: ");
        tabuada = ler.nextInt();

        System.out.println("\nTabuada de " + tabuada + "\n");

        for (int i = 0; i <= 10; i++) {
            resultado = tabuada * i;
            System.out.println("" + tabuada + " * " + i + " = " + resultado);
        }

        ler.close();
    }
}