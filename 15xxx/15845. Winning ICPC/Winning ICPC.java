import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();   // 팀의 수
        int m = sc.nextInt();   // 문제수
        
        int[] s = new int[m];
        for(int i = 0; i < m; i++) s[i] = sc.nextInt();

        int maxCnt = -1;
        int winner = -1;

        for(int i = 0; i < n; i++) {
            int[] t = new int[m];
            for(int j = 0; j < m; j++) t[j] = sc.nextInt();

            int cnt = 0;

            for(int j = 0; j < m; j++) {
                if(s[j] == t[j]) cnt++;
            }

            if(cnt > maxCnt) {
                maxCnt = cnt;
                winner = i+1;
            }
        }

        System.out.println(winner);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}