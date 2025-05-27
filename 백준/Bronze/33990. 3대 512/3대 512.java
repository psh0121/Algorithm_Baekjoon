import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        int result = -1;

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a + b + c;

            if(sum >= 512) {
                if(result == -1) result = sum;

                else if(sum < result) {
                    result = sum;
                }
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
