import java.util.Scanner;

public class Main {
    /*
     * 1> 말이 현재위치(k)에서 최대속력(s)로 목표지점(d)까지 가는데 걸리는 시간
     *  시간 = 거리 / 속력 = (d - k) / s
     * 
     * 2> 애니말이 시간을 맞추도록 속도를 조절해야함
     *  - 앞서가는 말을 절대로 추월할 수 없다.
     *  - 가장 오래 걸리는 말 속도에 맞춰야 한다.
     *  - 애니가 가장 오래 걸리는 말의 속도와 같은 시간내에 도착하려면 설정해야하는 속도를 구한다.
     *  속도 = 거리 / 시간 = d / ((d - k) / s) = d / (d - k) * s
     */
    public static double solve(Scanner sc) {
        int d = sc.nextInt();
        int n = sc.nextInt();

        double result = Double.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int s = sc.nextInt();

            // 속도가 가장느린 말이 정답이된다.
            result = Math.min(result, (double)d / (d - k) * s);
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++) {
            System.out.printf("Case #%d: %.7f\n", i, solve(sc));
        }
        sc.close();
    }
}