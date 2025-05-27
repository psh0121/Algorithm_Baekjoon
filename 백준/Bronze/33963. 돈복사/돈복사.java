import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int originalDigits = String.valueOf(n).length();
        int cnt = 0;

        while (true) {
            int doubled = n * 2;
            int newDigits = String.valueOf(doubled).length();

            if(originalDigits != newDigits) break;

            n = doubled;
            cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
