import javax.swing.JOptionPane;

public class exer48 {
    public static void main(String[] args) {
        int qtd = 20;
        String[] modeloNome = new String[qtd];
        int[] modeloIdade = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            modeloNome[i] = JOptionPane.showInputDialog("Nome da " + (i + 1) +"° modelo");
            modeloIdade[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade da " + (i + 1) +"° modelo"));
        }

        for (int x = 0; x < qtd; x++) {
            if (modeloIdade[x] >= 18 && modeloIdade[x] <= 20) {
                JOptionPane.showMessageDialog(null, "Modelo apta: " + modeloNome[x]);
            }
        }
    }
}