import javax.swing.JOptionPane;

public class exer40 {
    public static void main(String[] args) {
        double indice;
        String opcao;
        boolean continua = false;

        do {
            indice = Double.parseDouble(JOptionPane.showInputDialog("Informe o indice de poluição: "));

            if (indice <= 0.25)
                JOptionPane.showMessageDialog(null, "Aceitavel");
            if (indice > 0.25 && indice <= 0.3)
                JOptionPane.showMessageDialog(null, "1° grupo será intimado e suspenso");
            if (indice > 0.3 && indice <= 0.4)
                JOptionPane.showMessageDialog(null, "1° e o 2° grupos serão intimados e suspensos");
            if (indice > 0.4)
                JOptionPane.showMessageDialog(null, "Todos os grupos(1°, 2° e 3°) serão intimados e suspensos");

            opcao = JOptionPane.showInputDialog("Deseja encerrar o programa?");
            if (opcao == "S" || opcao == "s") continua = true;

        } while (continua == false);

    }
}