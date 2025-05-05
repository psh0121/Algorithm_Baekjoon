import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int k = sc.nextInt();

        for(int i = 1; i <= k; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int[] mArr = new int[m];
            for(int j = 0; j < m; j++) mArr[j] = sc.nextInt();

            long total = 0;

            for(int j = 0; j < n; j++) {
                int h =  sc.nextInt();
                int w = sc.nextInt();
                int d = sc.nextInt();
                int idx = sc.nextInt() - 1;

                long value = (long)h * w * d * mArr[idx];

                total += value;
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(total);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
