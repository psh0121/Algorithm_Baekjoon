import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];

            for(int j = 0; j < n; j++) {
                x[j] = sc.nextInt();
                y[j] = sc.nextInt();
            }

            int cnt = 0;

            for(int j = 1; j < n; j++) {
                for(int k = 0; k < j; k++) {
                    if(
                        (x[j] < x[k] && y[j] > y[k]) ||
                        (x[j] > x[k] && y[j] < y[k])
                    ) cnt++;
                }
            }

            System.out.println("Case #" + i + ": " + cnt);
        }
        sc.close();
    }
}