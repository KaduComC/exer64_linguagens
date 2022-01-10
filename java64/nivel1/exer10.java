import javax.swing.JOptionPane;

class relacoes {
    private int numero1, numero2;

    public relacoes(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String maior() {
        String valor = "";
        if (numero1 > numero2) {
            valor = ("Número 1 é maior que o número 2 - " + numero1 + " > " + numero2);
        } else if (numero2 > numero1) {
            valor = ("Número 2 é maior que o número 1 - " + numero2 + " > " + numero1);
        }
        return valor;
    }

    public String menor() {
        String valor = "";
        if (numero1 < numero2) {
            valor = ("Número 1 é menor que o número 2 - " + numero1 + " < " + numero2);
        } else if (numero2 < numero1) {
            valor = ("Número 2 é menor que o número 1 - " + numero2 + " < " + numero1);
        }
        return valor;
    }

    public String maiorIgual() {
        String valor = "";
        if (numero1 >= numero2) {
            valor = ("Número 1 é menor ou igual que o número 2 - " + numero1 + " >= " + numero2);
        } else if (numero2 >= numero1) {
            valor = ("Número 2 é menor ou igual que o número 1 - " + numero2 + " >= " + numero1);
        }
        return valor;
    }

    public String menorIgual() {
        String valor = "";
        if (numero1 <= numero2) {
            valor = ("Número 1 é menor ou igual que o número 2 - " + numero1 + " <= " + numero2);
        } else if (numero2 <= numero1) {
            valor = ("Número 2 é menor ou igual que o número 1 - " + numero2 + " <= " + numero1);
        }
        return valor;
    }

    public String igual() {
        String valor = "";
        if (numero1 == numero2) {
            valor = ("Número 1 é igual ao número 2 - " + numero1 + " == " + numero2);
        } else if (numero1 != numero2) {
            valor = ("Número 1 é diferente que o número 2 - " + numero1 + " != " + numero2);
        }
        return valor;
    }

    @Override
    public String toString() {
        return "" + igual() + "\n" + maior() + "\n" + menor() + "\n" + maiorIgual() + "\n" + menorIgual();
    }
}

public class exer10 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Num1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Num2: "));
        relacoes rel = new relacoes(num1, num2);
        rel.igual();
        rel.maior();
        rel.menor();
        rel.maiorIgual();
        rel.menorIgual();

        JOptionPane.showMessageDialog(null, rel);
    }
}