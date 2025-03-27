import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for(int i = 1; i < n+1; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int idx = sc.nextInt();
            int d = sc.nextInt();

            int cnt = 0;

            for(int i = 1; i < n+1; i++) {
                if(i == idx) continue;

                double distance = Math.sqrt((x[idx] - x[i]) * (x[idx] - x[i]) + (y[idx] - y[i]) * (y[idx] - y[i]));

                if(distance <= (double)d) cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}