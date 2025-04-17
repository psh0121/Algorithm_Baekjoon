import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cur = k;
        int cnt = 1;

        for(int i = 0; i < n; i++) {
            int page = sc.nextInt();

            if(page <= cur) cur -= page;
            else {
                cur = k - page;
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}