import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int h = sc.nextInt();   // 초기높이
        int k = sc.nextInt();   // 상승속도 기준
        int v = sc.nextInt();   // 초기속도
        int s = sc.nextInt();   // 초기바람세기

        int distance = 0;

        while (h > 0) {
            v += s;
            v -= Math.max(1, v/10);

            if(v >= k) h += 1;
            else if(v > 0 && v < k) {
                h -= 1;
                if(h == 0) v = 0;
            }
            else {
                h = 0;
                v = 0;
            }

            distance += v;

            if(s > 0) s -= 1;
        }

        System.out.println(distance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
