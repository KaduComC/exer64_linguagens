import javax.swing.JOptionPane;

public class exer31 {
    public static void main(String[] args) {
        int quantidadePar = 0, quantidadeImpar = 0, numero = 0, somaPar = 0, somaImpar = 0;
        
        while (numero >= 0) {
            
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor (números negativos finalizam): "));
            
            if (numero >= 0) {
                if (numero % 2 == 0) {
                    quantidadePar++;
                    somaPar += numero;
                    JOptionPane.showMessageDialog(null, "Par");
                } else {
                    quantidadeImpar++;
                    somaImpar += numero;
                    JOptionPane.showMessageDialog(null, "Impar");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + quantidadePar
                + "\nQuantidade de números impares: " + quantidadeImpar);
        JOptionPane.showMessageDialog(null, "Soma dos números pares: " + somaPar
                + "\nSoma dos números impares: " + somaImpar);
    }
}