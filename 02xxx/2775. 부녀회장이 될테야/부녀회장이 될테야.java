import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int[][] apt = new int[15][15];
        for(int i = 0; i < 15; i++) apt[0][i] = i;

        // apt 사람 채우기
        for(int i = 1; i < 15; i++) {
            for(int j = 1; j < 15; j++) {
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();   // 층
            int n = sc.nextInt();   // 호

            System.out.println(apt[k][n]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
