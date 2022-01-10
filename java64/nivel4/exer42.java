import javax.swing.JOptionPane;

public class exer42 {
    public static void main(String[] args) {
        int valor, menor, maior;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
        menor = valor;
        maior = valor;

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        } while (valor != 0);
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }
}