import javax.swing.JOptionPane;

public class exer27 {
    public static void main(String[] args) {
        int quantidade;

        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de valoress: "));
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1)+ "° : "));
        }

        for (int x = 0; x < numeros.length; x++) {
            int fatorial = 1;
            for (int z = numeros[x]; z > 0; z--) {
                fatorial = z * fatorial;
            }
            JOptionPane.showMessageDialog(null, "Fatorial de " + numeros[x] + " é: " +fatorial);
        }
    }
}

