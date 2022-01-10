import javax.swing.JOptionPane;

public class exer21 {
    public static void main(String[] args) {
        int valor;
        boolean continua = true;

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));

            if(valor > 0) {
                JOptionPane.showMessageDialog(null, "Valor é positivo");
            }else if(valor < 0){
                JOptionPane.showMessageDialog(null, "Valor é negativo");
            }

            String cont = JOptionPane.showInputDialog(null, "Deseja continuar? S / N");
            if(cont == "s" || cont == "S"){
                continua = true;
            }else if(cont == "n" || cont == "N"){
                continua = false;
            }
        }while(continua = true);
    }
}