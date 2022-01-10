import javax.swing.JOptionPane;

public class exer32 {
    public static void main(String[] args) {
        int valor, soma = 0;

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
            for (int i = valor; i < 40 + valor; i++) {
                if (i % 2 == 1) {
                    soma += Math.pow(i, 2);
                }
            }
            JOptionPane.showMessageDialog(null,
                    "O resultado da soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a partir do número informado é:"
                            + soma);
            break;
        } while (valor >= 0 && valor <= 10);
    }
}