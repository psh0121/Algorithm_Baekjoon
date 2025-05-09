import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();

            boolean flag = true;
            int sumA = 0;
            int sumB = 0;

            // 초반점수
            for(int i = 0; i < n; i++) {
                sumA += a[i];
                sumB += b[i];
            }

            // 3연속 보너스점수
            for(int i = 2; i < n; i++) {
                boolean pointA = (a[i] == a[i-1] && a[i] == a[i-2]);
                boolean pointB = (b[i] == b[i-1] && b[i] == b[i-2]);

                if(pointA && pointB) {
                    flag = false;   // 둘다 동시에 만족시 보너스 없음
                }
                if(flag && (pointA ^ pointB)) {
                    // 아직 보너스 받은적 없고, 둘중에 하나만 보너스 조건 성립시 보너스 포인트 적립
                    if(pointA) sumA += 30;
                    else sumB += 30;
                    flag = false;
                }
            }

            if(sumA > sumB) System.out.println("M");
            else if(sumA == sumB) System.out.println("T");
            else System.out.println("L");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
