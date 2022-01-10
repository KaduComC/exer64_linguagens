import javax.swing.JOptionPane;

public class exer57 {
    public static void main(String[] args) {
        String frase, vogais = "aeiouAEIOU", stringVog = "";

        frase = JOptionPane.showInputDialog("Digite uma frase");

        char[] chars = frase.toCharArray();//pega toda a string e transforma para char dentro de um array

        for (int i = 0; i < chars.length; i++) {
            if (vogais.contains("" + chars[i])) {//verifica se contem
                stringVog += chars[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Frase só com vogais:\n" + stringVog);
    }
}