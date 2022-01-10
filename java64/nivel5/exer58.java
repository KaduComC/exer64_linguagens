import javax.swing.JOptionPane;

public class exer58 {
    public static void main(String[] args) {
        int n, media = 0, maior = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do vetor: "));
        
        int[] vetor = new int[n];
        
        for (int i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valores do vetor: "));
            media += vetor[i];
        }

        media = media / n;
        
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nMaior: " + maior);
    }
}