import javax.swing.JOptionPane;

public class exer34 {
    public static void main(String[] args) {
        int maior, menor, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor (números negativos finalizam): "));
        if (numero >= 0) {
            maior = numero;
            menor = numero;
            while (numero >= 0) {

                numero = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Informe o valor (números negativos finalizam): "));

                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor && numero >= 0) {
                    menor = numero;
                }
            }
            JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
        }
    }
}