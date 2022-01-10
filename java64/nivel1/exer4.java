import javax.swing.JOptionPane;

public class exer4 {
    public static void main(String[] args) {
        int A, B, C, D, c1, c2, c3, c4, c5, c6, m1, m2, m3, m4, m5, m6;

        A = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor C: "));
        D = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor D: "));

        c1 = A + B;
        c2 = A + C;
        c3 = A + D;
        c4 = B + C;
        c5 = B + D;
        c6 = C + D;

        m1 = A * B;
        m2 = A * C;
        m3 = A * D;
        m4 = B * C;
        m5 = B * D;
        m6 = C * D;

        JOptionPane.showMessageDialog(null, "Soma | Multiplicação\n" +
                                            "" + c1 + " | " + m1 + "\n" +
                                            "" + c2 + " | " + m2 + "\n" +
                                            "" + c3 + " | " + m3 + "\n" +
                                            "" + c4 + " | " + m4 + "\n" +
                                            "" + c5 + " | " + m5 + "\n" +
                                            "" + c6 + " | " + m6);
    }
}