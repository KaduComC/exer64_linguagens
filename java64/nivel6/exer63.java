import javax.swing.JOptionPane;

public class exer63 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
        JOptionPane.showMessageDialog(null, "O valor é: " + verifica(n));
    }

    public static String verifica(int n) {
        String valor = "";
        if (n % 2 == 0) {
            valor = "PAR";
        }else if (n % 2 == 1) {
            valor = "IMPAR";
        }
        return valor;
    }
}

