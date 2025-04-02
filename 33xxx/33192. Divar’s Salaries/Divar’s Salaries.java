import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();   // 기본급여
            int k = sc.nextInt();   // 총근무시간
            int h = sc.nextInt();   // 공휴일 근무시간

            int money = 0;

            money += h * (2 * x);
            k -= h;
            if(k <= 140) money += k * x;
            else {
                money += 140 * x;
                k -= 140;

                money += k * (1.5 * x);
            }

            System.out.println(String.format("%,d", money));
        }
        sc.close();
    }
}