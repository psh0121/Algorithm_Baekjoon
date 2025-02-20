import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        double ma = (double)m / a;
        double na = (double)n / a;

        double taskTime = Double.MAX_VALUE;

        // 1) ma + ma
        taskTime = Math.min(taskTime, ma+ma);

        // 2) m + m
        taskTime = Math.min(taskTime, m+m);

        // 3) na + na
        taskTime = Math.min(taskTime, na+na);

        // 4) n + n
        taskTime = Math.min(taskTime, n+n);

        // 5) ma + n
        taskTime = Math.min(taskTime, Math.max(ma, n));

        // 6) m + na
        taskTime = Math.min(taskTime, Math.max(m, na));

        System.out.println(taskTime);
        sc.close();
    }
}
