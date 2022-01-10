import javax.swing.JOptionPane;

public class exer25 {
    public static void main(String[] args) {
        double altura;
        String sexo;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
        sexo = JOptionPane.showInputDialog("Informe seu sexo: \nMasculino \nFeminino");

        switch (sexo) {
            case "Masculino":
                JOptionPane.showMessageDialog(null, "Peso ideal: " + ((72.7 * altura) - 58));
                break;
            case "Feminino":
                JOptionPane.showMessageDialog(null, "Peso ideal: " + ((62.1 * altura) - 44.7));
                break;
            default:
                break;
        }
    }
}