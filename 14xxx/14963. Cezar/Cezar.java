import java.util.Scanner;

public class Main {
    public static boolean solve(Scanner sc) {
        int n = sc.nextInt();
        int[] v = new int[12];
        
        for (int i = 2; i <= 11; i++) {
            v[i] = 4;
        }
        v[10] = 16;

        int x = 21;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            v[a]--;
            x -= a;
        }

        int ans = 0;
        for (int i = x + 1; i <= 11; i++) {
            ans += v[i];
        }
        
        return ans < 52 - n - ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc) ? "VUCI" : "DOSTA");
        sc.close();
    }
}
