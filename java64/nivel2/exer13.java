import java.util.Arrays;
import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Informe os valores: ");
            nums[i] = ler.nextInt();
        }

        Arrays.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }

        ler.close();
    }
}