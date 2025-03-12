import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 행
        int m = sc.nextInt();   // 열
        int p = sc.nextInt();   // 최소둘레

        int cnt = 0;

        // 모든 직사각형의 경우를 파악하고 최소둘레이상인 사각형의 개수를 파악한다
        for(int r1 = 0; r1 < n; r1++) {
            for(int r2 = r1 + 1; r2 <= n; r2++) {
                for(int c1 = 0; c1 < m; c1++) {
                    for(int c2 = c1 + 1; c2 <= m; c2++) {
                        // 하나하나 다 방문하여 만들수 있는 직사각형을 다 만들고
                        // 행열의 길이를 파악하여 둘레의 길이를 알고 범위에 적용되는 경우 개수에 추가한다
                        int height = r2 - r1;
                        int width = c2 - c1;
                        int cm = 2 * (width + height);

                        if(cm >= p) cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}