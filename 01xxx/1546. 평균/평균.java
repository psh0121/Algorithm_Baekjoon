import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int m = arr[n-1];

        double sum = 0.0;

        for(int i = 0; i < n; i++) {
            double newGrade = (double)arr[i] / m * 100;
            sum += newGrade;
        }

        double avg = sum / n;

        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
