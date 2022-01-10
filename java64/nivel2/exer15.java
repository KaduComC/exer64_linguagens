import javax.swing.JOptionPane;

public class exer15 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, notaRecuperacao, media;;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 4"));

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado sem recuperação");
        } else if (media < 7) {
            notaRecuperacao = Double.parseDouble(JOptionPane.showInputDialog(null, "O aluno ficou de recuperação, digite a nota: "));
            notaRecuperacao = (notaRecuperacao + media) / 2;
            if (notaRecuperacao >= 7) {
                JOptionPane.showMessageDialog(null, "Aprovado com recuperação");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno reprovado");
            }
        }
    }
}