import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            int width = sc.nextInt();
            int length = sc.nextInt();
            int height = sc.nextInt();
            int area = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0 && width == 0 && length == 0 && height == 0 && area == 0 && m == 0) break;

            // 창문/문 너비
            int doorS = 0;

            for(int i = 0; i < m; i++) {
                doorS += sc.nextInt() * sc.nextInt();
            }

            // 한 아파트당 칠해야하는 면적 = 천장 너비 + 4면 너비 - 문/창문너비
            int s = (width * length) + ((width + length) * 2 * height) - doorS;

            // 칠해야하는 면적 = 한 아파트당 칠해야하는 면적 * 아파트수
            int totalS = s * n;

            // 페인트수 = 칠해야하는 면적 / 한페인트당 칠할수 있는 면적
            double cnt = (double)totalS / area;

            System.out.println((int)Math.ceil(cnt));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}