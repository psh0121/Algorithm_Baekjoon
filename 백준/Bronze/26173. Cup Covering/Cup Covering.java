import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        long a = sc.nextLong();
        double result = Math.sqrt((double)a / Math.PI);

        System.out.println(result * 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
