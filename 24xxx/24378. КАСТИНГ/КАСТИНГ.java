import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(t == 1) {
            System.out.println(Math.max(0, a + b + c - (2 * n)));
        }
        else {
            System.out.println(Math.min(a, Math.min(b, c)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
