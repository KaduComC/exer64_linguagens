
import javax.swing.JOptionPane;

public class exer38 {
    public static void main(String[] args) {
        int C;
        double N, E, hNormal, hExedente = 0;
        String opcao;
        boolean continua = false;

        do {
            C = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do operário: "));
            N = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas operário: "));

            if (N > 50) {
                E = N - 50;
                hExedente = E * 20;
            }

            hNormal = N * 10;

            opcao = JOptionPane.showInputDialog("Código: " + C + "\nSalário normal: " + hNormal + "\nHoras exedentes: "
                    + hExedente + "\nSalário total: " + (hNormal + hExedente)
                    + "\nDeseja continuar? \nS ou s para sim\nN ou n para não");
            if (opcao == "N" || opcao == "n") continua = true;
        } while (continua);
    }
}