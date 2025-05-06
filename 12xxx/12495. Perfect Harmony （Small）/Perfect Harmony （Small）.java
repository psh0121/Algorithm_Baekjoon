import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();

            int[] arr = new int[n];
            for(int j = 0; j < n; j++) arr[j] = sc.nextInt();

            int result = 0;

            for(int y = l; y <= h; y++) {
                int cnt = 0;

                for(int x = 0; x < n; x++) {
                    if(y % arr[x] == 0 || arr[x] % y == 0) cnt++;
                }

                if(cnt == n) {
                    result = y;
                    break;
                }
            }

            System.out.println("Case #" + i + ": " + (result == 0 ? "NO" : result));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
