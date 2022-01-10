import javax.swing.JOptionPane;

public class exer53 {
    public static void main(String[] args) {
        int melhorTempo = 0, tempoMedio, soma = 0, melhorVolta = 0;
        int voltas = Integer.parseInt(JOptionPane.showInputDialog("Número de voltas"));
        int tempo[] = new int[voltas];

        for (int i = 0; i < tempo.length; i++) {
            tempo[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo da " + (i + 1) + " volta"));
            soma += tempo[i];
            if (tempo[i] < melhorTempo || i == 0) {
                melhorTempo = tempo[i];
                melhorVolta = i + 1;
            }
        }

        tempoMedio = soma / voltas;
        JOptionPane.showMessageDialog(null, "Melhor volta: " + melhorVolta + "\nMelhor tempo: " + melhorTempo + "\nTempo médio: " + tempoMedio);
    }
} 
