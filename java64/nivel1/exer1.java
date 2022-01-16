import javax.swing.JOptionPane;

public class exer1 {
    public static void main(String[] args) {
        int quantidadeMaxima = 0;
        int quantidadeMinima = 0;
        double media;

        quantidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog(null, "MAX: "));
        quantidadeMinima = Integer.parseInt(JOptionPane.showInputDialog(null, "MIN: "));

        media = (double)(quantidadeMaxima + quantidadeMinima) / 2;
        JOptionPane.showMessageDialog(null, media);
    }
}