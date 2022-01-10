import javax.swing.JOptionPane;

public class exer60 {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "O valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "O valor de Y"));

        JOptionPane.showMessageDialog(null, VerificaQuadrante(x, y));
    }

    private static String VerificaQuadrante(int x, int y){
        boolean qX, qY;
        String result = "";
        if (x >= 0) {
            qX = true;
        } else {
            qX = false;
        }
        
        if (y >= 0) {
            qY = true;
        } else {
            qY = false;
        }

        if (x == 0 || y == 0) return result = "0";
        else if (qX && qY) return result = "1";
        else if (!qX && qY) return result = "2";
        else if (!qX && !qY) return result = "3";
        else if (qX && !qY) return result = "4";
        return  result;
        
    }
}