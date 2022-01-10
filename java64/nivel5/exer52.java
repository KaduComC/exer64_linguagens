import javax.swing.JOptionPane;

public class exer52 {
    public static void main(String[] args) {
        int x = 0, qtd = 20;
        int num1 = 0, num3 = 0, num4 = 0;
        int[] vetor = new int[qtd];

        do {
            vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("" + (x + 1) +"° valor: "));
            if (vetor[x] == 1) num1++;
            if (vetor[x] == 3) num3++;
            if (vetor[x] == 4) num4++;
            x++;
        } while (vetor[x - 1] != -1 && x < qtd);

        JOptionPane.showMessageDialog(null, "O numeo 1 apareceu " + num1 + " vezes\nO numeo 3 apareceu " + num3 + " vezes\nO numeo 4 apareceu " + num4 + " vezes\n");
    }
}