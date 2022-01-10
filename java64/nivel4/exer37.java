import javax.swing.JOptionPane;

public class exer37 {
    private static double valor1, valor2;

    public static void main(String[] args) {
        int opcao2;
        String opcao1;
        boolean continua = false;

        while (continua == false) {
            opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a opção: \n1 – Adição \n2 – Subtração \n3 – Multiplicação \n4 – Divisão "));

            switch (opcao2) {
                case 1:
                    valores();
                    JOptionPane.showMessageDialog(null, "Resultado da adição é: " + (valor1 + valor2));
                break;
                case 2:
                    valores();
                    JOptionPane.showMessageDialog(null, "Resultado da subtração é: " + (valor1 - valor2));
                break;
                case 3:
                    valores();
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação é: " + (valor1 * valor2));
                break;
                case 4:
                    valores();
                    JOptionPane.showMessageDialog(null, "Resultado da divisão é: " + (valor1 / valor2));
                break;
            }
            opcao1 = JOptionPane.showInputDialog("Deseja fazer outra operação? \nS ou s para sim\nN ou n para não");
            if (opcao1 == "N" || opcao1 == "n") continua = true;
        }
    }

    public static void valores() {
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
    }
}