import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char m = sc.next().charAt(0);

            BigInteger factorial = BigInteger.valueOf(1);

            for(int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            String strFactorial = factorial.toString();

            int cnt = 0;

            for(int i = 0; i < strFactorial.length(); i++) {
                if(strFactorial.charAt(i) == m) cnt++;
            }

            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}