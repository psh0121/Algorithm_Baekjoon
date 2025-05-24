import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();

        int curM = m;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int steal = curM / n;
            steal += curM % n;

            curM -= steal;

            arr[i] = steal;
        }

        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
        System.out.println(curM);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
