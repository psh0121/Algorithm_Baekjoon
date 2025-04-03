import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            // ticks은 0 ~ n-1이 표시된다.
            int n = sc.nextInt();
            int t1 = sc.nextInt();  // 시계2 + t1
            int t2 = sc.nextInt();  // 반시계1 + t2
            int t3 = sc.nextInt();  // 시계 t3

            if(n == 0 && t1 == 0 && t2 == 0 && t3 == 0) break;

            int result = n * 3; // 시계2 + 반시계1
            int cur = t1;
            int cnt = n-1;

            // 내가 간과한건 시작점은 무조건 0이 아니다.
            // 문제에서 최대한 많이 도는 경우를 생각해야하기 때문에 t2와 t3로 가는 방향은 값이 일정하지만
            // t1은 내가 최대한 많이 돌게 설정해주면 되는것이다.
            // 그렇기 때문에 1번과정은 반복문을 사용하지 않고,
            // cnt에 n-1을 넣으면 한바퀴 돌기직전이기 때문에 조건에 맞는 최대한 많이 돌 수 있는 경우라 할 수 있다.

            while (cur != t2) {
                cnt++;
                cur++;

                if(cur == n) cur = 0;
            }

            while (cur != t3) {
                cnt++;
                cur--;

                if(cur < 0) cur = n-1;
            }

            System.out.println(result + cnt);
        }
        sc.close();
    }
}