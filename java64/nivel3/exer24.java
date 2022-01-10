import javax.swing.JOptionPane;

public class exer24 {
    public static void main(String[] args) {
        double valor1, valor2;
        int opcao;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
        opcao = Integer.parseInt(JOptionPane.showInputDialog
        ("Opção de calculo: \n1 - Verificar se um dos números lidos é ou não múltiplo do outro" +
        "\n2 – Verificar se os dois números lidos são pares" + 
        "\n3 – Verificar se a média dos dois números é maior ou igual a 7" + 
        "\n4 – Sair"));

        switch (opcao) {
            case 1:
                if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
                    JOptionPane.showMessageDialog(null, "São multiplos");
                } else {
                    JOptionPane.showMessageDialog(null, "Não são multiplos");
                }
                break;
            case 2:
            if (valor1 % 2 == 0 && valor2 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "São pares");
            } else {
                JOptionPane.showMessageDialog(null, "Não são pares");
            }
            break;
            case 3:
            if ((valor1 + valor2) / 2 >= 7) {
                JOptionPane.showMessageDialog(null, "Média é maior ou igual a 7: " + (valor1 + valor2) / 2);
            } else {
                JOptionPane.showMessageDialog(null, "Média não é maior ou igual a 7");
            }
            break;
            case 4:
                break;
        }
    }
}