import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
       while (true) {
        int c = sc.nextInt();
        if(c == 0) break;

        int n = 0;
        int m = 0;

        for(int i = 1; i <= Math.sqrt(c); i++) {
            if(c % i == 0) {
                n = i;
                m = c / i;
            }
        }

        System.out.println("Minimum perimeter is " + (n+n+m+m) + " with dimensions " + n + " x " + m);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
