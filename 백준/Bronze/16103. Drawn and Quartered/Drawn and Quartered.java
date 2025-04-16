import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        String s = sc.next();

        long modK = k % 3;
        String newS = s;

        for(int i = 0; i < modK; i++) {
            newS = s.substring(0, n/4) +
                   s.substring(n - (n/4)) +
                   s.substring(n/4, n-(n/4));

            s = newS;
        }

        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}