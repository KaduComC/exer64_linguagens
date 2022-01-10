import javax.swing.JOptionPane;

public class exer41 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));

        if (idade >= 5 && idade <= 7) JOptionPane.showMessageDialog(null, "Infantil A = 5 a 7 anos");
        if (idade >= 8 && idade <= 11) JOptionPane.showMessageDialog(null, "Infantil B = 8 a 11 anos");
        if (idade >= 12 && idade <= 13) JOptionPane.showMessageDialog(null, "Juvenil A = 12 a 13 anos");
        if (idade >= 14 && idade <= 17) JOptionPane.showMessageDialog(null, "Juvenil B = 14 a 17 anos");
        if (idade >= 18) JOptionPane.showMessageDialog(null, "Adultos = Maiores de 18 anos");
    }
}