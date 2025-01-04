import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] after = new int[Math.max(n, m)];
        int[] before = new int[Math.max(n, m)];

        for(int i = 0; i < n; i++) after[i] = sc.nextInt();
        for(int i = 0; i < m; i++) before[i] = sc.nextInt();

        int result = 0;

        for(int i = 0; i < m; i++) {
          result = Math.max(result, before[i] - after[i]);
        }

        System.out.println(result);
        sc.close();
    }
}
