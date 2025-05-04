import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();   // 아파트 수
            int width = sc.nextInt();   // 방 너비
            int length = sc.nextInt();  // 방 길이
            int height = sc.nextInt();  // 방 높이
            int area = sc.nextInt();    // 페인트 한 통당 칠할 수 있는 면적
            int m = sc.nextInt();   // 창문과 문 수

            if(n == 0 && width == 0 && length == 0 &&
            height == 0 && area == 0 && m == 0) break;

            // 한 아파트에 칠해야하는 면적
            int s = ((width + width + length + length) * height) + (width * length);

            for(int i = 0; i < m; i++) {
                // 창문이나 문의 너비와 높이
                int w = sc.nextInt();
                int h = sc.nextInt();

                s -= (w * h);
            }

            int totalS = s * n;
            int paintCnt = totalS / area;
            if(totalS % area != 0) paintCnt += 1;

            System.out.println(paintCnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
