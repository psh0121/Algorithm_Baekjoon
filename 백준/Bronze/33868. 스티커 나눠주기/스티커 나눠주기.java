import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int maxT = 0;
        int minB = 5001;

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int b = sc.nextInt();

            maxT = Math.max(maxT, t);
            minB = Math.min(minB, b);
        }

        int tb = maxT * minB;
        int modTB = tb % 7;

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(arr[modTB]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
