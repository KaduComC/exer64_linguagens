import javax.swing.JOptionPane;

public class exer44 {
    public static void main(String[] args) {
        int opcao;
        double celsius, fahrenheit, conversao, altura, pesoIdeal;
        String simNao;
        boolean continua = false;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe a opção\n1 – Conversão de Graus Celsius em Graus Fahrenheit\n2 – Conversão de Graus Fahrenheit em Graus Celsius\n3 – Peso ideal do homem\n4 – Peso ideal da mulher "));

            switch (opcao) {
            case 1:
                celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius :"));
                conversao = (celsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "A conversão de Graus Celsius " + celsius + "° em Graus Fahrenheit é: " + conversao);
                break;

            case 2:
                fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit :"));
                conversao = (fahrenheit - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, "A conversão de Graus Fahrenheit  " + fahrenheit
                        + "° em Graus Celsius é: " + conversao);
                break;

            case 3:
                altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
                pesoIdeal = (72.7 * altura) - 58;
                JOptionPane.showMessageDialog(null, "Peso ideal é: " + pesoIdeal);
                break;

            case 4:
                altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
                pesoIdeal = (62.1 * altura) - 44.7;
                JOptionPane.showMessageDialog(null, "Peso ideal é: " + pesoIdeal);
                break;

            default:
                break;
            }
            simNao = JOptionPane.showInputDialog("Deseja encerrar o programa?");
            if (simNao == "S" || simNao == "s")
                continua = true;
        } while (continua = false);
    }
}