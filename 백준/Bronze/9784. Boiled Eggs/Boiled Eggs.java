import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            int[] egg = new int[n];
            for(int j = 0; j < n; j++) egg[j] = sc.nextInt();
            Arrays.sort(egg);

            int cnt = 0;
            int gram = 0;

            for(int j = 0; j < n; j++) {
                if(cnt + 1 > p || gram + egg[j] > q) break;

                cnt++;
                gram += egg[j];
            }

            System.out.println("Case " + i + ": " + cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}