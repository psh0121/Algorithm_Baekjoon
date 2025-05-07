import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int m = sc.nextInt();

        while (m-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            System.out.println((int)Math.ceil((double)arr[n-1] * s / 1000));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
