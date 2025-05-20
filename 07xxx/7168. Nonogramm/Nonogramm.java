import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] board = new String[n];
        for(int i = 0; i < n; i++) board[i] = sc.next();

        StringBuilder sb = new StringBuilder();

        // 행
        for(int i = 0; i < n; i++) {
            StringBuilder subSB = new StringBuilder();
            int cnt = 0;

            for(int j = 0; j < m; j++) {
                if(board[i].charAt(j) == '#') cnt++;
                else {
                    if(cnt == 0) continue;
                    else {
                        subSB.append(cnt).append(" ");
                        cnt = 0;
                    }
                }
            }

            if((cnt == 0 && subSB.length() == 0) || (cnt != 0)) subSB.append(cnt);
            sb.append(subSB).append("\n");
        }

        // 열
        for(int j = 0; j < m; j++) {
            StringBuilder subSB = new StringBuilder();
            int cnt = 0;

            for(int i = 0; i < n; i++) {
                if(board[i].charAt(j) == '#') cnt++;
                else {
                    if(cnt == 0) continue;
                    else {
                        subSB.append(cnt).append(" ");
                        cnt = 0;
                    }
                }
            }

            if((cnt == 0 && subSB.length() == 0) || (cnt != 0)) subSB.append(cnt);
            sb.append(subSB).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
