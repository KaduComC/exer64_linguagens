import javax.swing.JOptionPane;

public class exer59 {
    public static void main(String[] args) {
        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        JOptionPane.showMessageDialog(null, "Informe os caracteres em ordem alfabética");
        String primeiroS = JOptionPane.showInputDialog("Informe o primeiro caracter"),
                segundoS = JOptionPane.showInputDialog("Informe o segundo caracter");

        char primeiroC = primeiroS.toLowerCase().charAt(0), segundoC = segundoS.toLowerCase().charAt(0);
        int priChar = charInt(primeiroC, alfabeto), segChar = charInt(segundoC, alfabeto);

        int entre = segChar - priChar - 1;

        JOptionPane.showMessageDialog(null, "O número de caracteres existente entre  eles é de: " + entre);

    }

    public static int charInt(char carac, char[] alfabeto) {
        int numero = 0;
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == carac) {
                numero = i;
            }
        }
        return numero;
    }
}