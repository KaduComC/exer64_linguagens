import javax.swing.JOptionPane;

public class exer51_1 {
    public static void main(String[] args) {
        int n;
        double soma = 0, media = 0, maior = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de alunos"));

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + " nota"));
            if (notas[i] < 7) {
                maior++;
            }
            soma += notas[i];
            media = soma / n;
        }

        if(maior == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum aluno com nota acima de 7");
        }
        else{
            JOptionPane.showMessageDialog(null, "Quantidade de alunos com nota acima de de 7: " + maior + 
            "\nMédia: " + media);
        }
    }
}
