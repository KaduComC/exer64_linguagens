import javax.swing.JOptionPane;

public class exer18 {
    public static void main(String[] args) {
        int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o valor: 1, 2 u 3"));

        switch (codigo) {
            case 1:
                JOptionPane.showMessageDialog(null, "Código valido - Um");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Código valido - Dois");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Código valido - Três");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido");
                break;
        }
    }
}