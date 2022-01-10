import java.util.Scanner;

public class exer56 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n[] = new int[50];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Valores: ");
            n[i] = ler.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 5 == 0) {
                System.out.println("" + n[i] + " é multiplo de 5");
            }else {
                System.out.println(n[i]);
            }
        }
        ler.close();
    }
}