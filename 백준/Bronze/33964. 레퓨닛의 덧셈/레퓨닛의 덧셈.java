import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        String numX = "1".repeat(x);
        String numY = "1".repeat(y);

        System.out.println(Long.parseLong(numX) + Long.parseLong(numY));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
