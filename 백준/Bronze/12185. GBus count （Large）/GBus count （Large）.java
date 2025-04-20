import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();   // bus cnt
            int[] a = new int[n];   // bus start
            int[] b = new int[n];   // bus end
            
            for(int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                b[j] = sc.nextInt();
            }

            int c = sc.nextInt();   // ask bus
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < c; j++) {
                int p = sc.nextInt();   // bus
                int cnt = 0;

                for(int k = 0; k < n; k++) {
                    int start = a[k];
                    int end = b[k];

                    if(p >= start && p <= end) cnt++;
                }

                sb.append(cnt).append(" ");
            }

            System.out.println("Case #" + i + ": " + sb.toString().trim());

            if(i != t) {
                sc.nextLine();
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}