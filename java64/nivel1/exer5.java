import javax.swing.JOptionPane;

public class exer5 {
    public static void main(String[] args) {
        int tempo;
        int velocidade;
        int ditancia;
        double litros;

        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Tempo: "));
        velocidade  = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidade: "));

        ditancia = tempo * velocidade;
        litros = ditancia / 12;

        JOptionPane.showMessageDialog(null, "Litros usados: " + litros);
    }
}