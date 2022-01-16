import javax.swing.JOptionPane;

public class exer51 {
    public static void main(String[] args) {
        int n, soma = 0;
        int media = 0;
        int maior = 0;
        boolean menor = true;
        n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos:"));
        int[] alunos = new int[n];

        for (int i = 0; i < n; i++) {
            alunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota do "+ (i + 1) + "° aluno:"));
        }

        for (int g = 0; g < n; g++) {
            soma += alunos[g];
            media = soma / n;

            if (alunos[g] > 7) maior++;
            if (alunos[g] > 5)
                menor = false;
        }

        if (menor = false) {
            JOptionPane.showMessageDialog(null, "Meida: " + media + "\nMaior que 7: " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Não há nenhum aluno com nota acima de 5.");
        }
        
    }
}

