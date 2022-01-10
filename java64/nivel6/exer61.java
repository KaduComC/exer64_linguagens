import javax.swing.JOptionPane;

public class exer61 {
    public static void main(String[] args) {
        double porc, salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
        porc = Double.parseDouble(JOptionPane.showInputDialog("Informe o reajuste: ")) / 100;

        JOptionPane.showMessageDialog(null, "Salario com reajuste: " + reajuste(porc, salario));
    }

    public static double reajuste(double porc, double salario) {
        double salarioAtualizado = salario + (salario * porc);
        return salarioAtualizado;
    }
}