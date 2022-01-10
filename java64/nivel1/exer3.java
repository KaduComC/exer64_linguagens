import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pagamento;
        double precoUnitario;
        int idVendedor;
        int qtdVendida;
        int codigoDaPeca;

        System.out.println("ID do vendedor: ");
        idVendedor = input.nextInt();

        System.out.println("Código da peça: ");
        codigoDaPeca = input.nextInt();

        System.out.println("Preço unitário: ");
        precoUnitario = input.nextDouble();

        System.out.println("Quantidade vendida: ");
        qtdVendida = input.nextInt();

        pagamento = (qtdVendida * precoUnitario)  * 0.05;

        System.out.println("ID: " + idVendedor +
        "\nCódigo do produto: " + codigoDaPeca +
        "\nPreço unitário: " + precoUnitario +
        "\nQuantidade vendida: " + qtdVendida +
        "\nPagamento do funcionario: " + pagamento);

        input.close();
    }
}