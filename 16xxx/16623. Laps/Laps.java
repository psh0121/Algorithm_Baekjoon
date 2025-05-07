import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;
        int prev = sc.nextInt();

        // prev는 이전위치를 나타내므로
        // 현재위치가 이전위치보다 작은것은 한바퀴를 돌은 것이기 때문에
        // cnt에 +1을 진행시켜주면 된다.
        for(int i = 1; i < m; i++) {
            int now = sc.nextInt();
            if(now < prev) cnt++;
            prev = now;
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
