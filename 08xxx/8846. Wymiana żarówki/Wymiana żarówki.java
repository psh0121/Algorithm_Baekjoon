import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int mod = 500_000_009;
        int n = sc.nextInt();
        long result = 0;
        long power = 1;

        for(int i = 0; i < n; i++) {
            result = (result + power) % mod;
            power = (power * 4) % mod;
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
