import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        // 가로 세로 길이 정보 저장
        int n = sc.nextInt();
        int[] width = new int[n];
        int[] height = new int[n];

        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            width[i] = Math.abs(x2 - x1);
            height[i] = Math.abs(y2 - y1);
        }

        // 포함되지 않는 쌍의 개수 구하기
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int a = width[i];
            int b = height[i];

            for(int j = i+1; j < n; j++) {
                int c = width[j];
                int d = height[j];

                if((a <= c && b <= d) || (a <= d && b <= c) ||
                  (c <= a && d <= b) || (c <= b && d <= a)) continue;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
