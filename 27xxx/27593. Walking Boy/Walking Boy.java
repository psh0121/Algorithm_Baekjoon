import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int cnt = 0;

            if(arr[0] >= 240) cnt += 2;
            else if(arr[0] >= 120) cnt++;

            for(int i = 1; i < n; i++) {
                if(arr[i] - arr[i-1] >= 240) cnt += 2;
                else if(arr[i] - arr[i-1] >= 120) cnt++;
            }

            if(1440 - arr[n-1] >= 240) cnt += 2;
            else if(1440 - arr[n-1] >= 120) cnt++;

            System.out.println(cnt >= 2 ? "YES" : "NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}