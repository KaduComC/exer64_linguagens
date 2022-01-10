import java.util.Scanner;

public class exer10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2;
        boolean igual = false, naoIgual = false, maior = false, menor = false, maiorIgual = false, menorIgual = false;

        System.out.println("Primeiro valor: ");
        valor1 = input.nextInt();

        System.out.println("Segundo valor: ");
        valor2 = input.nextInt();
        
        if (valor1 == valor2) igual = true;
        if (valor1 != valor2) naoIgual = true;
        if (valor1 > valor2) maior = true;
        if (valor1 < valor2) menor = true;
        if (valor1 >= valor2) maiorIgual = true;
        if (valor1 <= valor2) menorIgual = true;

        System.out.println("Igual: " + igual);
        System.out.println("Não igual: " + naoIgual);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou igual: " + maiorIgual);
        System.out.println("Mor ou igual: " + menorIgual);

        input.close();
    }
}
