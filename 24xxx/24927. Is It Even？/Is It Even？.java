import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        while (n-- > 0) {
            // num이 2로 나누어떨어지는 횟수를 cnt에 누적시키고
            // cnt가 k보다 크거나 같으면 이 문제는 성립되는것이다.
            int num = sc.nextInt();

            while (num % 2 == 0) {
                num /= 2;
                cnt++;
            }
        }

        System.out.println(cnt >= k ? 1 : 0);
        sc.close();
    }
}