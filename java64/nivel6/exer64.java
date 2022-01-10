import javax.swing.JOptionPane;

public class exer64 {
    private static int[] vetor = new int[10];

    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe a opção:\n1 - Carregar Vetor" +
                    "\n2 - Listar Vetor" +
                    "\n3 - Exibir apenas os números pares do vetor" +
                    "\n4 - Exibir apenas os números ímpares do vetor" +
                    "\n5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor" +
                    "\n6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor\n" +
                    "7 - Sair"));
            
            switch (opcao) {
                case 1:
                    carregaVetor();
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, listaVetor());
                    break;
            
                case 3:
                    JOptionPane.showMessageDialog(null, numPares());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, numImpares());
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, qunatidadePar());
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, qunatidadeImpar());
                    break;

                case 7:
                    continua = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");
            }
        }
    }

    public static void carregaVetor() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("" + (i + 1) + "° valor: "));
        }
        JOptionPane.showMessageDialog(null, "Vetor carregado");
    }
    
    public static String listaVetor() {
        String lista = "Valores";
        for (int i = 0; i < vetor.length; i++) {
            lista += "\n" + vetor[i];
        }
        return lista;
    }

    public static String numPares() {
        String listaPar = "Números pares";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                listaPar += "\n" + vetor[i];
            }
        }
        return listaPar;
    }

    public static String numImpares() {
        String listaImpar = "Números impares";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                listaImpar += "\n" + vetor[i];
            }
        }
        return listaImpar;
    }
    
    public static String qunatidadePar() {
        int quantidadePar = 0;
        String quantidadeParS = "Quantidade de números pares é de:";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                quantidadePar++;
                quantidadeParS = "" + quantidadePar;
            }
        }
        return quantidadeParS;
    }
    
    public static String qunatidadeImpar() {
        int quantidadeImpar = 0;
        String quantidadeImparS = "Quantidade de números impares é de:";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                quantidadeImpar++;
                quantidadeImparS = "" + quantidadeImpar;
            }
        }
        return quantidadeImparS;
    }
}