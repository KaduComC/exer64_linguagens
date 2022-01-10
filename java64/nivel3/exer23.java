import javax.swing.JOptionPane;

public class exer23 {
    public static void main(String[] args) {
        double valor1, valor2;
        int opcao;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção de calculo: \n1 - Adição \n2 – Subtração \n3 – Multiplicação \n4 – Divisão"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "" + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "" + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "" + valor1 + " * " + valor2 + " = " + (valor1 * valor2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "" + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
                break;
            default:
                break;
        }
    }
}