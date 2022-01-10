import javax.swing.JOptionPane;

public class exer39 {
    public static void main(String[] args) {
        int n;
        String opcao;
        boolean continua = false;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

            if (n >= 0) {
                if (n % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O valor informado é POSITIVO e PAR");
                } else {
                    JOptionPane.showMessageDialog(null, "O valor informado é POSITIVO e IMPAR");
                }
            } else if(n < 0) {
                if (n % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O valor informado é NEGATIVO e PAR");
                } else {
                    JOptionPane.showMessageDialog(null, "O valor informado é NEGATIVO e IMPAR");
                }
            }

            opcao = JOptionPane.showInputDialog("Deseja continuar? \nS ou s para sim\nN ou n para não");
            if (opcao == "N" || opcao == "n") continua = true;
        } while (continua);
    }
}