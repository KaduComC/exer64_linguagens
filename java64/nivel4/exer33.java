import javax.swing.JOptionPane;

public class exer33 {
    public static void main(String[] args) {
        int matricula = 0, alunos;
        double nota, media = 0, notaGeral = 0;

        alunos = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de alunos: "));

        for (int i = 1; i <= alunos; i++) {
            matricula = Integer.parseInt(JOptionPane.showInputDialog("informe a matricula do " + i +"° aluno: "));
            nota = Double.parseDouble(JOptionPane.showInputDialog("informe a nota do " + i +"° aluno: "));
            JOptionPane.showMessageDialog(null, "M: " + matricula + "\nN: " + nota);
            notaGeral += nota;
        }
        
        media = notaGeral / alunos;
        JOptionPane.showMessageDialog(null, "A média da turma é: " + media);
    }
}