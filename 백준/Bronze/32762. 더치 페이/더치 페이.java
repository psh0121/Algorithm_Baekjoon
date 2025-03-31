import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] s = new int[n];   // 입장시각
        int[] e = new int[n];   // 퇴장시각

        for(int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
        }

        // 각 특정시점에 주문해 자신의 몫만큼 계산하지만, 결국 모든사람이 부담한 금액은 총주문금액과 같다
        // 그렇기 때문에 총주문값에서 명수를 나누면 평균값이 되는 것이다.
        int pay = 0;

        for(int i = 0; i < m; i++) {
            int time = sc.nextInt();
            int order = sc.nextInt();

            pay += order;
        }

        // 합계 구해서 평균 구하기
        System.out.printf("%.5f\n", (double)pay / n);
        sc.close();
    }
}