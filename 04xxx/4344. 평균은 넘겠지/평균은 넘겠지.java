import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                int grade = sc.nextInt();
                sum += grade;
                arr[i] = grade;
            }

            double avg = (double)sum / n;
            int cnt  = 0;

            for(int i = 0; i < n; i++) {
                if(arr[i] > avg) cnt++;
            }

            System.out.printf("%.3f%%\n", (double)cnt/n * 100);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
