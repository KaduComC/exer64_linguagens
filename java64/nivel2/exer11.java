import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, auxiliar;

        System.out.println("Informe A: ");
        a = input.nextInt();

        System.out.println("Informe B: ");
        b = input.nextInt(); 

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("A = " + a + " -- B = " + b);
        input.close();
    }
}