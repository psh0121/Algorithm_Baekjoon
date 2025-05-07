import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int x = sc.nextInt();   // 도로너비
        int s = sc.nextInt();   // 메뚜기 점프 길이

        int curX = 0;   // 현재 메뚜기 위치
        int curS = s;   // 현재 메뚜기 점프 길이

        int cnt = 0;

        while (curX < x) {
            curX += curS;
            cnt++;

            if(curS > 1)curS = curS/2;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

