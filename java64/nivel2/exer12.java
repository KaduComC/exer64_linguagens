import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.println("Informe o valor: ");
        valor = input.nextInt();

        if (valor > 0) {
            System.out.println("|" + valor + "| = " + valor);
        } else if (valor < 0) {
            valor = valor * (-1);
            System.out.println("|" + valor + "| = " + valor + " * (-1) = " + valor);
        }else if(valor == 0){
            System.out.println("Informe um valor diferente de 0");
        }
        input.close();
    }
}