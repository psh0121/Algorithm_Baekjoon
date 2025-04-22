import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();   // 직선 구간의 수
            int s = sc.nextInt();   // 1m 허무는데 한사람이 걸리는 시간
            int p = sc.nextInt();   // 장벽을 허무는 사람 수

            int[] x = new int[n+1];
            int[] y = new int[n+1];
            for(int j = 0; j < n+1; j++) {
                x[j] = sc.nextInt();
                y[j] = sc.nextInt();
            }

            int len = 0;

            for(int j = 1; j < n+1; j++) {
                if(x[j-1] == x[j]) {    // 수직이동
                    len += Math.abs(y[j-1] - y[j]);
                }
                else {  // 수평이동
                    len += Math.abs(x[j-1] - x[j]);
                }
            }

            int result = (int)Math.ceil((double)(len * s) / p);

            System.out.println("Data Set " + i + ":");
            System.out.println(result);

            if(i != t) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}