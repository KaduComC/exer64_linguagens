import javax.swing.JOptionPane;

public class exer19 {
    public static void main(String[] args) {
        int A, B, C;

        A = Integer.parseInt(JOptionPane.showInputDialog(null, "Lado A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Lado B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, "Lado C: "));

        if(A > 0 && B > 0 && C > 0) {
            if (A == B && B == C) {
                JOptionPane.showMessageDialog(null, "Triângulo equilátero");
            }else if (A == B || A == C || B == C) {
                JOptionPane.showMessageDialog(null, "Triângulo isosceles");
            }else if (A != B && A != C && B != C) {
                JOptionPane.showMessageDialog(null, "Triângulo escaleno");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Não é um triângulo");
        }
    }
}