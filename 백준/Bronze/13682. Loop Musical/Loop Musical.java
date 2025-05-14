import java.util.Scanner;

public class Main {
    // 골짜기나 봉우리가 있는가?
    public static boolean check (int a, int b, int c) {
        return (a < b && b > c) || (a > b && b < c);
    }
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] h = new int[n];
            for(int i = 0; i < n; i++) h[i] = sc.nextInt();

            int result = 0;

            for(int i = 0; i < n; i++) {
                int prev = h[(i+n-1) % n];
                int cur = h[i];
                int next = h[(i+1) % n];

                if(check(prev, cur, next)) result++;
            }

            System.out.println(result);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
