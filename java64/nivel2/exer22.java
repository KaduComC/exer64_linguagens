import javax.swing.JOptionPane;

public class exer22 {
    public static void main(String[] args) {
        int valor,a ,b;

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
            if(valor > 0) {
                a = valor;
                JOptionPane.showMessageDialog(null, "A: " + a);
                break;
            }else if(valor < 0){
                b = valor;
                JOptionPane.showMessageDialog(null, "B: " + b);
                break;
            }
        }while (valor != 0);
    }
}