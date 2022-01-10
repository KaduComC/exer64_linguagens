import javax.swing.JOptionPane;

public class exer9 {
    public static void main(String[] args) {
        int ano, mes, dia, idade;

        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade anos: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade meses: "));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade dias: "));

        idade = (365 * ano) + (30 * mes) + dia;

        JOptionPane.showMessageDialog(null, "Idade em dias: " + idade);
    }
}