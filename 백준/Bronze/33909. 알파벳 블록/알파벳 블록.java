import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int s = sc.nextInt();
        int c = sc.nextInt();
        int o = sc.nextInt();
        int n = sc.nextInt();

        int SN = s + n;
        int CO = c + (o * 2);

        // sn - 3, co - 6
        int calSN = SN / 3;
        int calCO = CO / 6;

        System.out.println(Math.min(calSN, calCO));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
