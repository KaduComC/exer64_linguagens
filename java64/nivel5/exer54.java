import java.util.*;

public class exer54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[5], B = new int[8];
        ArrayList<Integer> C = new ArrayList<Integer>();
        int add = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Valores de A: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Valores de B: ");
            B[i] = ler.nextInt();
            for (int x = 0; x < 5; x++) {
                if (B[i] == A[x]) {
                    C.add(add, B[i]);
                    add++;
                }
            }
        }
        System.out.println("Comuns: ");
        for (int i = 0; i < C.size(); i++) {
            System.out.println(C.get(i) + "");
        }
        ler.close();
    }
}